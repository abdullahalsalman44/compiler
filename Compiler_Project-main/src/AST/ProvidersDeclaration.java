package AST;

public class ProvidersDeclaration {
    String providers;
    String Colon;
    ArrayLiteral arrayLiteral;

    public String getProviders() {
        return providers;
    }

    public void setProviders(String providers) {
        this.providers = providers;
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

        if (providers != null) {
            sb.append(providers);
        }
        if (Colon != null) {
            sb.append(Colon);
        }
        if (arrayLiteral != null) {
            sb.append(arrayLiteral);
        }
        sb.append("i am in poovedddd");

        return sb.toString();
    }
}
