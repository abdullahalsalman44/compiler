package AST;

public class Imports {
    String imports;
    String Colon;
    ArrayLiteral arrayLiteral;

    public String getImports() {
        return imports;
    }

    public void setImports(String imports) {
        this.imports = imports;
    }

    public String getColon() {
        return Colon;
    }

    public void setColon(String colon) {
        Colon = colon;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (arrayLiteral != null) {
            // Remove the declarations/imports/exports label here
            // Just return the array literal content
            sb.append(arrayLiteral.toString());
        }
        return sb.toString();
    }}
