package AST;

public class BootstrapDeclaration {
    String bootstrap;
    String Colon;
    ArrayLiteral arrayLiteral;

    public String getBootstrap() {
        return bootstrap;
    }

    public void setBootstrap(String bootstrap) {
        this.bootstrap = bootstrap;
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

        if (bootstrap != null) {
            sb.append(bootstrap);
        }
        if (Colon != null) {
            sb.append(Colon);
        }
        if (arrayLiteral != null) {
            sb.append(arrayLiteral);
        }

        return sb.toString();
    }
}
