package AST;

public class ExportsDeclaration {
    String exports;
    String Colon;
    ArrayLiteral arrayLiteral;

    public String getExports() {
        return exports;
    }

    public void setExports(String exports) {
        this.exports = exports;
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
        return sb.toString();}}
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//
//        if (exports != null) {
//            sb.append(exports);
//        }
//        if (Colon != null) {
//            sb.append(Colon);
//        }
//        if (arrayLiteral != null) {
//            sb.append(arrayLiteral);
//        }
//
//        return sb.toString();
//    }
