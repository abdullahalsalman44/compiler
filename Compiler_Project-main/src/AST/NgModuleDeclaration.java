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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NgModuleDeclaration");
        if (name != null) sb.append(" ").append(name);
        if (ngModuleAttributes != null) sb.append(" ").append(ngModuleAttributes);
        return sb.toString();
    }


}

