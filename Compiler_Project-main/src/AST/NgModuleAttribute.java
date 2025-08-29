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
        if (declarationsDeclaration != null) {
            sb.append("  * declarations: \n").append(declarationsDeclaration.toString());
        }
        if (imports != null) {
            sb.append("  * imports: \n").append(imports.toString());
        }
        if (exportsDeclaration != null) {
            sb.append("  * exports: \n").append(exportsDeclaration.toString());
        }
        if (providersDeclaration != null) {
            sb.append("  * providers: \n").append(providersDeclaration.toString());
        }
        if (bootstrapDeclaration != null) {
            sb.append("  * bootstrap: \n").append(bootstrapDeclaration.toString());
        }
        return sb.toString();
    }
}







