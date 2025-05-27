// Generated from C:/Users/hazem/OneDrive/Desktop/4/compiler_test/CompilerProject/src/antler/AngularParser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(AngularParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(AngularParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock(AngularParser.ImportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock(AngularParser.ImportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void enterModuleItems(AngularParser.ModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void exitModuleItems(AngularParser.ModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(AngularParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(AngularParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(AngularParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(AngularParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(AngularParser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(AngularParser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(AngularParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(AngularParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#singleExpressionCss}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpressionCss(AngularParser.SingleExpressionCssContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#singleExpressionCss}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpressionCss(AngularParser.SingleExpressionCssContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forstatment}.
	 * @param ctx the parse tree
	 */
	void enterForstatment(AngularParser.ForstatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forstatment}.
	 * @param ctx the parse tree
	 */
	void exitForstatment(AngularParser.ForstatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(AngularParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(AngularParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentAttributes}.
	 * @param ctx the parse tree
	 */
	void enterComponentAttributes(AngularParser.ComponentAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentAttributes}.
	 * @param ctx the parse tree
	 */
	void exitComponentAttributes(AngularParser.ComponentAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentAttribute}.
	 * @param ctx the parse tree
	 */
	void enterComponentAttribute(AngularParser.ComponentAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentAttribute}.
	 * @param ctx the parse tree
	 */
	void exitComponentAttribute(AngularParser.ComponentAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selectorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSelectorDeclaration(AngularParser.SelectorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selectorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSelectorDeclaration(AngularParser.SelectorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#standaloneDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneDeclaration(AngularParser.StandaloneDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#standaloneDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneDeclaration(AngularParser.StandaloneDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportsDeclaration(AngularParser.ImportsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportsDeclaration(AngularParser.ImportsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(AngularParser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(AngularParser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stylesDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStylesDeclaration(AngularParser.StylesDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stylesDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStylesDeclaration(AngularParser.StylesDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateStatement}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStatement(AngularParser.TemplateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateStatement}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStatement(AngularParser.TemplateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(AngularParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(AngularParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#mustacheExpression}.
	 * @param ctx the parse tree
	 */
	void enterMustacheExpression(AngularParser.MustacheExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#mustacheExpression}.
	 * @param ctx the parse tree
	 */
	void exitMustacheExpression(AngularParser.MustacheExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValue(AngularParser.HtmlAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValue(AngularParser.HtmlAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#indexarray}.
	 * @param ctx the parse tree
	 */
	void enterIndexarray(AngularParser.IndexarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#indexarray}.
	 * @param ctx the parse tree
	 */
	void exitIndexarray(AngularParser.IndexarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayCss}.
	 * @param ctx the parse tree
	 */
	void enterArrayCss(AngularParser.ArrayCssContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayCss}.
	 * @param ctx the parse tree
	 */
	void exitArrayCss(AngularParser.ArrayCssContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularParser.LiteralContext ctx);
}