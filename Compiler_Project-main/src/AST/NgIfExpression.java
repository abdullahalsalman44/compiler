package AST;

public class NgIfExpression {
    String varmod;
    String of;
    private Expression condition;

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

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "ngIfExpression{" +
                "varmod='" + varmod + '\'' +
                ", of='" + of + '\'' +
                '}';
    }
}
