package AST;

public class Directive {
    String directive;


    public void setDirective(String directive) {
        this.directive = directive;
    }

    public String getDirective() {
        return directive;
    }

    @Override
    public String toString() {
        return "Directive{" +
                "directive='" + directive + '\'' +
                '}';
    }
}
