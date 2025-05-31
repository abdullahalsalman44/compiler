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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("- Attributes:\n");
        if (ngModuleAttribute != null) {
            for (NgModuleAttribute attr : ngModuleAttribute) {
                sb.append(attr.toString());
            }
        }
        return sb.toString();
    }
}

