package HtmlGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataProcessor {

    public static class Product {
        private String name;
        private String image;
        private String details;

        public Product(String name, String image, String details) {
            this.name = name;
            this.image = image;
            this.details = details;
        }

        public String getName() { return name; }
        public String getImage() { return image; }
        public String getDetails() { return details; }

        @Override
        public String toString() {
            return String.format("{ name: '%s', image: '%s', details: '%s' }", name, image, details);
        }
    }

    public static List<Product> extractProductsFromTestFile(String testContent) {
        List<Product> products = new ArrayList<>();

        // نمط للبحث عن بيانات المنتجات
        Pattern pattern = Pattern.compile(
            "name:\\s*\"([^\"]+)\",\\s*" +
            "image:\\s*\"([^\"]+)\",\\s*" +
            "details:\\s*\"([^\"]+)\""
        );

        Matcher matcher = pattern.matcher(testContent);

        while (matcher.find()) {
            String name = matcher.group(1);
            String image = matcher.group(2);
            String details = matcher.group(3);

            products.add(new Product(name, image, details));
        }



        return products;
    }

    public static String generateJavaScriptData(List<Product> products) {
        StringBuilder js = new StringBuilder();
        js.append("        const products = [\n");

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            js.append("            ").append(product.toString());
            if (i < products.size() - 1) {
                js.append(",");
            }
            js.append("\n");
        }

        js.append("        ];\n");
        js.append("        let selectedProduct = products[0];\n");
        js.append("        \n");
        js.append("        function selectProduct(product) {\n");
        js.append("            selectedProduct = product;\n");
        js.append("            renderProducts();\n");
        js.append("            renderProductDetail();\n");
        js.append("        }\n");
        js.append("        \n");
        js.append("        function renderProducts() {\n");
        js.append("            const container = document.querySelector('.product-list');\n");
        js.append("            if (!container) return;\n");
        js.append("            container.innerHTML = '';\n");
        js.append("            products.forEach(product => {\n");
        js.append("                const productDiv = document.createElement('div');\n");
        js.append("                productDiv.className = 'product';\n");
        js.append("                if (product === selectedProduct) {\n");
        js.append("                    productDiv.classList.add('selected');\n");
        js.append("                }\n");
        js.append("                productDiv.onclick = () => selectProduct(product);\n");
        js.append("                productDiv.innerHTML = `\n");
        js.append("                    <h4>${product.name}</h4>\n");
        js.append("                    <img src=\"${product.image}\" alt=\"Product Image\" class=\"product-image\" />\n");
        js.append("                `;\n");
        js.append("                container.appendChild(productDiv);\n");
        js.append("            });\n");
        js.append("        }\n");
        js.append("        \n");
        js.append("        function renderProductDetail() {\n");
        js.append("            const detailContainer = document.querySelector('.product-detail');\n");
        js.append("            if (!detailContainer || !selectedProduct) return;\n");
        js.append("            detailContainer.innerHTML = `\n");
        js.append("                <h3>${selectedProduct.name}</h3>\n");
        js.append("                <img src=\"${selectedProduct.image}\" alt=\"Product Image\" class=\"detail-image\" />\n");
        js.append("                <p>${selectedProduct.details}</p>\n");
        js.append("            `;\n");
        js.append("        }\n");
        js.append("        \n");
        js.append("        // تهيئة الصفحة\n");
        js.append("        document.addEventListener('DOMContentLoaded', function() {\n");
        js.append("            renderProducts();\n");
        js.append("            renderProductDetail();\n");
        js.append("        });\n");

        return js.toString();
    }
}