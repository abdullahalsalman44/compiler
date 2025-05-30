package AST;

import java.util.ArrayList;
import java.util.List;

public class NgModuleAttributes {
    List<NgModuleAttribute> ngModuleAttribute = new ArrayList<>();

    public List<NgModuleAttribute> getAttributes() {
        return ngModuleAttribute;
    }

    public void setAttributes(List<NgModuleAttribute> attributes) {
        this.ngModuleAttribute = attributes;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" NgModule Body = { ");
        if (ngModuleAttribute != null) {
            for (NgModuleAttribute b : ngModuleAttribute) {
                if (b != null) {
                    sb.append(b).append(",");
                }

            }
        }
        sb.append("}").append('\n');
        return sb.toString();
    }
}
