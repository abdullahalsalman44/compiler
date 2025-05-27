package AST;

public class NgIfExpression {
    String varmod;
    String of;

    public void setVarmod(String varmod) {
        this.varmod = varmod;
    }

    public void setOf(String of) {
        this.of = of;
    }

    public String getVarmod() {
        return varmod;
    }

    public String getOf() {
        return of;
    }

    @Override
    public String toString() {
        return "ngIfExpression{" +
                "varmod='" + varmod + '\'' +
                ", of='" + of + '\'' +
                '}';
    }
}
