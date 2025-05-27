// Generated from C:/Users/hazem/OneDrive/Desktop/4/compiler_test/CompilerProject/src/antler/antler/AngularParser.g4 by ANTLR 4.13.2
package antler.antler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_TAG_OPEN=1, HTML_TAG_CLOSE=2, HTML_ATTR_NAME=3, EQUAL=4, HTML_ATTR_VALUE=5, 
		HTML_TEXT=6, CSS_SELECTOR=7, CSS_BLOCK_START=8, CSS_BLOCK_END=9, CSS_PROPERTY=10, 
		COLON=11, CSS_VALUE=12, SEMICOLON=13, TS_KEYWORD=14, TS_IDENTIFIER=15, 
		TS_NUMBER=16, TS_STRING=17, TS_OPERATOR=18;
	public static final int
		RULE_file = 0, RULE_htmlContent = 1, RULE_htmlElement = 2, RULE_htmlAttributes = 3, 
		RULE_htmlText = 4, RULE_cssContent = 5, RULE_cssBlock = 6, RULE_cssProperties = 7, 
		RULE_tsContent = 8, RULE_tsDeclaration = 9, RULE_tsStatement = 10, RULE_tsExpression = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "htmlContent", "htmlElement", "htmlAttributes", "htmlText", "cssContent", 
			"cssBlock", "cssProperties", "tsContent", "tsDeclaration", "tsStatement", 
			"tsExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_TAG_OPEN", "HTML_TAG_CLOSE", "HTML_ATTR_NAME", "EQUAL", "HTML_ATTR_VALUE", 
			"HTML_TEXT", "CSS_SELECTOR", "CSS_BLOCK_START", "CSS_BLOCK_END", "CSS_PROPERTY", 
			"COLON", "CSS_VALUE", "SEMICOLON", "TS_KEYWORD", "TS_IDENTIFIER", "TS_NUMBER", 
			"TS_STRING", "TS_OPERATOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public CssContentContext cssContent() {
			return getRuleContext(CssContentContext.class,0);
		}
		public TsContentContext tsContent() {
			return getRuleContext(TsContentContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			htmlContent();
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(25);
				cssContent();
				}
				break;
			}
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(28);
				tsContent();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<HtmlTextContext> htmlText() {
			return getRuleContexts(HtmlTextContext.class);
		}
		public HtmlTextContext htmlText(int i) {
			return getRuleContext(HtmlTextContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_TAG_OPEN || _la==HTML_TEXT) {
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HTML_TAG_OPEN:
					{
					setState(31);
					htmlElement();
					}
					break;
				case HTML_TEXT:
					{
					setState(32);
					htmlText();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(HTML_TAG_OPEN);
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(39);
				htmlAttributes();
				}
				break;
			}
			setState(42);
			match(HTML_TAG_CLOSE);
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(43);
				htmlContent();
				}
				break;
			}
			setState(46);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributesContext extends ParserRuleContext {
		public List<TerminalNode> HTML_ATTR_NAME() { return getTokens(AngularParser.HTML_ATTR_NAME); }
		public TerminalNode HTML_ATTR_NAME(int i) {
			return getToken(AngularParser.HTML_ATTR_NAME, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(AngularParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(AngularParser.EQUAL, i);
		}
		public List<TerminalNode> HTML_ATTR_VALUE() { return getTokens(AngularParser.HTML_ATTR_VALUE); }
		public TerminalNode HTML_ATTR_VALUE(int i) {
			return getToken(AngularParser.HTML_ATTR_VALUE, i);
		}
		public HtmlAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributesContext htmlAttributes() throws RecognitionException {
		HtmlAttributesContext _localctx = new HtmlAttributesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_ATTR_NAME) {
				{
				{
				setState(48);
				match(HTML_ATTR_NAME);
				setState(49);
				match(EQUAL);
				setState(50);
				match(HTML_ATTR_VALUE);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(AngularParser.HTML_TEXT, 0); }
		public HtmlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTextContext htmlText() throws RecognitionException {
		HtmlTextContext _localctx = new HtmlTextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(HTML_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssContentContext extends ParserRuleContext {
		public List<CssBlockContext> cssBlock() {
			return getRuleContexts(CssBlockContext.class);
		}
		public CssBlockContext cssBlock(int i) {
			return getRuleContext(CssBlockContext.class,i);
		}
		public CssContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContentContext cssContent() throws RecognitionException {
		CssContentContext _localctx = new CssContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cssContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_SELECTOR) {
				{
				{
				setState(58);
				cssBlock();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssBlockContext extends ParserRuleContext {
		public TerminalNode CSS_SELECTOR() { return getToken(AngularParser.CSS_SELECTOR, 0); }
		public TerminalNode CSS_BLOCK_START() { return getToken(AngularParser.CSS_BLOCK_START, 0); }
		public TerminalNode CSS_BLOCK_END() { return getToken(AngularParser.CSS_BLOCK_END, 0); }
		public CssPropertiesContext cssProperties() {
			return getRuleContext(CssPropertiesContext.class,0);
		}
		public CssBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBlockContext cssBlock() throws RecognitionException {
		CssBlockContext _localctx = new CssBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cssBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CSS_SELECTOR);
			setState(65);
			match(CSS_BLOCK_START);
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(66);
				cssProperties();
				}
				break;
			}
			setState(69);
			match(CSS_BLOCK_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertiesContext extends ParserRuleContext {
		public List<TerminalNode> CSS_PROPERTY() { return getTokens(AngularParser.CSS_PROPERTY); }
		public TerminalNode CSS_PROPERTY(int i) {
			return getToken(AngularParser.CSS_PROPERTY, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TerminalNode> CSS_VALUE() { return getTokens(AngularParser.CSS_VALUE); }
		public TerminalNode CSS_VALUE(int i) {
			return getToken(AngularParser.CSS_VALUE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AngularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngularParser.SEMICOLON, i);
		}
		public CssPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertiesContext cssProperties() throws RecognitionException {
		CssPropertiesContext _localctx = new CssPropertiesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cssProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_PROPERTY) {
				{
				{
				setState(71);
				match(CSS_PROPERTY);
				setState(72);
				match(COLON);
				setState(73);
				match(CSS_VALUE);
				setState(74);
				match(SEMICOLON);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TsContentContext extends ParserRuleContext {
		public List<TsDeclarationContext> tsDeclaration() {
			return getRuleContexts(TsDeclarationContext.class);
		}
		public TsDeclarationContext tsDeclaration(int i) {
			return getRuleContext(TsDeclarationContext.class,i);
		}
		public List<TsStatementContext> tsStatement() {
			return getRuleContexts(TsStatementContext.class);
		}
		public TsStatementContext tsStatement(int i) {
			return getRuleContext(TsStatementContext.class,i);
		}
		public TsContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsContentContext tsContent() throws RecognitionException {
		TsContentContext _localctx = new TsContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tsContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) {
				{
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TS_KEYWORD:
					{
					setState(80);
					tsDeclaration();
					}
					break;
				case TS_IDENTIFIER:
				case TS_NUMBER:
				case TS_STRING:
					{
					setState(81);
					tsStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TsDeclarationContext extends ParserRuleContext {
		public TerminalNode TS_KEYWORD() { return getToken(AngularParser.TS_KEYWORD, 0); }
		public TerminalNode TS_IDENTIFIER() { return getToken(AngularParser.TS_IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TsExpressionContext tsExpression() {
			return getRuleContext(TsExpressionContext.class,0);
		}
		public TsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsDeclarationContext tsDeclaration() throws RecognitionException {
		TsDeclarationContext _localctx = new TsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(TS_KEYWORD);
			setState(88);
			match(TS_IDENTIFIER);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(89);
				match(EQUAL);
				setState(90);
				tsExpression();
				}
			}

			setState(93);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TsStatementContext extends ParserRuleContext {
		public TsExpressionContext tsExpression() {
			return getRuleContext(TsExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsStatementContext tsStatement() throws RecognitionException {
		TsStatementContext _localctx = new TsStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			tsExpression();
			setState(96);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TsExpressionContext extends ParserRuleContext {
		public TerminalNode TS_IDENTIFIER() { return getToken(AngularParser.TS_IDENTIFIER, 0); }
		public TerminalNode TS_NUMBER() { return getToken(AngularParser.TS_NUMBER, 0); }
		public TerminalNode TS_STRING() { return getToken(AngularParser.TS_STRING, 0); }
		public TerminalNode TS_OPERATOR() { return getToken(AngularParser.TS_OPERATOR, 0); }
		public TsExpressionContext tsExpression() {
			return getRuleContext(TsExpressionContext.class,0);
		}
		public TsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsExpressionContext tsExpression() throws RecognitionException {
		TsExpressionContext _localctx = new TsExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tsExpression);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(TS_IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(TS_NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(TS_STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(TS_IDENTIFIER);
				setState(102);
				match(TS_OPERATOR);
				setState(103);
				tsExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012k\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0000\u0003\u0000\u001e"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0005\u0001\"\b\u0001\n\u0001\f\u0001"+
		"%\t\u0001\u0001\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002-\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0005\u0005<\b\u0005\n\u0005\f\u0005?\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006D\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007L\b\u0007\n\u0007\f\u0007O\t\u0007\u0001\b\u0001\b\u0005\bS\b\b"+
		"\n\b\f\bV\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\\\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000bi\b\u000b\u0001\u000b\u0000\u0000"+
		"\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000"+
		"n\u0000\u0018\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004"+
		"&\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b8\u0001\u0000"+
		"\u0000\u0000\n=\u0001\u0000\u0000\u0000\f@\u0001\u0000\u0000\u0000\u000e"+
		"M\u0001\u0000\u0000\u0000\u0010T\u0001\u0000\u0000\u0000\u0012W\u0001"+
		"\u0000\u0000\u0000\u0014_\u0001\u0000\u0000\u0000\u0016h\u0001\u0000\u0000"+
		"\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u001b\u0003\n\u0005\u0000"+
		"\u001a\u0019\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000"+
		"\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0010\b\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
		"\u0001\u0001\u0000\u0000\u0000\u001f\"\u0003\u0004\u0002\u0000 \"\u0003"+
		"\b\u0004\u0000!\u001f\u0001\u0000\u0000\u0000! \u0001\u0000\u0000\u0000"+
		"\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\u0003\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&(\u0005"+
		"\u0001\u0000\u0000\')\u0003\u0006\u0003\u0000(\'\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0005\u0002\u0000"+
		"\u0000+-\u0003\u0002\u0001\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0005\u0002\u0000\u0000/\u0005"+
		"\u0001\u0000\u0000\u000001\u0005\u0003\u0000\u000012\u0005\u0004\u0000"+
		"\u000024\u0005\u0005\u0000\u000030\u0001\u0000\u0000\u000047\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0007"+
		"\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0005\u0006\u0000"+
		"\u00009\t\u0001\u0000\u0000\u0000:<\u0003\f\u0006\u0000;:\u0001\u0000"+
		"\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>\u000b\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000@A\u0005\u0007\u0000\u0000AC\u0005\b\u0000\u0000BD\u0003\u000e\u0007"+
		"\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EF\u0005\t\u0000\u0000F\r\u0001\u0000\u0000\u0000GH\u0005"+
		"\n\u0000\u0000HI\u0005\u000b\u0000\u0000IJ\u0005\f\u0000\u0000JL\u0005"+
		"\r\u0000\u0000KG\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u000f\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PS\u0003\u0012\t\u0000QS\u0003\u0014\n"+
		"\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0011"+
		"\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0005\u000e\u0000"+
		"\u0000X[\u0005\u000f\u0000\u0000YZ\u0005\u0004\u0000\u0000Z\\\u0003\u0016"+
		"\u000b\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]^\u0005\r\u0000\u0000^\u0013\u0001\u0000\u0000\u0000"+
		"_`\u0003\u0016\u000b\u0000`a\u0005\r\u0000\u0000a\u0015\u0001\u0000\u0000"+
		"\u0000bi\u0005\u000f\u0000\u0000ci\u0005\u0010\u0000\u0000di\u0005\u0011"+
		"\u0000\u0000ef\u0005\u000f\u0000\u0000fg\u0005\u0012\u0000\u0000gi\u0003"+
		"\u0016\u000b\u0000hb\u0001\u0000\u0000\u0000hc\u0001\u0000\u0000\u0000"+
		"hd\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000i\u0017\u0001\u0000"+
		"\u0000\u0000\u000e\u001a\u001d!#(,5=CMRT[h";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}