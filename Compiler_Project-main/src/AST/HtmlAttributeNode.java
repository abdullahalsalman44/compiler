package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttributeNode  {
     String attributeName;
     HtmlAttributeValueNode attributeValue;
    private List<Expression> expressions= new ArrayList<Expression>();
    Directive directive;

    public void setDirective(Directive directive) {
        this.directive = directive;
    }

    public Directive getDirective() {
        return directive;
    }


    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public HtmlAttributeValueNode getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(HtmlAttributeValueNode attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("attributeName : ");
        if (attributeName != null) {
           sb.append(attributeName   );
        }

        sb.append("   attributeValue : ");
        if (attributeValue != null) {
            sb.append(attributeValue );
        }
        for (int i = 0; i < expressions.size(); i++) {
            if (i > 0) {
                sb.append(" , ");
            }
            sb.append(expressions.get(i));
        }
        if (directive != null) {
            sb.append(directive );
        }
        return sb.toString();
    }
}
