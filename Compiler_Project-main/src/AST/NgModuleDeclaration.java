package AST;

public class NgModuleDeclaration {


    NgModuleAttributes ngModuleAttributes;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public NgModuleAttributes getAttributes() {
        return ngModuleAttributes;
    }

    public void setAttributes(NgModuleAttributes attributes) {
        this.ngModuleAttributes = attributes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("- Name: ").append(name != null ? name : "anonymous").append("\n");
        if (ngModuleAttributes != null) {
            sb.append(ngModuleAttributes.toString());
        }
        return sb.toString();
    }

}

