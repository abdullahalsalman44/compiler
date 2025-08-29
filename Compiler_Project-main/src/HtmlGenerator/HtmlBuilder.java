package HtmlGenerator;

import AST.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HtmlBuilder {
    private StringBuilder htmlContent;
    private StringBuilder cssContent;
    private StringBuilder jsContent;

    public HtmlBuilder() {
        this.htmlContent = new StringBuilder();
        this.cssContent = new StringBuilder();
        this.jsContent = new StringBuilder();
    }

    public void buildFromProgram(Program program, String testFilePath) {
        // بدء صفحة HTML
        htmlContent.append("<!DOCTYPE html>\n");
        htmlContent.append("<html lang=\"ar\" dir=\"rtl\">\n");
        htmlContent.append("<head>\n");
        htmlContent.append("    <meta charset=\"UTF-8\">\n");
        htmlContent.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        htmlContent.append("    <title>Angular Component Preview</title>\n");
        htmlContent.append("    <style>\n");

        // إضافة CSS أساسي
        addDefaultCSS();

        // معالجة المكونات
        if (program.getSourceElement() != null) {
            for (Statment statement : program.getSourceElement()) {
                if (statement.getComponentDeclaration() != null) {
                    processComponent(statement.getComponentDeclaration());
                }
            }
        }

        // إضافة CSS
        htmlContent.append(cssContent.toString());

        // استبدال جميع الأنماط CSS بالأنماط من ملف الاختبار


        htmlContent.append("    </style>\n");
        htmlContent.append("</head>\n");
        htmlContent.append("<body>\n");

        // إضافة محتوى HTML الأساسي
        addDefaultHTML();

        // إضافة JavaScript
        htmlContent.append("    <script>\n");

        // معالجة البيانات من ملف الاختبار
        if (testFilePath != null) {
            try {
                String testContent = new String(Files.readAllBytes(Paths.get(testFilePath)));
                List<DataProcessor.Product> products = DataProcessor.extractProductsFromTestFile(testContent);
                jsContent.append(DataProcessor.generateJavaScriptData(products));
            } catch (IOException e) {
                System.err.println("خطأ في قراءة ملف الاختبار: " + e.getMessage());
                // استخدام بيانات تجريبية
                List<DataProcessor.Product> defaultProducts = DataProcessor.extractProductsFromTestFile("");
                jsContent.append(DataProcessor.generateJavaScriptData(defaultProducts));
            }
        }

        htmlContent.append(jsContent.toString());

        // إضافة JavaScript للتحكم في الأنماط ديناميكياً
        addDynamicStyleJavaScript();

        htmlContent.append("    </script>\n");
        htmlContent.append("</body>\n");
        htmlContent.append("</html>");
    }

    private void processComponent(ComponentDeclaration component) {
        if (component.getTemplate() != null) {
            processTemplate(component.getTemplate());
        }

        if (component.getStyles() != null) {
            processStyles(component.getStyles());
        }

        if (component.getComponentAttributes() != null) {
            processComponentAttributes(component.getComponentAttributes());
        }
    }

    private void processTemplate(Template template) {
        if (template.getHtmlElements() != null) {
            processHtmlElements(template.getHtmlElements());
        }
    }

    private void processHtmlElements(HtmlElementsNode htmlElements) {
        if (htmlElements.getHtmlElements() != null) {
            for (HtmlElementNode element : htmlElements.getHtmlElements()) {
                processHtmlElement(element);
            }
        }
    }

    private void processHtmlElement(HtmlElementNode element) {
        StringBuilder elementHtml = new StringBuilder();

        // بدء العنصر
        elementHtml.append("<").append(element.getTagName());

        // إضافة الخصائص
        if (element.getHtmlAttributes() != null) {
            for (HtmlAttributeNode attr : element.getHtmlAttributes()) {
                elementHtml.append(" ").append(attr.getName());
                if (attr.getHtmlAttributeValue() != null) {
                    elementHtml.append("=\"").append(attr.getHtmlAttributeValue().getValue()).append("\"");
                }
            }
        }

        elementHtml.append(">");

        // معالجة المحتوى
        if (element.getHtmlContent() != null) {
            for (HtmlContentNode content : element.getHtmlContent()) {
                processHtmlContent(content, elementHtml);
            }
        }

        // إغلاق العنصر
        elementHtml.append("</").append(element.getTagName()).append(">");

        htmlContent.append(elementHtml.toString());
    }

    private void processHtmlContent(HtmlContentNode content, StringBuilder elementHtml) {
           if (content.getText() != null) {
            elementHtml.append(content.getText());
        } else if (content.getMustachExpression() != null) {
            processMustacheExpression(content.getMustachExpression(), elementHtml);
        } else if (content.getNgForExpression() != null) {
            processNgFor(content.getNgForExpression());
        } else if (content.getNgIfExpression() != null) {
            processNgIf(content.getNgIfExpression());
        } else if (content.getExpContent() != null && !content.getExpContent().isEmpty()) {
            // معالجة التعبيرات الأخرى
            for (Expression expr : content.getExpContent()) {
                elementHtml.append(processExpression(expr));
            }
        }
    }

    private void processMustacheExpression(MustachExpression mustache, StringBuilder elementHtml) {
        if (mustache.getExpression() != null) {
            String expression = mustache.getExpression().toString();
            elementHtml.append("{{ ").append(expression).append(" }}");
        }
    }

    private String processExpression(Expression expr) {
        if (expr == null) return "";

        // معالجة أنواع مختلفة من التعبيرات
        if (expr.getLiteralExpression() != null) {
            return expr.getLiteralExpression().getValue();
        } else if (expr.getIdentifier() != null) {
            return expr.getIdentifier();
        } else if (expr.getLeft() != null && expr.getRight() != null) {
            return processDotExpression(expr);
        } else if (expr.getObjectLiteral() != null) {
            return expr.getObjectLiteral().toString();
        } else if (expr.getArrayLiteral() != null) {
            return expr.getArrayLiteral().toString();
        }

        return expr.toString();
    }

    private String processDotExpression(Expression dotExpr) {
        if (dotExpr.getLeft() != null && dotExpr.getRight() != null) {
            return processExpression(dotExpr.getLeft()) + "." + processExpression(dotExpr.getRight());
        }
        return dotExpr.toString();
    }

    private void processNgFor(NgForExpression ngFor) {
        // تحويل *ngFor إلى JavaScript ديناميكي
        String variable = ngFor.getVariable();
        String array = ngFor.getArray();

        if (variable != null && array != null) {
            jsContent.append("        // معالجة *ngFor: let ").append(variable).append(" of ").append(array).append("\n");
            jsContent.append("        function renderNgFor").append(array).append("() {\n");
            jsContent.append("            const container = document.querySelector('[data-ngfor=\"").append(array).append("\"]');\n");
            jsContent.append("            if (!container) return;\n");
            jsContent.append("            container.innerHTML = '';\n");
            jsContent.append("            ").append(array).append(".forEach(").append(variable).append(" => {\n");
            jsContent.append("                const itemDiv = document.createElement('div');\n");
            jsContent.append("                itemDiv.className = 'ngfor-item';\n");
            jsContent.append("                itemDiv.innerHTML = generateItemContent(").append(variable).append(");\n");
            jsContent.append("                container.appendChild(itemDiv);\n");
            jsContent.append("            });\n");
            jsContent.append("        }\n");
            jsContent.append("        \n");
            jsContent.append("        function generateItemContent(item) {\n");
            jsContent.append("            return `<div class='item'>\n");
            jsContent.append("                <h4>${item.name || item.title || 'Item'}</h4>\n");
            jsContent.append("                ${item.image ? `<img src='${item.image}' alt='Item Image' class='item-image' />` : ''}\n");
            jsContent.append("                ${item.details ? `<p>${item.details}</p>` : ''}\n");
            jsContent.append("            </div>`;\n");
            jsContent.append("        }\n");
            jsContent.append("        \n");
            jsContent.append("        // استدعاء دالة التوليد\n");
            jsContent.append("        renderNgFor").append(array).append("();\n");
        }
    }

    private void processNgIf(NgIfExpression ngIf) {
        // تحويل *ngIf إلى JavaScript ديناميكي
        String condition = "";
        if (ngIf.getCondition() != null) {
            condition = processExpression(ngIf.getCondition());
        } else if (ngIf.getVarmod() != null) {
            condition = ngIf.getVarmod();
        }

        if (!condition.isEmpty()) {
            jsContent.append("        // معالجة *ngIf: ").append(condition).append("\n");
            jsContent.append("        function checkNgIf").append(condition.replaceAll("[^a-zA-Z0-9]", "")).append("() {\n");
            jsContent.append("            const condition = ").append(condition).append(";\n");
            jsContent.append("            const element = document.querySelector('[data-ngif=\"").append(condition).append("\"]');\n");
            jsContent.append("            if (element) {\n");
            jsContent.append("                element.style.display = condition ? 'block' : 'none';\n");
            jsContent.append("            }\n");
            jsContent.append("        }\n");
            jsContent.append("        \n");
            jsContent.append("        // استدعاء دالة التحقق\n");
            jsContent.append("        checkNgIf").append(condition.replaceAll("[^a-zA-Z0-9]", "")).append("();\n");
        }
    }

    private void processStyles(Styles styles) {
        cssContent.append("        /* أنماط من AST - كما هي */\n");

        if (styles.getStyleContent() != null) {
            for (StyleContent style : styles.getStyleContent()) {
                String cssContent = style.getCssContent();
                if (cssContent != null && !cssContent.isEmpty()) {
                    // إضافة الأنماط كما هي بدون تعديل
                    this.cssContent.append("        ").append(cssContent).append("\n");

                    // تحديث متغيرات CSS بناءً على الأنماط الجديدة (اختياري)
                    updateCSSVariablesFromStyles(cssContent);
                }
            }
        }

        // إضافة CSS ديناميكي للعناصر المولدة
        addDynamicCSS();

        // إضافة أنماط ديناميكية إضافية
        addAdvancedDynamicStyles();

        // إضافة CSS للتحكم في الأنماط
        addStyleControlCSS();

        // إضافة أنماط مخصصة من ملف الاختبار
        // سيتم استدعاؤها لاحقاً مع testFilePath
    }

    private String makeStylesDynamic(String originalCSS) {
        // تحويل CSS ثابت إلى CSS ديناميكي باستخدام متغيرات CSS
        String dynamicCSS = originalCSS;

        // استخراج القيم من CSS الأصلي وتحديث متغيرات CSS

        // إضافة تأثيرات hover ديناميكية
        if (dynamicCSS.contains(".product")) {
            dynamicCSS += "\n        .product:hover {\n";
            dynamicCSS += "            border-color: var(--hover-color);\n";
            dynamicCSS += "            transform: translateY(var(--hover-transform));\n";
            dynamicCSS += "            box-shadow: var(--hover-shadow);\n";
            dynamicCSS += "        }\n";
        }

        return dynamicCSS;
    }



    private void updateCSSVariable(String variableName, String value) {
        // تحديث متغير CSS في :root
        String currentCSS = cssContent.toString();
        String pattern = variableName + ": [^;]+;";
        String replacement = variableName + ": " + value + ";";

        if (currentCSS.contains(variableName + ":")) {
            // تحديث القيمة الموجودة
            currentCSS = currentCSS.replaceAll(pattern, replacement);
            cssContent.setLength(0);
            cssContent.append(currentCSS);
        }
    }

    private void updateCSSVariablesFromStyles(String cssContent) {
        // استخراج الألوان من CSS المحدث
        if (cssContent.contains("border:") && cssContent.contains("#")) {
            // البحث عن لون الحدود
            java.util.regex.Pattern borderPattern = java.util.regex.Pattern.compile("border:\\s*[^#]*#([a-fA-F0-9]{3,6})");
            java.util.regex.Matcher borderMatcher = borderPattern.matcher(cssContent);
            if (borderMatcher.find()) {
                String borderColor = "#" + borderMatcher.group(1);
                updateCSSVariable("--border-color", borderColor);
                System.out.println("تم تحديث لون الحدود إلى: " + borderColor);
            }
        }

        // البحث عن ألوان أخرى
        if (cssContent.contains("background-color:") && cssContent.contains("#")) {
            java.util.regex.Pattern bgPattern = java.util.regex.Pattern.compile("background-color:\\s*#([a-fA-F0-9]{3,6})");
            java.util.regex.Matcher bgMatcher = bgPattern.matcher(cssContent);
            if (bgMatcher.find()) {
                String bgColor = "#" + bgMatcher.group(1);
                updateCSSVariable("--container-bg", bgColor);
                System.out.println("تم تحديث لون الخلفية إلى: " + bgColor);
            }
        }

        // البحث عن قيم أخرى
        if (cssContent.contains("border-radius:")) {
            java.util.regex.Pattern radiusPattern = java.util.regex.Pattern.compile("border-radius:\\s*([0-9]+)px");
            java.util.regex.Matcher radiusMatcher = radiusPattern.matcher(cssContent);
            if (radiusMatcher.find()) {
                String radius = radiusMatcher.group(1) + "px";
                updateCSSVariable("--border-radius", radius);
                System.out.println("تم تحديث نصف قطر الحدود إلى: " + radius);
            }
        }

        if (cssContent.contains("padding:")) {
            java.util.regex.Pattern paddingPattern = java.util.regex.Pattern.compile("padding:\\s*([0-9]+)px");
            java.util.regex.Matcher paddingMatcher = paddingPattern.matcher(cssContent);
            if (paddingMatcher.find()) {
                String padding = paddingMatcher.group(1) + "px";
                updateCSSVariable("--spacing-medium", padding);
                System.out.println("تم تحديث المساحة الداخلية إلى: " + padding);
            }
        }
    }

    private void addAdvancedDynamicStyles() {
        cssContent.append("        \n");
        cssContent.append("        /* أنماط ديناميكية متقدمة */\n");
        cssContent.append("        .dynamic-grid {\n");
        cssContent.append("            display: grid;\n");
        cssContent.append("            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));\n");
        cssContent.append("            gap: 20px;\n");
        cssContent.append("            padding: 20px;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .dynamic-flex {\n");
        cssContent.append("            display: flex;\n");
        cssContent.append("            flex-wrap: wrap;\n");
        cssContent.append("            gap: 15px;\n");
        cssContent.append("            align-items: center;\n");
        cssContent.append("            justify-content: center;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .dynamic-gradient {\n");
        cssContent.append("            background: linear-gradient(135deg, var(--primary-color), var(--info-color));\n");
        cssContent.append("            color: white;\n");
        cssContent.append("            padding: 20px;\n");
        cssContent.append("            border-radius: var(--border-radius);\n");
        cssContent.append("            text-align: center;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .dynamic-shadow {\n");
        cssContent.append("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1), 0 1px 3px rgba(0, 0, 0, 0.08);\n");
        cssContent.append("            transition: box-shadow 0.3s ease;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .dynamic-shadow:hover {\n");
        cssContent.append("            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.15), 0 4px 10px rgba(0, 0, 0, 0.1);\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .dynamic-border {\n");
        cssContent.append("            border: 2px solid transparent;\n");
        cssContent.append("            background: linear-gradient(white, white) padding-box,\n");
        cssContent.append("                        linear-gradient(45deg, var(--primary-color), var(--success-color)) border-box;\n");
        cssContent.append("            border-radius: var(--border-radius);\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        /* أنماط حالة ديناميكية */\n");
        cssContent.append("        .dynamic-state-loading {\n");
        cssContent.append("            opacity: 0.7;\n");
        cssContent.append("            pointer-events: none;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .dynamic-state-error {\n");
        cssContent.append("            border-color: var(--danger-color);\n");
        cssContent.append("            background-color: rgba(220, 53, 69, 0.1);\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .dynamic-state-success {\n");
        cssContent.append("            border-color: var(--success-color);\n");
        cssContent.append("            background-color: rgba(40, 167, 69, 0.1);\n");
        cssContent.append("        }\n");
    }

    private void addDynamicCSS() {
        cssContent.append("        /* CSS ديناميكي للعناصر المولدة */\n");
        cssContent.append("        .ngfor-item {\n");
        cssContent.append("            border: 1px solid #ddd;\n");
        cssContent.append("            border-radius: 8px;\n");
        cssContent.append("            padding: 15px;\n");
        cssContent.append("            margin-bottom: 10px;\n");
        cssContent.append("            background-color: #fff;\n");
        cssContent.append("            transition: all 0.3s ease;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .ngfor-item:hover {\n");
        cssContent.append("            border-color: #007bff;\n");
        cssContent.append("            transform: translateY(-2px);\n");
        cssContent.append("            box-shadow: 0 4px 15px rgba(0, 123, 255, 0.2);\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .item {\n");
        cssContent.append("            display: flex;\n");
        cssContent.append("            flex-direction: column;\n");
        cssContent.append("            align-items: center;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .item-image {\n");
        cssContent.append("            width: 100%;\n");
        cssContent.append("            max-width: 200px;\n");
        cssContent.append("            height: auto;\n");
        cssContent.append("            border-radius: 5px;\n");
        cssContent.append("            margin-top: 10px;\n");
        cssContent.append("        }\n");

        // إضافة CSS ديناميكي مع متغيرات CSS
        addDynamicCSSVariables();

        // إضافة توابع CSS ديناميكية
        addDynamicCSSFunctions();
    }

    private void addDynamicCSSVariables() {
        cssContent.append("        \n");
        cssContent.append("        /* متغيرات CSS ديناميكية */\n");
        cssContent.append("        :root {\n");
        cssContent.append("            --primary-color: #007bff;\n");
        cssContent.append("            --secondary-color: #6c757d;\n");
        cssContent.append("            --success-color: #28a745;\n");
        cssContent.append("            --danger-color: #dc3545;\n");
        cssContent.append("            --warning-color: #ffc107;\n");
        cssContent.append("            --info-color: #17a2b8;\n");
        cssContent.append("            --light-color: #f8f9fa;\n");
        cssContent.append("            --dark-color: #343a40;\n");
        cssContent.append("            --border-radius: 8px;\n");
        cssContent.append("            --box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n");
        cssContent.append("            --transition: all 0.3s ease;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        /* أنماط ديناميكية باستخدام المتغيرات */\n");
        cssContent.append("        .dynamic-card {\n");
        cssContent.append("            background: var(--light-color);\n");
        cssContent.append("            border: 1px solid var(--primary-color);\n");
        cssContent.append("            border-radius: var(--border-radius);\n");
        cssContent.append("            box-shadow: var(--box-shadow);\n");
        cssContent.append("            transition: var(--transition);\n");
        cssContent.append("            padding: 20px;\n");
        cssContent.append("            margin: 10px;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .dynamic-card:hover {\n");
        cssContent.append("            transform: translateY(-5px);\n");
        cssContent.append("            box-shadow: 0 8px 25px rgba(0, 123, 255, 0.3);\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .dynamic-button {\n");
        cssContent.append("            background: var(--primary-color);\n");
        cssContent.append("            color: white;\n");
        cssContent.append("            border: none;\n");
        cssContent.append("            border-radius: var(--border-radius);\n");
        cssContent.append("            padding: 10px 20px;\n");
        cssContent.append("            cursor: pointer;\n");
        cssContent.append("            transition: var(--transition);\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .dynamic-button:hover {\n");
        cssContent.append("            background: #0056b3;\n");
        cssContent.append("            transform: scale(1.05);\n");
        cssContent.append("        }\n");
    }

    private void addDynamicCSSFunctions() {
        cssContent.append("        \n");
        cssContent.append("        /* توابع CSS ديناميكية */\n");
        cssContent.append("        @keyframes fadeIn {\n");
        cssContent.append("            from { opacity: 0; transform: translateY(20px); }\n");
        cssContent.append("            to { opacity: 1; transform: translateY(0); }\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        @keyframes slideIn {\n");
        cssContent.append("            from { transform: translateX(-100%); }\n");
        cssContent.append("            to { transform: translateX(0); }\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        @keyframes pulse {\n");
        cssContent.append("            0% { transform: scale(1); }\n");
        cssContent.append("            50% { transform: scale(1.05); }\n");
        cssContent.append("            100% { transform: scale(1); }\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .animate-fade-in {\n");
        cssContent.append("            animation: fadeIn 0.5s ease-in-out;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .animate-slide-in {\n");
        cssContent.append("            animation: slideIn 0.3s ease-out;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .animate-pulse {\n");
        cssContent.append("            animation: pulse 2s infinite;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        /* أنماط متجاوبة ديناميكية */\n");
        cssContent.append("        @media (max-width: 768px) {\n");
        cssContent.append("            .container {\n");
        cssContent.append("                flex-direction: column;\n");
        cssContent.append("                padding: 10px;\n");
        cssContent.append("            }\n");
        cssContent.append("            \n");
        cssContent.append("            .product-list, .product-detail {\n");
        cssContent.append("                min-width: auto;\n");
        cssContent.append("            }\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        @media (max-width: 480px) {\n");
        cssContent.append("            .dynamic-card {\n");
        cssContent.append("                padding: 15px;\n");
        cssContent.append("                margin: 5px;\n");
        cssContent.append("            }\n");
        cssContent.append("        }\n");
    }

    private void processComponentAttributes(ComponentAttributes attributes) {
        if (attributes.getComponentAttributes() != null) {
            for (ComponentAttribute attr : attributes.getComponentAttributes()) {
                processComponentAttribute(attr);
            }
        }
    }

    private void processComponentAttribute(ComponentAttribute attr) {
        String attrName = attr.getName();

        switch (attrName) {
            case "selector":
                processSelectorAttribute(attr);
                break;
            case "template":
                processTemplateAttribute(attr);
                break;
            case "styles":
                processStylesAttribute(attr);
                break;
            case "imports":
                processImportsAttribute(attr);
                break;
            case "standalone":
                processStandaloneAttribute(attr);
                break;
            default:
                // معالجة الخصائص الأخرى
                jsContent.append("        // معالجة خاصية: ").append(attrName).append("\n");
                break;
        }
    }

    private void processSelectorAttribute(ComponentAttribute attr) {
        if (attr.getSelector() != null) {
            String selector = attr.getSelector().toString();
            jsContent.append("        // معالج selector: ").append(selector).append("\n");
            jsContent.append("        document.addEventListener('DOMContentLoaded', function() {\n");
            jsContent.append("            const component = document.querySelector('").append(selector).append("');\n");
            jsContent.append("            if (component) {\n");
            jsContent.append("                console.log('تم العثور على المكون: ").append(selector).append("');\n");
            jsContent.append("            }\n");
            jsContent.append("        });\n");
        }
    }

    private void processTemplateAttribute(ComponentAttribute attr) {
        if (attr.getTemplate() != null) {
            jsContent.append("        // معالج template\n");
            jsContent.append("        function renderTemplate() {\n");
            jsContent.append("            // سيتم تنفيذ القالب هنا\n");
            jsContent.append("        }\n");
        }
    }

    private void processStylesAttribute(ComponentAttribute attr) {
        if (attr.getStyles() != null) {
            jsContent.append("        // معالج styles\n");
            jsContent.append("        function applyStyles() {\n");
            jsContent.append("            // تطبيق الأنماط\n");
            jsContent.append("        }\n");
        }
    }

    private void processImportsAttribute(ComponentAttribute attr) {
        if (attr.getImports() != null) {
            jsContent.append("        // معالج imports\n");
            jsContent.append("        // استيراد الوحدات المطلوبة\n");
        }
    }

    private void processStandaloneAttribute(ComponentAttribute attr) {
        if (attr.getStandalone() != null) {
            jsContent.append("        // معالج standalone\n");
            jsContent.append("        // مكون مستقل\n");
        }
    }

    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(htmlContent.toString());
            System.out.println("تم حفظ صفحة HTML في: " + filename);
        } catch (IOException e) {
            System.err.println("خطأ في حفظ الملف: " + e.getMessage());
        }
    }

    public String getHtmlContent() {
        return htmlContent.toString();
    }



    private void addDefaultCSS() {
        // إضافة أنماط CSS أساسية - ستتم استبدالها بالأنماط من ملف الاختبار
        cssContent.append("        /* أنماط CSS أساسية - ستتم استبدالها */\n");
        cssContent.append("        body {\n");
        cssContent.append("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
        cssContent.append("            margin: 0;\n");
        cssContent.append("            padding: 20px;\n");
        cssContent.append("            background-color: #f5f5f5;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .container {\n");
        cssContent.append("            display: flex;\n");
        cssContent.append("            flex-wrap: wrap;\n");
        cssContent.append("            padding: 20px;\n");
        cssContent.append("            background-color: #f9f9f9;\n");
        cssContent.append("            border-radius: 8px;\n");
        cssContent.append("            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n");
        cssContent.append("            gap: 20px;\n");
        cssContent.append("            max-width: 1200px;\n");
        cssContent.append("            margin: 0 auto;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .product-list {\n");
        cssContent.append("            flex: 1;\n");
        cssContent.append("            display: flex;\n");
        cssContent.append("            flex-direction: column;\n");
        cssContent.append("            gap: 10px;\n");
        cssContent.append("            min-width: 300px;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        /* الأنماط الأساسية للمنتج - ستتم استبدالها بالأنماط من ملف الاختبار */\n");
        cssContent.append("        .product {\n");
        cssContent.append("            border: 1px solid #ddd;\n");
        cssContent.append("            border-radius: 8px;\n");
        cssContent.append("            padding: 15px;\n");
        cssContent.append("            cursor: pointer;\n");
        cssContent.append("            background-color: #fff;\n");
        cssContent.append("            transition: all 0.3s ease;\n");
        cssContent.append("            display: flex;\n");
        cssContent.append("            flex-direction: column;\n");
        cssContent.append("            align-items: center;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .product:hover {\n");
        cssContent.append("            border-color: #007bff;\n");
        cssContent.append("            transform: translateY(-2px);\n");
        cssContent.append("            box-shadow: 0 4px 15px rgba(0, 123, 255, 0.2);\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .product.selected {\n");
        cssContent.append("            border-color: #007bff;\n");
        cssContent.append("            background-color: #f8f9ff;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .product-image {\n");
        cssContent.append("            width: 100%;\n");
        cssContent.append("            max-width: 200px;\n");
        cssContent.append("            height: auto;\n");
        cssContent.append("            border-radius: 5px;\n");
        cssContent.append("            margin-top: 10px;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .product-detail {\n");
        cssContent.append("            flex: 2;\n");
        cssContent.append("            padding: 20px;\n");
        cssContent.append("            background-color: #fff;\n");
        cssContent.append("            border: 1px solid #007bff;\n");
        cssContent.append("            border-radius: 8px;\n");
        cssContent.append("            min-width: 400px;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .detail-image {\n");
        cssContent.append("            width: 100%;\n");
        cssContent.append("            max-width: 400px;\n");
        cssContent.append("            height: auto;\n");
        cssContent.append("            border-radius: 8px;\n");
        cssContent.append("            margin-bottom: 15px;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        h3 {\n");
        cssContent.append("            margin: 0 0 10px 0;\n");
        cssContent.append("            color: #333;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        h4 {\n");
        cssContent.append("            margin: 0 0 10px 0;\n");
        cssContent.append("            color: #555;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        p {\n");
        cssContent.append("            color: #666;\n");
        cssContent.append("            line-height: 1.6;\n");
        cssContent.append("        }\n");
    }

    private void addDefaultHTML() {
        htmlContent.append("        <div class=\"container\">\n");
        htmlContent.append("            <div class=\"product-list\">\n");
        htmlContent.append("                <!-- سيتم ملء هذا القسم بواسطة JavaScript -->\n");
        htmlContent.append("            </div>\n");
        htmlContent.append("            <div class=\"product-detail\">\n");
        htmlContent.append("                <!-- سيتم ملء هذا القسم بواسطة JavaScript -->\n");
        htmlContent.append("            </div>\n");
        htmlContent.append("        </div>\n");
    }

    private void addDynamicStyleJavaScript() {
        jsContent.append("        \n");
        jsContent.append("        // مكتبة التحكم في الأنماط ديناميكياً\n");
        jsContent.append("        const DynamicStyleManager = {\n");
        jsContent.append("            // تغيير متغيرات CSS\n");
        jsContent.append("            setCSSVariable: function(name, value) {\n");
        jsContent.append("                document.documentElement.style.setProperty(name, value);\n");
        jsContent.append("            },\n");
        jsContent.append("            \n");
        jsContent.append("            // الحصول على متغير CSS\n");
        jsContent.append("            getCSSVariable: function(name) {\n");
        jsContent.append("                return getComputedStyle(document.documentElement).getPropertyValue(name);\n");
        jsContent.append("            },\n");
        jsContent.append("            \n");
        jsContent.append("            // تطبيق نمط ديناميكي\n");
        jsContent.append("            applyStyle: function(element, styleObject) {\n");
        jsContent.append("                Object.assign(element.style, styleObject);\n");
        jsContent.append("            },\n");
        jsContent.append("            \n");
        jsContent.append("            // إضافة كلاس ديناميكي\n");
        jsContent.append("            addClass: function(element, className) {\n");
        jsContent.append("                element.classList.add(className);\n");
        jsContent.append("            },\n");
        jsContent.append("            \n");
        jsContent.append("            // إزالة كلاس ديناميكي\n");
        jsContent.append("            removeClass: function(element, className) {\n");
        jsContent.append("                element.classList.remove(className);\n");
        jsContent.append("            },\n");
        jsContent.append("            \n");
        jsContent.append("            // تبديل كلاس ديناميكي\n");
        jsContent.append("            toggleClass: function(element, className) {\n");
        jsContent.append("                element.classList.toggle(className);\n");
        jsContent.append("            },\n");
        jsContent.append("            \n");
        jsContent.append("            // إنشاء عنصر مع أنماط ديناميكية\n");
        jsContent.append("            createDynamicElement: function(tag, className, styles) {\n");
        jsContent.append("                const element = document.createElement(tag);\n");
        jsContent.append("                if (className) element.className = className;\n");
        jsContent.append("                if (styles) this.applyStyle(element, styles);\n");
        jsContent.append("                return element;\n");
        jsContent.append("            },\n");
        jsContent.append("            \n");
        jsContent.append("            // تطبيق نمط متدرج ديناميكي\n");
        jsContent.append("            applyGradient: function(element, colors) {\n");
        jsContent.append("                const gradient = `linear-gradient(135deg, ${colors.join(', ')})`;\n");
        jsContent.append("                element.style.background = gradient;\n");
        jsContent.append("            },\n");
        jsContent.append("            \n");
        jsContent.append("            // تطبيق ظل ديناميكي\n");
        jsContent.append("            applyShadow: function(element, shadow) {\n");
        jsContent.append("                element.style.boxShadow = shadow;\n");
        jsContent.append("            },\n");
        jsContent.append("            \n");
        jsContent.append("            // تطبيق انيميشن ديناميكي\n");
        jsContent.append("            applyAnimation: function(element, animationName, duration = '0.5s') {\n");
        jsContent.append("                element.style.animation = `${animationName} ${duration} ease-in-out`;\n");
        jsContent.append("            }\n");
        jsContent.append("        };\n");
        jsContent.append("        \n");
        jsContent.append("        // دوال مساعدة للأنماط\n");
        jsContent.append("        function createDynamicCard(content, styles = {}) {\n");
        jsContent.append("            const card = DynamicStyleManager.createDynamicElement('div', 'dynamic-card', styles);\n");
        jsContent.append("            card.innerHTML = content;\n");
        jsContent.append("            return card;\n");
        jsContent.append("        }\n");
        jsContent.append("        \n");
        jsContent.append("        function createDynamicButton(text, onClick, styles = {}) {\n");
        jsContent.append("            const button = DynamicStyleManager.createDynamicElement('button', 'dynamic-button', styles);\n");
        jsContent.append("            button.textContent = text;\n");
        jsContent.append("            if (onClick) button.onclick = onClick;\n");
        jsContent.append("            return button;\n");
        jsContent.append("        }\n");
        jsContent.append("        \n");
        jsContent.append("        // تطبيق أنماط ديناميكية عند تحميل الصفحة\n");
        jsContent.append("        document.addEventListener('DOMContentLoaded', function() {\n");
        jsContent.append("            // تطبيق انيميشن على العناصر الموجودة\n");
        jsContent.append("            const elements = document.querySelectorAll('.product, .product-detail');\n");
        jsContent.append("            elements.forEach((element, index) => {\n");
        jsContent.append("                setTimeout(() => {\n");
        jsContent.append("                    DynamicStyleManager.addClass(element, 'animate-fade-in');\n");
        jsContent.append("                }, index * 100);\n");
        jsContent.append("            });\n");
        jsContent.append("            \n");
        jsContent.append("            // إضافة أزرار للتحكم في الأنماط\n");
        jsContent.append("            addStyleControls();\n");
        jsContent.append("        });\n");
        jsContent.append("        \n");
        jsContent.append("        function addStyleControls() {\n");
        jsContent.append("            const controls = document.createElement('div');\n");
        jsContent.append("            controls.className = 'style-controls';\n");
        jsContent.append("            \n");
        jsContent.append("            const themes = [\n");
        jsContent.append("                { name: 'أزرق', primary: '#007bff' },\n");
        jsContent.append("                { name: 'أخضر', primary: '#28a745' },\n");
        jsContent.append("                { name: 'أحمر', primary: '#dc3545' },\n");
        jsContent.append("                { name: 'بنفسجي', primary: '#6f42c1' }\n");
        jsContent.append("            ];\n");
        jsContent.append("            \n");
        jsContent.append("            themes.forEach(theme => {\n");
        jsContent.append("                const button = createDynamicButton(theme.name, () => {\n");
        jsContent.append("                    DynamicStyleManager.setCSSVariable('--primary-color', theme.primary);\n");
        jsContent.append("                }, { margin: '5px', fontSize: '12px' });\n");
        jsContent.append("                controls.appendChild(button);\n");
        jsContent.append("            });\n");
        jsContent.append("            \n");
        jsContent.append("            document.body.appendChild(controls);\n");
        jsContent.append("        }\n");
    }

    private void addStyleControlCSS() {
        cssContent.append("        \n");
        cssContent.append("        /* أدوات تحكم في الأنماط */\n");
        cssContent.append("        .style-controls {\n");
        cssContent.append("            position: fixed;\n");
        cssContent.append("            top: 20px;\n");
        cssContent.append("            right: 20px;\n");
        cssContent.append("            background: white;\n");
        cssContent.append("            border: 1px solid var(--border-color);\n");
        cssContent.append("            border-radius: var(--border-radius);\n");
        cssContent.append("            padding: 15px;\n");
        cssContent.append("            box-shadow: var(--box-shadow);\n");
        cssContent.append("            z-index: 1000;\n");
        cssContent.append("            min-width: 250px;\n");
        cssContent.append("        }\n");

        // إضافة أنماط مخصصة للمنتج بناءً على الأنماط المحدثة
        addCustomProductStyles();
    }

    private void addCustomProductStyles() {
        cssContent.append("        \n");
        cssContent.append("        /* أنماط مخصصة للمنتج من ملف الاختبار */\n");
        cssContent.append("        .product {\n");
        cssContent.append("            border: 1px solid var(--border-color);\n");
        cssContent.append("            border-radius: var(--border-radius);\n");
        cssContent.append("            padding: var(--spacing-medium);\n");
        cssContent.append("            cursor: pointer;\n");
        cssContent.append("            background-color: var(--white-color);\n");
        cssContent.append("            transition: var(--transition);\n");
        cssContent.append("            display: flex;\n");
        cssContent.append("            flex-direction: column;\n");
        cssContent.append("            align-items: center;\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .product:hover {\n");
        cssContent.append("            border-color: var(--primary-color);\n");
        cssContent.append("            transform: var(--hover-transform);\n");
        cssContent.append("            box-shadow: var(--hover-shadow);\n");
        cssContent.append("        }\n");
        cssContent.append("        \n");
        cssContent.append("        .product.selected {\n");
        cssContent.append("            border-color: var(--primary-color);\n");
        cssContent.append("            background-color: var(--selected-bg);\n");
        cssContent.append("        }\n");
    }







} 