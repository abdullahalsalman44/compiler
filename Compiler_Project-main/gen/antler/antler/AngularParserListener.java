// Generated from C:/Users/hazem/OneDrive/Desktop/4/compiler_test/CompilerProject/src/antler/antler/AngularParser.g4 by ANTLR 4.13.2
package antler.antler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(AngularParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(AngularParser.FileContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterHtmlText(AngularParser.HtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitHtmlText(AngularParser.HtmlTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssContent}.
	 * @param ctx the parse tree
	 */
	void enterCssContent(AngularParser.CssContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssContent}.
	 * @param ctx the parse tree
	 */
	void exitCssContent(AngularParser.CssContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlock(AngularParser.CssBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlock(AngularParser.CssBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssProperties}.
	 * @param ctx the parse tree
	 */
	void enterCssProperties(AngularParser.CssPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssProperties}.
	 * @param ctx the parse tree
	 */
	void exitCssProperties(AngularParser.CssPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tsContent}.
	 * @param ctx the parse tree
	 */
	void enterTsContent(AngularParser.TsContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tsContent}.
	 * @param ctx the parse tree
	 */
	void exitTsContent(AngularParser.TsContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTsDeclaration(AngularParser.TsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTsDeclaration(AngularParser.TsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tsStatement}.
	 * @param ctx the parse tree
	 */
	void enterTsStatement(AngularParser.TsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tsStatement}.
	 * @param ctx the parse tree
	 */
	void exitTsStatement(AngularParser.TsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tsExpression}.
	 * @param ctx the parse tree
	 */
	void enterTsExpression(AngularParser.TsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tsExpression}.
	 * @param ctx the parse tree
	 */
	void exitTsExpression(AngularParser.TsExpressionContext ctx);
}