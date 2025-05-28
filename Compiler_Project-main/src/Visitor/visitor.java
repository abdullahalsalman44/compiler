package Visitor;
import AST.*;
import Semantic.SemanticAnalyzer;
import SymbolTable.Row;
import SymbolTable.SymbolTable;
import antler.AngularParser;
import antler.AngularParserBaseVisitor;

public class visitor  extends AngularParserBaseVisitor {
public  SymbolTable symbolTable=new SymbolTable();



    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx){
        Program program = new Program();
        if(ctx.importStatement()!=null)
        {
            program.setImportStatement(visitImportStatement(ctx.importStatement()));
        }
        for (int i = 0; i < ctx.statment().size(); i++) {
            if (ctx.statment(i)!=null)
            {
                program.getSourceElement().add(visitStatment(ctx.statment(i)));
            }
        }
        this.symbolTable.printyy();

        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(this.symbolTable);
        semanticAnalyzer.analyze();
        return program;

    }

    @Override
    public ImportStatmente visitImportStatement(AngularParser.ImportStatementContext ctx)
    { ImportStatmente importStatement = new ImportStatmente ();
        for (int i = 0; i < ctx.importFromBlock().size(); i++) {
            if (ctx.importFromBlock(i)!=null)
            {
                importStatement.getImportFromBlocks().add(visitImportFromBlock(ctx.importFromBlock(i)));
            }
        }
        return importStatement;

    }

    @Override
    public ImportFromBlock visitImportFromBlock(AngularParser.ImportFromBlockContext ctx)
    {
        ImportFromBlock importFromBlock = new ImportFromBlock () ;


        if (ctx.Identifier()!= null){
            importFromBlock.setIdentifier(ctx.Identifier().getText());}
        if (ctx.moduleItems()!=null)
        {
            importFromBlock.setModuleItems(visitModuleItems(ctx.moduleItems()));}

        if (ctx.StringLiteral()!= null){
            importFromBlock.setImportFrom(ctx.StringLiteral().getText());}

        return  importFromBlock;
    }

    @Override
    public ModuleItems visitModuleItems(AngularParser.ModuleItemsContext ctx) {
        ModuleItems moduleItems = new ModuleItems () ;

        if (ctx.Component()!= null)
            moduleItems.setComponent(ctx.Component().getText());

        if (ctx.Identifier(0)!= null)
            moduleItems.setIdentifier1(ctx.Identifier(0).getText());
        if (ctx.Identifier(1)!= null)
            moduleItems.setIdentifier2(ctx.Identifier(1).getText());
        return moduleItems ;
    }


    @Override
    public Statment visitStatment(AngularParser.StatmentContext ctx) {

        Statment statement= new Statment();
        if(ctx.functionDeclaration()!=null)
        {
            statement.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        if(ctx.variableStatement()!=null)
        {
            statement.setVariableStatement(visitVariableStatement(ctx.variableStatement()));
        }
        if(ctx.expressionStatement()!=null)
        {
            statement.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
        }
        if(ctx.componentDeclaration()!=null)
        {
            statement.setComponentDeclaration(visitComponentDeclaration(ctx.componentDeclaration()));
        }
        if(ctx.classDeclaration()!=null)
        {
            statement.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
        }
        return statement;
    }


    @Override
    public ComponentDeclaration visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
ComponentDeclaration componentDeclaration=new ComponentDeclaration();
if(ctx.componentAttributes()!=null){
    componentDeclaration.setComponentAttributes(visitComponentAttributes(ctx.componentAttributes()));
}
return componentDeclaration;
    }

    @Override
    public Template visitTemplateDeclaration(AngularParser.TemplateDeclarationContext ctx) {
        Template template=new Template();
if(ctx.Template()!=null)
{
    template.setTemplate(ctx.Template().getText());
    Row row = new Row();
    row.setType("Template");
    row.setValue(ctx.Template().getText());
    this.symbolTable.getRows().add(row);
}
if(ctx.Colon()!=null){
    template.setColon(ctx.Colon().getText());
}
        if (ctx.htmlElements() != null) {
            template.setHtmlElementsNode(visitHtmlElements(ctx.htmlElements()));
        }
        return template;
    }

    @Override
    public ComponentAttributes visitComponentAttributes(AngularParser.ComponentAttributesContext ctx) {
   ComponentAttributes componentAttributes=new ComponentAttributes();
        for (int i = 0; i < ctx.componentAttribute().size(); i++) {
            if (ctx.componentAttribute(i) != null) {
                componentAttributes.getComponentAttribute().add(visitComponentAttribute(ctx.componentAttribute(i)));
            }
        }
   return componentAttributes;
    }

    @Override
    public ComponentAttribute visitComponentAttribute(AngularParser.ComponentAttributeContext ctx) {
        ComponentAttribute componentAttribute=new ComponentAttribute();
        if(ctx.templateDeclaration()!=null){
            componentAttribute.setTemplate(visitTemplateDeclaration(ctx.templateDeclaration()));

        }
        if(ctx.selectorDeclaration()!=null){
            componentAttribute.setSelector(visitSelectorDeclaration(ctx.selectorDeclaration()));
        }
        if(ctx.standaloneDeclaration()!=null){
            componentAttribute.setStandalone(visitStandaloneDeclaration(ctx.standaloneDeclaration()));
        }
        if(ctx.importsDeclaration()!=null){
            componentAttribute.setImports(visitImportsDeclaration(ctx.importsDeclaration()));
        }
        if(ctx.stylesDeclaration()!=null){
            componentAttribute.setStyles(visitStylesDeclaration(ctx.stylesDeclaration()));
        }

        return componentAttribute;
    }

    @Override
    public HtmlElementsNode visitHtmlElements(AngularParser.HtmlElementsContext ctx) {
        HtmlElementsNode   htmlElementsNode= new HtmlElementsNode();
        for (int i = 0; i < ctx.htmlElement().size(); i++) {
            if (ctx.htmlElement(i) != null) {
                htmlElementsNode.getHtmlElements().add(visitHtmlElement(ctx.htmlElement(i)));
            }
        }
        return htmlElementsNode;
    }

    @Override
    public HtmlElementNode visitHtmlElement(AngularParser.HtmlElementContext ctx)
    {
        HtmlElementNode htmlElementNode= new HtmlElementNode();
        if(ctx.Identifier(0)!= null)
        {
            htmlElementNode.setTagName(ctx.Identifier(0).getText());
        }
        for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
            if (ctx.htmlAttribute(i) != null) {
                htmlElementNode.getAttributes().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
            }

        }
        if (ctx.htmlContent()!=null)
        {
            htmlElementNode.setContent(visitHtmlContent(ctx.htmlContent()));
        }
        if(ctx.Identifier(1)!= null)
        {
            htmlElementNode.setTagNameClose(ctx.Identifier(1).getText());
        }

        return htmlElementNode;

    }
    @Override
    public HtmlAttributeNode visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx) {
        HtmlAttributeNode htmlAttributeNode = new HtmlAttributeNode();

        if (ctx.Identifier() != null) {
            String attributeName = ctx.Identifier().getText();
            htmlAttributeNode.setAttributeName(attributeName);
            boolean attributeNameExists = false;
            for (Row row : this.symbolTable.getRows()) {
                if (row.getType().equals("htmlAttributeName") && row.getValue().equals(attributeName)) {
                    attributeNameExists = true;
                    break;
                }
            }
            if (!attributeNameExists) {
                Row row4 = new Row();
                row4.setType("htmlAttributeName");
                row4.setValue(attributeName);
                row4.setAttributeValue(ctx.htmlAttributeValue().getText());
                this.symbolTable.getRows().add(row4);
            }
        }

        if(ctx.directive() !=null){
            HtmlAttributeNode htmlAttributeNode1 = new HtmlAttributeNode();
            HtmlAttributeValueNode htmlAttributeValueNode = new HtmlAttributeValueNode();
            Directive directive = new Directive();

            directive.setDirective(ctx.directive().getText());
            htmlAttributeNode1.setDirective(directive);

            htmlAttributeValueNode.setValue(ctx.htmlAttributeValue().getText());
            htmlAttributeNode1.setAttributeValue(htmlAttributeValueNode);

            Row row = new Row();
            row.setType("directive");
            row.setValue(directive.getDirective());
            row.setAttributeValue(htmlAttributeNode1.getAttributeValue().getValue());
            this.symbolTable.getRows().add(row);

        }


        if (ctx.htmlAttributeValue() != null) {
            htmlAttributeNode.setAttributeValue(visitHtmlAttributeValue(ctx.htmlAttributeValue()));
        }
        if (ctx.Class() != null) {
            String attributeName = ctx.Class().getText();
            htmlAttributeNode.setAttributeName(attributeName);
        }
        if (ctx.directive() != null) {
            String attributeName = ctx.directive().getText();
            htmlAttributeNode.setAttributeName(attributeName);
        }



        return htmlAttributeNode;
    }
    @Override
    public HtmlContentNode visitHtmlContent(AngularParser.HtmlContentContext ctx) {
        HtmlContentNode htmlContentNode= new HtmlContentNode();
        for (int i = 0; i < ctx.htmlElement().size(); i++) {
            if (ctx.htmlElement(i) != null) {
                htmlContentNode.getHtmlContent().add(visitHtmlElement(ctx.htmlElement(i)));
            }
        }
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                htmlContentNode.getExpContent().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        return  htmlContentNode;
    }

    @Override
    public HtmlAttributeValueNode visitHtmlAttributeValue(AngularParser.HtmlAttributeValueContext ctx) {
        HtmlAttributeValueNode htmlAttributeValueNode = new HtmlAttributeValueNode();

        if (ctx.StringLiteral() != null) {
            htmlAttributeValueNode.setValue(ctx.StringLiteral().getText());
        }

        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                htmlAttributeValueNode.getExpressions().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }

        return htmlAttributeValueNode;
    }


    @Override
    public Expression visitSingleExpression(AngularParser.SingleExpressionContext ctx) {
        Expression expression = new Expression();

        // Literal
        if (ctx.literal() != null) {
            expression.setLiteralExpression(visitLiteral(ctx.literal()));
            return expression;
        }

        // Array index access
        else if (ctx.indexarray() != null) {
            expression.setIndexArray(visitIndexarray(ctx.indexarray()));
            return expression;
        }

        // Array literal
        else if (ctx.arrayLiteral() != null) {
            expression.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
            return expression;
        }

        // Object literal
        else if (ctx.objectLiteral() != null) {
            expression.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
            return expression;
        }

        // HTML Elements
        else if (ctx.htmlElements() != null) {
            expression.setHtmlElementsNode(visitHtmlElements(ctx.htmlElements()));
            return expression;
        }

        // Identifier
        else if (ctx.Identifier() != null) {
            expression.setIdentifier(ctx.Identifier().getText());
//            System.out.println("Identifier: " + expression.getIdentifier());
            return expression;
        }

        // Mustache expression
        else if (ctx.mustacheExpression() != null) {
            expression.setMustache(visitMustacheExpression(ctx.mustacheExpression()));
            return expression;
        }

        // CSS style content
        else if (ctx.singleExpressionCss() != null) {
            expression.setStyleContent(visitSingleExpressionCss(ctx.singleExpressionCss()));
            return expression;
        }

        // Dot access (e.g., obj.prop)
        if (ctx.singleExpression().size() == 2 && ctx.Dot() != null) {
            Expression left = visitSingleExpression(ctx.singleExpression(0));
            Expression right = visitSingleExpression(ctx.singleExpression(1));
            expression.setLeft(left);
            expression.setRight(right);
            return expression;
        }

        // Assignment (e.g., products = [])
        if (ctx.singleExpression().size() == 2 && ctx.Assign() != null) {
            Expression left = visitSingleExpression(ctx.singleExpression(0));
            Expression right = visitSingleExpression(ctx.singleExpression(1));

            expression.setLeft(left);
            expression.setRight(right);

            String varName = getFullIdentifier(left); // <-- Fixed here
            String type = "";
            String value = right.toString();

            if (ctx.singleExpression(1).arrayLiteral() != null) {
                type = "array";
                value = ctx.singleExpression(1).getText();
                expression.setArrayAssignment(true);
//                System.out.println("Detected array assignment to: " + varName);

                Row row = new Row();
                row.setType(type);
                row.setValue(varName);
                this.symbolTable.getRows().add(row);
            } else if (right.getLiteralExpression() != null) {
                type = "literal";
                value = right.getLiteralExpression().toString();
            } else if (right.getIdentifier() != null) {
                type = "identifier";
                value = right.getIdentifier();
            }



            return expression;
        }

        // Ternary or colon-style expression
        if (ctx.singleExpression().size() == 2 && ctx.Colon() != null) {
            Expression left = visitSingleExpression(ctx.singleExpression(0));
            Expression right = visitSingleExpression(ctx.singleExpression(1));
            expression.setLeft(left);
            expression.setRight(right);
            return expression;
        }

        return expression;
    }

    private String getFullIdentifier(Expression expr) {
        if (expr.getIdentifier() != null) {
            return expr.getIdentifier();
        } else if (expr.getLeft() != null && expr.getRight() != null) {
            return getFullIdentifier(expr.getLeft()) + "." + getFullIdentifier(expr.getRight());
        }
        return "";
    }


    @Override

    public LiteralExpression visitLiteral(AngularParser.LiteralContext ctx) {
        LiteralExpression literalExpression = new LiteralExpression();
        if (ctx.BooleanLiteral() != null) {
            literalExpression.setBooleanLiteral(Boolean.parseBoolean(ctx.BooleanLiteral().getText()));}
        else if (ctx.DecimalLiteral() != null) {
            literalExpression.setDecimalLiteral(Double.parseDouble(ctx.DecimalLiteral().getText()));}
        else if (ctx.StringLiteral() != null) {
            literalExpression.setStringLiteral(ctx.StringLiteral().getText());}

        else {
            literalExpression.setNullLiteral(null);}

        return literalExpression;
    }
    @Override
    public ObjectLiteral visitObjectLiteral(AngularParser.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral = new ObjectLiteral();
        for (int i = 0; i < ctx.propertyAssignment().size(); i++) {
            if (ctx.propertyAssignment(i) != null) {
                objectLiteral.getProperties().add(visitPropertyAssignment(ctx.propertyAssignment(i)));
            }
        }
        return objectLiteral;

    }
    @Override
    public PropertyAssignment visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx) {
        PropertyAssignment propertyAssignment = new PropertyAssignment();
        if (ctx.singleExpression(0)!= null) {
            Expression key = visitSingleExpression(ctx.singleExpression(0));
            propertyAssignment.setKey(key);
        }
        if (ctx.singleExpression(1)!= null) {
            Expression value = visitSingleExpression(ctx.singleExpression(1));
            propertyAssignment.setValue(value);
        }
        return propertyAssignment;
    }

    @Override
    public ArrayLiteral visitArrayLiteral(AngularParser.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral = new ArrayLiteral();
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                arrayLiteral.getElements().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }

        Row row = new Row();
        row.setType("ArrayExpression");
        row.setValue(ctx.getText());
        return arrayLiteral;
    }
    @Override
    public FunctionDeclaration visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        if(ctx.Export()!=null)
        {
            functionDeclaration.setFunctionExport(ctx.Export().getText());
        }
        if(ctx.Identifier()!=null)
        {
            functionDeclaration.setFunctionName(ctx.Identifier().getText());
           Row row=new Row();
            row.setType("FunctionName");
            row.setValue(functionDeclaration.getFunctionName());
            this.symbolTable.getRows().add(row);

        }
        if(ctx.Identifier()!=null)
        {
            functionDeclaration.setFunctionName(ctx.Identifier().getText());

        }
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                functionDeclaration.getParameters().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        if (!ctx.singleExpression().isEmpty())
        {
            Row row = new Row();
            row.setType("functionParameters");
            row.setValue(functionDeclaration.getParameters().toString());
            this.symbolTable.getRows().add(row);
        }
        for (int i = 0; i < ctx.statment().size(); i++) {
            if (ctx.statment(i) != null) {
                functionDeclaration.getBody().add(visitStatment(ctx.statment(i)));
            }
        }
        if(ctx.exportStatement()!=null)
        {
            functionDeclaration.setEx(visitExportStatement(ctx.exportStatement()));
        }
        return functionDeclaration;

    }

    @Override
    public VariableStatement visitVariableStatement(AngularParser.VariableStatementContext ctx) {

        VariableStatement variableStatement = new VariableStatement();
        for (int i = 0; i < ctx.variableDeclaration().size(); i++) {
            if (ctx.variableDeclaration(i) != null) {
                variableStatement.getVariableDeclarations().add(visitVariableDeclaration(ctx.variableDeclaration(i)));
            }
        }
        return variableStatement;

    }
    @Override
    public VariableDeclaration visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        if (ctx.assignable() != null) {
            variableDeclaration.setAssignable(visitAssignable(ctx.assignable()));
        }
        if (ctx.singleExpression() != null) {
            variableDeclaration.setExp(visitSingleExpression(ctx.singleExpression()));
        }
        return variableDeclaration;
    }
    @Override
    public Assignable visitAssignable(AngularParser.AssignableContext ctx) {
        Assignable assignable = new Assignable();


        if (ctx.arrayLiteral() != null) {

            assignable.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));

        } else if (ctx.Identifier() != null) {
            assignable.setName(ctx.Identifier().getText());
            Row row1 = new Row();
            row1.setType("NameOfVar");
            row1.setValue(assignable.getName());
            this.symbolTable.getRows().add(row1);

        }
        if (ctx.arrayLiteral() != null) {

            assignable.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));

        } else if (ctx.Identifier() != null) {
            assignable.setName(ctx.Identifier().getText());


        }

        return assignable;
    }
    @Override
    public ExpressionStatement visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
        ExpressionStatement expressionStatement= new ExpressionStatement();
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                expressionStatement.getExpressions().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        return expressionStatement;

    }
    @Override
    public Export visitExportStatement(AngularParser.ExportStatementContext ctx) {
        Export export = new Export();
        if (ctx.Identifier() != null) {
            export.setIdentifier(ctx.Identifier().getText());
        }
        return export;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration=new ClassDeclaration();
if(ctx.Identifier()!=null) {
    classDeclaration.setClassName(ctx.Identifier().getText());
    Row row = new Row();
    row.setType("ClassName");
    row.setValue(classDeclaration.getClassName());
    this.symbolTable.getRows().add(row);
}
   if(ctx.classBody()!=null){
       classDeclaration.setClassBody(visitClassBody(ctx.classBody()));
   }
        return classDeclaration;
    }

    @Override
    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBody classBody=new ClassBody();

