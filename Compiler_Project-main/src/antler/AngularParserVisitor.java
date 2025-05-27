// Generated from C:/Users/hazem/OneDrive/Desktop/4/compiler_test/CompilerProject/src/antler/AngularParser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(AngularParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromBlock(AngularParser.ImportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#moduleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleItems(AngularParser.ModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(AngularParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarModifier(AngularParser.VarModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable(AngularParser.AssignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(AngularParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#singleExpressionCss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpressionCss(AngularParser.SingleExpressionCssContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forstatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatment(AngularParser.ForstatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(AngularParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentAttributes(AngularParser.ComponentAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentAttribute(AngularParser.ComponentAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selectorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorDeclaration(AngularParser.SelectorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#standaloneDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneDeclaration(AngularParser.StandaloneDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsDeclaration(AngularParser.ImportsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration(AngularParser.TemplateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stylesDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesDeclaration(AngularParser.StylesDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStatement(AngularParser.TemplateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(AngularParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#mustacheExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustacheExpression(AngularParser.MustacheExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeValue(AngularParser.HtmlAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#indexarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexarray(AngularParser.IndexarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayCss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCss(AngularParser.ArrayCssContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AngularParser.LiteralContext ctx);
}