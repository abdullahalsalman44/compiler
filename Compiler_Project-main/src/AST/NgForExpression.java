package AST;

import java.util.ArrayList;
import java.util.List;

public class NgForExpression {
    private String variable;
    private String array;

    public NgForExpression() {}

    public NgForExpression(String variable, String array) {
        this.variable = variable;
        this.array = array;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getArray() {
        return array;
    }

    public void setArray(String array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "*ngFor=\"let " + variable + " of " + array + "\"";
    }
}