for (int i=0;i<ctx.singleExpression().size();i++) {
    if (ctx.singleExpression(i) != null) {
        classBody.getExpressions().add(visitSingleExpression(ctx.singleExpression(i)));
    }
}

        return classBody;
    }

    @Override
    public MustachExpression visitMustacheExpression(AngularParser.MustacheExpressionContext ctx) {
        MustachExpression mustachExpression=new MustachExpression();
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {

                mustachExpression.getExpContent().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        return mustachExpression;
    }

    @Override
    public Selector visitSelectorDeclaration(AngularParser.SelectorDeclarationContext ctx) {
        Selector selector=new Selector();
        if(ctx.Colon()!=null){
            selector.setColon(ctx.Colon().getText());
        }
        if(ctx.Selector()!=null){
            selector.setSelector(ctx.Selector().getText());

            Row row = new Row();
            row.setType("Selector");
            row.setValue(ctx.Selector().getText());
            String selectorValue = ctx.getText().split(":")[1];
            row.setAttributeValue(selectorValue);
            this.symbolTable.getRows().add(row);


        }
        if(ctx.StringLiteral()!=null){
            selector.setApp_root(ctx.StringLiteral().getText());
        }
        return selector;
    }

    @Override
    public Standalone visitStandaloneDeclaration(AngularParser.StandaloneDeclarationContext ctx) {
  Standalone standalone=new Standalone();
  if(ctx.Standalone()!=null){
      standalone.setStandalone(ctx.Standalone().getText());

      Row row = new Row();
      row.setType("Standalone");
      row.setValue(ctx.Standalone().getText());
      this.symbolTable.getRows().add(row);

  }
        if(ctx.Colon()!=null){
            standalone.setColon(ctx.Colon().getText());
        }
        if(ctx.BooleanLiteral()!=null){
            String booleanText = ctx.BooleanLiteral().getText();
            boolean booleanValue = Boolean.parseBoolean(booleanText);
            standalone.setBooleanvalue(booleanValue);
        }
  return standalone;
    }

    @Override
    public Imports visitImportsDeclaration(AngularParser.ImportsDeclarationContext ctx) {
        Imports imports=new Imports();
        if(ctx.Colon()!=null){
            imports.setColon(ctx.Colon().getText());
        }
        if(ctx.Imports()!=null){
            imports.setImports(ctx.Imports().getText());

            Row row = new Row();
            row.setType("Import");
            row.setValue(ctx.Imports().getText());
            this.symbolTable.getRows().add(row);
        }
        if(ctx.arrayLiteral()!=null){
            imports.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }
        return imports;
    }

    @Override
    public Styles visitStylesDeclaration(AngularParser.StylesDeclarationContext ctx) {
        Styles styles=new Styles();
        if(ctx.Styles()!=null){
            styles.setStyle(ctx.Styles().getText());

            Row row = new Row();
            row.setType("Styles");
            row.setValue(ctx.Styles().getText());
            this.symbolTable.getRows().add(row);

        }
        if(ctx.Colon()!=null){
            styles.setColon(ctx.Colon().getText());
        }
        if(ctx.arrayLiteral()!=null){
            styles.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }
        return styles;
    }

    @Override
    public StyleContent visitSingleExpressionCss(AngularParser.SingleExpressionCssContext ctx) {
      StyleContent styleContent=new StyleContent();

        if(ctx.Identifier()!=null){

            styleContent.setClassName(ctx.Identifier().getText());
        }
        if(ctx.objectLiteral()!=null){
            styleContent.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
      return styleContent;
    }
    @Override
    public forStatement visitForstatment(AngularParser.ForstatmentContext ctx) {
        forStatement fs = new forStatement();
        if (ctx.variableStatement() != null) {
            fs.setVariableStatement(visitVariableStatement(ctx.variableStatement()));
        }
        if (ctx.singleExpression(1) != null) {
            fs.setIncrement(visitSingleExpression(ctx.singleExpression(1)));
        }
        if (ctx.singleExpression(2) != null) {
            fs.setBody(visitSingleExpression(ctx.singleExpression(2)));
        }
        return fs;
    }

    @Override
    public IndexArray visitIndexarray(AngularParser.IndexarrayContext ctx) {
        IndexArray indexArray=new IndexArray();
       if(ctx.Identifier()!=null){
           indexArray.setIdentifier(ctx.Identifier().getText());
       }
        if(ctx.DecimalLiteral()!=null){
            indexArray.setIndex(ctx.DecimalLiteral().getChildCount());
        }
        return  indexArray;
    }
}
