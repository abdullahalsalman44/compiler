package SymbolTable;

public class Row {
    String type;
    String value;
    String attributeValue;

    String moduleName;


    public String getModuleName() {
        return moduleName;
    }


    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getType() {
        return type;
    }
    public boolean belongsToModule(String module) {
        return module != null && module.equals(this.moduleName);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
