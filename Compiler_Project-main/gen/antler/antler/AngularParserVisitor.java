// Generated from C:/Users/hazem/OneDrive/Desktop/4/compiler_test/CompilerProject/src/antler/antler/AngularParser.g4 by ANTLR 4.13.2
package antler.antler;
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
	 * Visit a parse tree produced by {@link AngularParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(AngularParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlText(AngularParser.HtmlTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssContent(AngularParser.CssContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlock(AngularParser.CssBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProperties(AngularParser.CssPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tsContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsContent(AngularParser.TsContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsDeclaration(AngularParser.TsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsStatement(AngularParser.TsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsExpression(AngularParser.TsExpressionContext ctx);
}