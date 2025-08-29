package AST;

public class ComponentDeclaration {

    ComponentAttributes componentAttributes;
    Template template;
    Styles styles;

    public ComponentAttributes getComponentAttributes() {
        return componentAttributes;
    }

    public void setComponentAttributes(ComponentAttributes componentAttributes) {
        this.componentAttributes = componentAttributes;
    }

    public Template getTemplate() {
        return template;
    }

    public Styles getStyles() {
        return styles;
    }

    public void setStyles(Styles styles) {
        this.styles = styles;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

    if(componentAttributes!=null){
        sb.append(componentAttributes);
    }
sb.append("}");
        return sb.toString();
    }
}
