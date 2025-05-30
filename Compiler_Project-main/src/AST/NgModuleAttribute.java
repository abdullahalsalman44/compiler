package AST;

public class NgModuleAttribute {
    Imports imports;
    DeclarationsDeclaration declarationsDeclaration;
    ExportsDeclaration exportsDeclaration;
    ProvidersDeclaration providersDeclaration;
    BootstrapDeclaration bootstrapDeclaration;

    public Imports getImports() {
        return imports;
    }
    public void setImports(Imports imports) {
        this.imports = imports;
    }

    public DeclarationsDeclaration getDeclarationsDeclaration() {
        return declarationsDeclaration;
    }

    public void setDeclarationsDeclaration(DeclarationsDeclaration declarationsDeclaration) {
        this.declarationsDeclaration = declarationsDeclaration;
    }
    public ExportsDeclaration getExportsDeclaration() {
        return exportsDeclaration;
    }

    public void setExportsDeclaration(ExportsDeclaration exportsDeclaration) {
        this.exportsDeclaration = exportsDeclaration;
    }

    public ProvidersDeclaration getProvidersDeclaration() {
        return providersDeclaration;
    }

    public void setProvidersDeclaration(ProvidersDeclaration providersDeclaration) {
        this.providersDeclaration = providersDeclaration;
    }

    public BootstrapDeclaration getBootstrapDeclaration() {
        return bootstrapDeclaration;
    }

    public void setBootstrapDeclaration(BootstrapDeclaration bootstrapDeclaration) {
        this.bootstrapDeclaration = bootstrapDeclaration;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NgModuleAttributes {");
        if (imports != null)
            sb.append("imports Declaration= {").append(imports);

        if (declarationsDeclaration != null)
            sb.append("declarations ={").append(declarationsDeclaration);

        if (exportsDeclaration != null)
            sb.append("exports Declaration= {").append(exportsDeclaration);
        if (providersDeclaration != null)
            sb.append("providers Declaration ={").append(providersDeclaration);
        sb.append("}");
        if (bootstrapDeclaration != null)
            sb.append("bootstrap Declaration ={").append(bootstrapDeclaration);
        sb.append("i am in ngmod atttteeee");
        return sb.toString();
    }
}





