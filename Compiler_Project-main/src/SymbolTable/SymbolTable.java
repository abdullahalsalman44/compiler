package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List <Row> rows = new ArrayList<>();
    private List<String> errors = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }


    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
    public List<String> getErrors() {
        return errors;
    }

    public void addError(String error) {
        errors.add(error);
    }
    public boolean hasModule(String moduleName) {
        for (Row row : rows) {
            if (row.getName().equals(moduleName) && row.getType().equals("MODULE")) {
                return true;
            }
        }
        return false;
    }

    public boolean isInjectable(String name) {
        for (Row row : rows) {
            if (row.getName().equals(name) && row.getType().equals("INJECTABLE")) {
                return true;
            }
        }
        return false;
    }

    public boolean isComponent(String name) {
        for (Row row : rows) {
            if (row.getName().equals(name) && row.getType().equals("COMPONENT")) {
                return true;
            }
        }
        return false;
    }

















public void printyy() {
    System.out.println("Type\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tName\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tValue");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");


    for (int i = 0; i < rows.size(); i++) {
        if (rows.get(i) != null) {
            String type = rows.get(i).getType();
            String value = rows.get(i).getName();
            String attributeValue = rows.get(i).getValue();

            // Adjust the formatting based on the length of type and value
            String formattedType = String.format("%-20s", type);

            String formattedValue = String.format("%-20s", value);

            String formattedAttributeValue = String.format("%-20s", attributeValue);

            if(attributeValue != null){
                System.out.println(formattedType +"\t\t\t"+'|'+"\t\t\t"+ formattedValue +"\t\t\t\t\t\t\t" +'|'+"\t\t\t"+formattedAttributeValue);
            }else {
                System.out.println(formattedType +"\t\t\t"+'|'+"\t\t\t"+ formattedValue+"\t\t\t\t\t\t\t" +'|'+"\t\t\t");
            }
        }
    }
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println();
}

}
