// Generated from C:/Users/shaza/IdeaProjects/compiler/Compiler_Project-main/src/antler/AngularParser.g4 by ANTLR 4.13.2
package antler;
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
		MultiLineComment=1, SingleLineComment=2, At=3, BACKTICK=4, Class=5, Export=6, 
		Let=7, Component=8, Selector=9, Standalone=10, Imports=11, Template=12, 
		Styles=13, NgModule=14, Injectable=15, Pipe=16, SemiColon=17, OpenBracket=18, 
		CloseBracket=19, OpenParen=20, CloseParen=21, OpenBrace=22, CloseBrace=23, 
		Comma=24, Assign=25, QuestionMark=26, QuestionMarkDot=27, Colon=28, Ellipsis=29, 
		Dot=30, PlusPlus=31, MinusMinus=32, Plus=33, Minus=34, BitNot=35, Not=36, 
		Multiply=37, Divide=38, Modulus=39, NullCoalesce=40, Hashtag=41, RightShiftArithmetic=42, 
		LeftShiftArithmetic=43, RightShiftLogical=44, LessThan=45, MoreThan=46, 
		LessThanEquals=47, GreaterThanEquals=48, Equals_=49, NotEquals=50, IdentityEquals=51, 
		IdentityNotEquals=52, BitAnd=53, BitXOr=54, BitOr=55, And=56, Or=57, MultiplyAssign=58, 
		DivideAssign=59, ModulusAssign=60, PlusAssign=61, MinusAssign=62, LeftShiftArithmeticAssign=63, 
		RightShiftArithmeticAssign=64, RightShiftLogicalAssign=65, BitAndAssign=66, 
		BitXorAssign=67, BitOrAssign=68, NullishCoalescingAssign=69, ARROW=70, 
		ReactCreatElement=71, Break=72, Do=73, Instanceof=74, Typeof=75, Case=76, 
		Else=77, ElseIf=78, New=79, Var=80, Catch=81, Finally=82, Return=83, Void=84, 
		Continue=85, For=86, Switch=87, While=88, Debugger=89, Function_=90, This=91, 
		With=92, Default=93, If=94, Throw=95, Delete=96, In=97, Try=98, As=99, 
		From=100, Of=101, NullLiteral=102, BooleanLiteral=103, Map=104, NgIfDirective=105, 
		NgForDirective=106, Bootstrap=107, Providers=108, Exports=109, Declarations=110, 
		StringLiteral=111, Enum=112, Extends=113, Super=114, Const=115, Import=116, 
		Implements=117, StrictLet=118, Private=119, Public=120, Interface=121, 
		Package=122, Protected=123, Static=124, DecimalLiteral=125, Identifier=126, 
		TagName=127, ID=128, Number=129, WS=130, Qut=131, OPEN_MUSTACHE=132, CLOSE_MUSTACHE=133, 
		CLOSE_TAG=134, HexColor=135;
	public static final int
		RULE_program = 0, RULE_eos = 1, RULE_importStatement = 2, RULE_importFromBlock = 3, 
		RULE_moduleItems = 4, RULE_statment = 5, RULE_expressionStatement = 6, 
		RULE_returnStatement = 7, RULE_functionDeclaration = 8, RULE_exportStatement = 9, 
		RULE_variableStatement = 10, RULE_varModifier = 11, RULE_variableDeclaration = 12, 
		RULE_assignable = 13, RULE_singleExpression = 14, RULE_singleExpressionCss = 15, 
		RULE_forstatment = 16, RULE_functionCall = 17, RULE_directive = 18, RULE_ifStatement = 19, 
		RULE_statementBlock = 20, RULE_componentDeclaration = 21, RULE_classDeclaration = 22, 
		RULE_componentAttributes = 23, RULE_componentAttribute = 24, RULE_selectorDeclaration = 25, 
		RULE_standaloneDeclaration = 26, RULE_importsDeclaration = 27, RULE_templateDeclaration = 28, 
		RULE_stylesDeclaration = 29, RULE_classBody = 30, RULE_templateStatement = 31, 
		RULE_htmlElements = 32, RULE_htmlElement = 33, RULE_htmlContent = 34, 
		RULE_htmlAttribute = 35, RULE_mustacheExpression = 36, RULE_htmlAttributeValue = 37, 
		RULE_arrayLiteral = 38, RULE_indexarray = 39, RULE_arrayCss = 40, RULE_objectLiteral = 41, 
		RULE_propertyAssignment = 42, RULE_literal = 43, RULE_ngModuleDeclaration = 44, 
		RULE_ngModuleAttributes = 45, RULE_ngModuleAttribute = 46, RULE_declarationsDeclaration = 47, 
		RULE_exportsDeclaration = 48, RULE_providersDeclaration = 49, RULE_bootstrapDeclaration = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "eos", "importStatement", "importFromBlock", "moduleItems", 
			"statment", "expressionStatement", "returnStatement", "functionDeclaration", 
			"exportStatement", "variableStatement", "varModifier", "variableDeclaration", 
			"assignable", "singleExpression", "singleExpressionCss", "forstatment", 
			"functionCall", "directive", "ifStatement", "statementBlock", "componentDeclaration", 
			"classDeclaration", "componentAttributes", "componentAttribute", "selectorDeclaration", 
			"standaloneDeclaration", "importsDeclaration", "templateDeclaration", 
			"stylesDeclaration", "classBody", "templateStatement", "htmlElements", 
			"htmlElement", "htmlContent", "htmlAttribute", "mustacheExpression", 
			"htmlAttributeValue", "arrayLiteral", "indexarray", "arrayCss", "objectLiteral", 
			"propertyAssignment", "literal", "ngModuleDeclaration", "ngModuleAttributes", 
			"ngModuleAttribute", "declarationsDeclaration", "exportsDeclaration", 
			"providersDeclaration", "bootstrapDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'@'", "'`'", "'class'", "'export'", null, "'Component'", 
			"'selector'", "'standalone'", "'imports'", "'template'", "'styles'", 
			"'NgModule'", "'Injectable'", "'Pipe'", "';'", "'['", "']'", "'('", "')'", 
			"'{'", "'}'", "','", "'='", "'?'", "'?.'", "':'", "'...'", "'.'", "'++'", 
			"'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'??'", "'#'", 
			"'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", 
			"'??='", "'=>'", "'React.createElement'", "'break'", "'do'", "'instanceof'", 
			"'typeof'", "'case'", "'else'", "'else if'", "'new'", "'var'", "'catch'", 
			"'finally'", "'return'", "'void'", "'continue'", "'for'", "'switch'", 
			"'while'", "'debugger'", "'function'", "'this'", "'with'", "'default'", 
			"'if'", "'throw'", "'delete'", "'in'", "'try'", "'as'", "'from'", "'of'", 
			"'null'", null, "'map'", "'*ngIf'", "'*ngFor'", "'bootstrap'", "'providers'", 
			"'exports'", "'declarations'", null, "'enum'", "'extends'", "'super'", 
			"'const'", "'import'", "'implements'", null, "'private'", "'public'", 
			"'interface'", "'package'", "'protected'", "'static'", null, null, null, 
			null, null, null, "'\"'", "'{{'", "'}}'", "'</'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "At", "BACKTICK", "Class", 
			"Export", "Let", "Component", "Selector", "Standalone", "Imports", "Template", 
			"Styles", "NgModule", "Injectable", "Pipe", "SemiColon", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"Comma", "Assign", "QuestionMark", "QuestionMarkDot", "Colon", "Ellipsis", 
			"Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
			"Divide", "Modulus", "NullCoalesce", "Hashtag", "RightShiftArithmetic", 
			"LeftShiftArithmetic", "RightShiftLogical", "LessThan", "MoreThan", "LessThanEquals", 
			"GreaterThanEquals", "Equals_", "NotEquals", "IdentityEquals", "IdentityNotEquals", 
			"BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", 
			"ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
			"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
			"BitXorAssign", "BitOrAssign", "NullishCoalescingAssign", "ARROW", "ReactCreatElement", 
			"Break", "Do", "Instanceof", "Typeof", "Case", "Else", "ElseIf", "New", 
			"Var", "Catch", "Finally", "Return", "Void", "Continue", "For", "Switch", 
			"While", "Debugger", "Function_", "This", "With", "Default", "If", "Throw", 
			"Delete", "In", "Try", "As", "From", "Of", "NullLiteral", "BooleanLiteral", 
			"Map", "NgIfDirective", "NgForDirective", "Bootstrap", "Providers", "Exports", 
			"Declarations", "StringLiteral", "Enum", "Extends", "Super", "Const", 
			"Import", "Implements", "StrictLet", "Private", "Public", "Interface", 
			"Package", "Protected", "Static", "DecimalLiteral", "Identifier", "TagName", 
			"ID", "Number", "WS", "Qut", "OPEN_MUSTACHE", "CLOSE_MUSTACHE", "CLOSE_TAG", 
			"HexColor"
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
	public static class ProgramContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			importStatement();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185451335912L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 40637986299185225L) != 0)) {
				{
				{
				setState(103);
				statment();
				}
				}
				setState(108);
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
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(109);
				match(SemiColon);
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
	public static class ImportStatementContext extends ParserRuleContext {
		public List<TerminalNode> Import() { return getTokens(AngularParser.Import); }
		public TerminalNode Import(int i) {
			return getToken(AngularParser.Import, i);
		}
		public List<ImportFromBlockContext> importFromBlock() {
			return getRuleContexts(ImportFromBlockContext.class);
		}
		public ImportFromBlockContext importFromBlock(int i) {
			return getRuleContext(ImportFromBlockContext.class,i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(112);
				match(Import);
				setState(113);
				importFromBlock();
				}
				}
				setState(118);
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
	public static class ImportFromBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode NgModule() { return getToken(AngularParser.NgModule, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode From() { return getToken(AngularParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ModuleItemsContext moduleItems() {
			return getRuleContext(ModuleItemsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importFromBlock);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(OpenBrace);
				setState(120);
				match(NgModule);
				setState(121);
				match(CloseBrace);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace) {
					{
					setState(122);
					moduleItems();
					}
				}

				setState(125);
				match(From);
				setState(126);
				match(StringLiteral);
				setState(127);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(StringLiteral);
				setState(129);
				eos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(130);
					match(Identifier);
					}
				}

				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace) {
					{
					setState(133);
					moduleItems();
					}
				}

				setState(136);
				match(From);
				setState(137);
				match(StringLiteral);
				setState(138);
				eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public ModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleItemsContext moduleItems() throws RecognitionException {
		ModuleItemsContext _localctx = new ModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleItems);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(OpenBrace);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(142);
					match(Identifier);
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(143);
						match(Comma);
						setState(144);
						match(Identifier);
						}
						}
						setState(149);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(152);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(OpenBrace);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Component) {
					{
					setState(154);
					match(Component);
					}
				}

				setState(157);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(OpenBrace);
				setState(159);
				match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatmentContext extends ParserRuleContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public NgModuleDeclarationContext ngModuleDeclaration() {
			return getRuleContext(NgModuleDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statment);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				componentDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				ngModuleDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				expressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				variableStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			singleExpression(0);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(171);
				match(Comma);
				setState(172);
				singleExpression(0);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			eos();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(AngularParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Return);
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(181);
				singleExpression(0);
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(182);
						match(Comma);
						setState(183);
						singleExpression(0);
						}
						} 
					}
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			}
			setState(191);
			eos();
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(193);
				match(Export);
				}
			}

			setState(196);
			match(Identifier);
			setState(197);
			match(OpenParen);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185451335680L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 5079743992430857L) != 0)) {
				{
				{
				setState(198);
				singleExpression(0);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(204);
				match(Comma);
				setState(205);
				singleExpression(0);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(CloseParen);
			setState(212);
			match(OpenBrace);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185451335912L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 40637986299185225L) != 0)) {
				{
				{
				setState(213);
				statment();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(CloseBrace);
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(220);
				exportStatement();
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
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(Export);
			setState(224);
			match(Identifier);
			setState(225);
			eos();
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
	public static class VariableStatementContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export || _la==Let || _la==Var || _la==Const) {
				{
				setState(227);
				varModifier();
				}
			}

			setState(230);
			variableDeclaration();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(231);
				match(Comma);
				setState(232);
				variableDeclaration();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			eos();
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
	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(AngularParser.Var, 0); }
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public TerminalNode Let() { return getToken(AngularParser.Let, 0); }
		public TerminalNode Const() { return getToken(AngularParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varModifier);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(240);
					match(Export);
					}
				}

				setState(243);
				match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(244);
					match(Export);
					}
				}

				setState(247);
				match(Let);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(248);
					match(Export);
					}
				}

				setState(251);
				match(Const);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			assignable();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(255);
				match(Assign);
				setState(256);
				singleExpression(0);
				}
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
	public static class AssignableContext extends ParserRuleContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignable);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				arrayLiteral();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(Identifier);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SingleExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IndexarrayContext indexarray() {
			return getRuleContext(IndexarrayContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ForstatmentContext forstatment() {
			return getRuleContext(ForstatmentContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public MustacheExpressionContext mustacheExpression() {
			return getRuleContext(MustacheExpressionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Map() { return getToken(AngularParser.Map, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public SingleExpressionCssContext singleExpressionCss() {
			return getRuleContext(SingleExpressionCssContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public TerminalNode Plus() { return getToken(AngularParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(AngularParser.Minus, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode And() { return getToken(AngularParser.And, 0); }
		public TerminalNode QuestionMark() { return getToken(AngularParser.QuestionMark, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode PlusPlus() { return getToken(AngularParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(AngularParser.MinusMinus, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(265);
				literal();
				}
				break;
			case 2:
				{
				setState(266);
				indexarray();
				}
				break;
			case 3:
				{
				setState(267);
				arrayLiteral();
				}
				break;
			case 4:
				{
				setState(268);
				forstatment();
				}
				break;
			case 5:
				{
				setState(269);
				objectLiteral();
				}
				break;
			case 6:
				{
				setState(270);
				mustacheExpression();
				}
				break;
			case 7:
				{
				setState(271);
				returnStatement();
				}
				break;
			case 8:
				{
				setState(272);
				htmlElements();
				}
				break;
			case 9:
				{
				setState(273);
				match(OpenParen);
				setState(274);
				singleExpression(0);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(275);
					match(Comma);
					setState(276);
					singleExpression(0);
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(282);
				match(CloseParen);
				}
				break;
			case 10:
				{
				setState(284);
				match(Identifier);
				}
				break;
			case 11:
				{
				setState(285);
				match(Map);
				}
				break;
			case 12:
				{
				setState(286);
				match(OpenBrace);
				setState(287);
				singleExpression(0);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenParen) {
					{
					setState(288);
					match(OpenParen);
					setState(289);
					match(CloseParen);
					}
				}

				setState(292);
				match(CloseBrace);
				}
				break;
			case 13:
				{
				setState(294);
				match(This);
				}
				break;
			case 14:
				{
				setState(295);
				singleExpressionCss();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(334);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(298);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(299);
						match(Dot);
						setState(300);
						singleExpression(20);
						}
						break;
					case 2:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(301);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(302);
						match(Multiply);
						setState(303);
						singleExpression(19);
						}
						break;
					case 3:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(304);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(305);
						match(Divide);
						setState(306);
						singleExpression(18);
						}
						break;
					case 4:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(307);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(308);
						match(Plus);
						setState(309);
						singleExpression(17);
						}
						break;
					case 5:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(310);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(311);
						match(Minus);
						setState(312);
						singleExpression(16);
						}
						break;
					case 6:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(313);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(314);
						match(Colon);
						setState(315);
						singleExpression(15);
						}
						break;
					case 7:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(316);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(317);
						match(And);
						setState(318);
						singleExpression(14);
						}
						break;
					case 8:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(319);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(320);
						match(QuestionMark);
						setState(321);
						singleExpression(0);
						setState(322);
						match(Colon);
						setState(323);
						singleExpression(13);
						}
						break;
					case 9:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(325);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(326);
						match(Assign);
						setState(327);
						singleExpression(12);
						}
						break;
					case 10:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(328);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(329);
						singleExpression(11);
						}
						break;
					case 11:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(330);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(331);
						match(PlusPlus);
						}
						break;
					case 12:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(332);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(333);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionCssContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public SingleExpressionCssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpressionCss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSingleExpressionCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSingleExpressionCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSingleExpressionCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionCssContext singleExpressionCss() throws RecognitionException {
		SingleExpressionCssContext _localctx = new SingleExpressionCssContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_singleExpressionCss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(339);
				match(Dot);
				}
			}

			setState(342);
			match(Identifier);
			setState(343);
			objectLiteral();
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
	public static class ForstatmentContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(AngularParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode MoreThan() { return getToken(AngularParser.MoreThan, 0); }
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ForstatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForstatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForstatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForstatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatmentContext forstatment() throws RecognitionException {
		ForstatmentContext _localctx = new ForstatmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forstatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(For);
			setState(346);
			match(OpenParen);
			setState(347);
			variableStatement();
			setState(348);
			match(Identifier);
			setState(349);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 105553149820928L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(350);
			singleExpression(0);
			setState(351);
			match(SemiColon);
			setState(352);
			singleExpression(0);
			setState(353);
			match(CloseParen);
			setState(354);
			match(OpenBrace);
			setState(355);
			singleExpression(0);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(356);
				eos();
				}
				break;
			}
			setState(359);
			match(CloseBrace);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(Identifier);
			setState(362);
			match(OpenParen);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185451335680L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 5079743992430857L) != 0)) {
				{
				setState(363);
				singleExpression(0);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(364);
					match(Comma);
					setState(365);
					singleExpression(0);
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(373);
			match(CloseParen);
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
	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode NgIfDirective() { return getToken(AngularParser.NgIfDirective, 0); }
		public TerminalNode NgForDirective() { return getToken(AngularParser.NgForDirective, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==NgIfDirective || _la==NgForDirective) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<StatementBlockContext> statementBlock() {
			return getRuleContexts(StatementBlockContext.class);
		}
		public StatementBlockContext statementBlock(int i) {
			return getRuleContext(StatementBlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(If);
			setState(378);
			match(OpenParen);
			setState(379);
			singleExpression(0);
			setState(380);
			match(CloseParen);
			setState(381);
			statementBlock();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(382);
				match(Else);
				setState(383);
				statementBlock();
				}
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
	public static class StatementBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(OpenBrace);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185451335912L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 40637986299185225L) != 0)) {
				{
				{
				setState(387);
				statment();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			match(CloseBrace);
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
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(AngularParser.At, 0); }
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ComponentAttributesContext componentAttributes() {
			return getRuleContext(ComponentAttributesContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(At);
			setState(396);
			match(Component);
			setState(397);
			match(OpenParen);
			setState(398);
			componentAttributes();
			setState(399);
			match(CloseParen);
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(401);
				match(Export);
				}
			}

			setState(404);
			match(Class);
			setState(405);
			match(Identifier);
			setState(406);
			classBody();
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
	public static class ComponentAttributesContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<ComponentAttributeContext> componentAttribute() {
			return getRuleContexts(ComponentAttributeContext.class);
		}
		public ComponentAttributeContext componentAttribute(int i) {
			return getRuleContext(ComponentAttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ComponentAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentAttributesContext componentAttributes() throws RecognitionException {
		ComponentAttributesContext _localctx = new ComponentAttributesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_componentAttributes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(OpenBrace);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073757696L) != 0) || _la==Identifier) {
				{
				setState(409);
				componentAttribute();
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(410);
						match(Comma);
						setState(411);
						componentAttribute();
						}
						} 
					}
					setState(416);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(417);
					match(Comma);
					}
				}

				}
			}

			setState(422);
			match(CloseBrace);
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
	public static class ComponentAttributeContext extends ParserRuleContext {
		public SelectorDeclarationContext selectorDeclaration() {
			return getRuleContext(SelectorDeclarationContext.class,0);
		}
		public StandaloneDeclarationContext standaloneDeclaration() {
			return getRuleContext(StandaloneDeclarationContext.class,0);
		}
		public ImportsDeclarationContext importsDeclaration() {
			return getRuleContext(ImportsDeclarationContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public StylesDeclarationContext stylesDeclaration() {
			return getRuleContext(StylesDeclarationContext.class,0);
		}
		public SingleExpressionCssContext singleExpressionCss() {
			return getRuleContext(SingleExpressionCssContext.class,0);
		}
		public ComponentAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentAttributeContext componentAttribute() throws RecognitionException {
		ComponentAttributeContext _localctx = new ComponentAttributeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_componentAttribute);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Selector:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				selectorDeclaration();
				}
				break;
			case Standalone:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				standaloneDeclaration();
				}
				break;
			case Imports:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				importsDeclaration();
				}
				break;
			case Template:
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				templateDeclaration();
				}
				break;
			case Styles:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				stylesDeclaration();
				}
				break;
			case Dot:
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				singleExpressionCss();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SelectorDeclarationContext extends ParserRuleContext {
		public TerminalNode Selector() { return getToken(AngularParser.Selector, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public SelectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorDeclarationContext selectorDeclaration() throws RecognitionException {
		SelectorDeclarationContext _localctx = new SelectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selectorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(Selector);
			setState(433);
			match(Colon);
			setState(434);
			match(StringLiteral);
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
	public static class StandaloneDeclarationContext extends ParserRuleContext {
		public TerminalNode Standalone() { return getToken(AngularParser.Standalone, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public StandaloneDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandaloneDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandaloneDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandaloneDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneDeclarationContext standaloneDeclaration() throws RecognitionException {
		StandaloneDeclarationContext _localctx = new StandaloneDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_standaloneDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(Standalone);
			setState(437);
			match(Colon);
			setState(438);
			match(BooleanLiteral);
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
	public static class ImportsDeclarationContext extends ParserRuleContext {
		public TerminalNode Imports() { return getToken(AngularParser.Imports, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ImportsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsDeclarationContext importsDeclaration() throws RecognitionException {
		ImportsDeclarationContext _localctx = new ImportsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_importsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(Imports);
			setState(441);
			match(Colon);
			setState(442);
			arrayLiteral();
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
	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(AngularParser.Template, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(Template);
			setState(445);
			match(Colon);
			setState(446);
			match(BACKTICK);
			setState(447);
			htmlElements();
			setState(448);
			match(BACKTICK);
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
	public static class StylesDeclarationContext extends ParserRuleContext {
		public TerminalNode Styles() { return getToken(AngularParser.Styles, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public StylesDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesDeclarationContext stylesDeclaration() throws RecognitionException {
		StylesDeclarationContext _localctx = new StylesDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stylesDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(Styles);
			setState(451);
			match(Colon);
			setState(452);
			arrayLiteral();
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
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classBody);
		int _la;
		try {
			int _alt;
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(OpenBrace);
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(455);
						singleExpression(0);
						}
						} 
					}
					setState(460);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				}
				break;
			case Export:
			case CloseBrace:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Export || _la==Identifier) {
					{
					{
					setState(461);
					functionDeclaration();
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(467);
				match(CloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class TemplateStatementContext extends ParserRuleContext {
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TemplateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStatementContext templateStatement() throws RecognitionException {
		TemplateStatementContext _localctx = new TemplateStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_templateStatement);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				htmlElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				singleExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementsContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_htmlElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(474);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(477); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> MoreThan() { return getTokens(AngularParser.MoreThan); }
		public TerminalNode MoreThan(int i) {
			return getToken(AngularParser.MoreThan, i);
		}
		public TerminalNode CLOSE_TAG() { return getToken(AngularParser.CLOSE_TAG, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
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
		enterRule(_localctx, 66, RULE_htmlElement);
		int _la;
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(LessThan);
				setState(480);
				match(Identifier);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137440264224L) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 2097155L) != 0)) {
					{
					{
					setState(481);
					htmlAttribute();
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(487);
				match(MoreThan);
				setState(489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(488);
					htmlContent();
					}
					break;
				}
				setState(491);
				match(CLOSE_TAG);
				setState(492);
				match(Identifier);
				setState(493);
				match(MoreThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(LessThan);
				setState(495);
				match(Identifier);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137440264224L) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 2097155L) != 0)) {
					{
					{
					setState(496);
					htmlAttribute();
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(502);
				match(Divide);
				setState(503);
				match(MoreThan);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
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
		enterRule(_localctx, 68, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185451335680L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 5079743992430857L) != 0)) {
				{
				setState(508);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(506);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(507);
					singleExpression(0);
					}
					break;
				}
				}
				setState(512);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_htmlAttribute);
		int _la;
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(Identifier);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(514);
					match(Assign);
					setState(515);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(OpenBracket);
				setState(519);
				match(Class);
				setState(520);
				match(Dot);
				setState(521);
				match(Identifier);
				setState(522);
				match(CloseBracket);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(523);
					match(Assign);
					setState(524);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				match(OpenParen);
				setState(528);
				match(Identifier);
				setState(529);
				match(CloseParen);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(530);
					match(Assign);
					setState(531);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				directive();
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(535);
					match(Assign);
					setState(536);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(539);
				match(Class);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(540);
					match(Assign);
					setState(541);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(544);
				match(OpenBracket);
				setState(545);
				match(Identifier);
				setState(546);
				match(CloseBracket);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(547);
					match(Assign);
					setState(548);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(551);
				match(Multiply);
				setState(552);
				match(Identifier);
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(553);
					match(Assign);
					setState(554);
					htmlAttributeValue();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class MustacheExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_MUSTACHE() { return getToken(AngularParser.OPEN_MUSTACHE, 0); }
		public TerminalNode CLOSE_MUSTACHE() { return getToken(AngularParser.CLOSE_MUSTACHE, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public MustacheExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mustacheExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMustacheExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMustacheExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMustacheExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MustacheExpressionContext mustacheExpression() throws RecognitionException {
		MustacheExpressionContext _localctx = new MustacheExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mustacheExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(OPEN_MUSTACHE);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185451335680L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 5079743992430857L) != 0)) {
				{
				setState(560);
				singleExpression(0);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(561);
					match(Comma);
					setState(562);
					singleExpression(0);
					}
					}
					setState(567);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(570);
			match(CLOSE_MUSTACHE);
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
	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_htmlAttributeValue);
		int _la;
		try {
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				match(StringLiteral);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(OpenBrace);
				setState(574);
				singleExpression(0);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(575);
					match(Comma);
					setState(576);
					singleExpression(0);
					}
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(582);
				match(CloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(OpenBracket);
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(587);
				match(BACKTICK);
				}
				break;
			}
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185451335680L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 5079743992430857L) != 0)) {
				{
				setState(590);
				singleExpression(0);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(591);
					match(Comma);
					setState(592);
					singleExpression(0);
					}
					}
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKTICK) {
				{
				setState(600);
				match(BACKTICK);
				}
			}

			setState(603);
			match(CloseBracket);
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
	public static class IndexarrayContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public IndexarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIndexarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIndexarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIndexarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexarrayContext indexarray() throws RecognitionException {
		IndexarrayContext _localctx = new IndexarrayContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_indexarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(Identifier);
			setState(606);
			match(OpenBracket);
			setState(607);
			match(DecimalLiteral);
			setState(608);
			match(CloseBracket);
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
	public static class ArrayCssContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<SingleExpressionCssContext> singleExpressionCss() {
			return getRuleContexts(SingleExpressionCssContext.class);
		}
		public SingleExpressionCssContext singleExpressionCss(int i) {
			return getRuleContext(SingleExpressionCssContext.class,i);
		}
		public ArrayCssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCssContext arrayCss() throws RecognitionException {
		ArrayCssContext _localctx = new ArrayCssContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayCss);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(OpenBracket);
			setState(611);
			match(BACKTICK);
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(612);
					singleExpressionCss();
					}
					} 
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(618);
			match(BACKTICK);
			setState(619);
			match(CloseBracket);
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
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(AngularParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(AngularParser.SemiColon, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(OpenBrace);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185451335680L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 5079743992430857L) != 0)) {
				{
				setState(622);
				propertyAssignment();
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(623);
					match(Comma);
					setState(624);
					propertyAssignment();
					}
					}
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SemiColon) {
					{
					{
					setState(630);
					match(SemiColon);
					setState(631);
					propertyAssignment();
					}
					}
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(639);
			match(CloseBrace);
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
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			singleExpression(0);
			setState(642);
			match(Colon);
			setState(643);
			singleExpression(0);
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(644);
				match(SemiColon);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(AngularParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public TerminalNode HexColor() { return getToken(AngularParser.HexColor, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 8598323715L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class NgModuleDeclarationContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(AngularParser.At, 0); }
		public TerminalNode NgModule() { return getToken(AngularParser.NgModule, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public NgModuleAttributesContext ngModuleAttributes() {
			return getRuleContext(NgModuleAttributesContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public NgModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngModuleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgModuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgModuleDeclarationContext ngModuleDeclaration() throws RecognitionException {
		NgModuleDeclarationContext _localctx = new NgModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ngModuleDeclaration);
		try {
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(At);
				setState(650);
				match(NgModule);
				setState(651);
				match(OpenParen);
				setState(652);
				ngModuleAttributes();
				setState(653);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				match(At);
				setState(656);
				match(NgModule);
				setState(657);
				match(Identifier);
				setState(658);
				match(OpenParen);
				setState(659);
				ngModuleAttributes();
				setState(660);
				match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NgModuleAttributesContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<NgModuleAttributeContext> ngModuleAttribute() {
			return getRuleContexts(NgModuleAttributeContext.class);
		}
		public NgModuleAttributeContext ngModuleAttribute(int i) {
			return getRuleContext(NgModuleAttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public NgModuleAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngModuleAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgModuleAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgModuleAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgModuleAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgModuleAttributesContext ngModuleAttributes() throws RecognitionException {
		NgModuleAttributesContext _localctx = new NgModuleAttributesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ngModuleAttributes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(OpenBrace);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Imports || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 15L) != 0)) {
				{
				setState(665);
				ngModuleAttribute();
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(666);
						match(Comma);
						setState(667);
						ngModuleAttribute();
						}
						} 
					}
					setState(672);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(673);
					match(Comma);
					}
				}

				}
			}

			setState(678);
			match(CloseBrace);
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
	public static class NgModuleAttributeContext extends ParserRuleContext {
		public DeclarationsDeclarationContext declarationsDeclaration() {
			return getRuleContext(DeclarationsDeclarationContext.class,0);
		}
		public ImportsDeclarationContext importsDeclaration() {
			return getRuleContext(ImportsDeclarationContext.class,0);
		}
		public ExportsDeclarationContext exportsDeclaration() {
			return getRuleContext(ExportsDeclarationContext.class,0);
		}
		public ProvidersDeclarationContext providersDeclaration() {
			return getRuleContext(ProvidersDeclarationContext.class,0);
		}
		public BootstrapDeclarationContext bootstrapDeclaration() {
			return getRuleContext(BootstrapDeclarationContext.class,0);
		}
		public NgModuleAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngModuleAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgModuleAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgModuleAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgModuleAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgModuleAttributeContext ngModuleAttribute() throws RecognitionException {
		NgModuleAttributeContext _localctx = new NgModuleAttributeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ngModuleAttribute);
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Declarations:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				declarationsDeclaration();
				}
				break;
			case Imports:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				importsDeclaration();
				}
				break;
			case Exports:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				exportsDeclaration();
				}
				break;
			case Providers:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				providersDeclaration();
				}
				break;
			case Bootstrap:
				enterOuterAlt(_localctx, 5);
				{
				setState(684);
				bootstrapDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class DeclarationsDeclarationContext extends ParserRuleContext {
		public TerminalNode Declarations() { return getToken(AngularParser.Declarations, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public DeclarationsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclarationsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclarationsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclarationsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsDeclarationContext declarationsDeclaration() throws RecognitionException {
		DeclarationsDeclarationContext _localctx = new DeclarationsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_declarationsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(Declarations);
			setState(688);
			match(Colon);
			setState(689);
			arrayLiteral();
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
	public static class ExportsDeclarationContext extends ParserRuleContext {
		public TerminalNode Exports() { return getToken(AngularParser.Exports, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ExportsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportsDeclarationContext exportsDeclaration() throws RecognitionException {
		ExportsDeclarationContext _localctx = new ExportsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exportsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(Exports);
			setState(692);
			match(Colon);
			setState(693);
			arrayLiteral();
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
	public static class ProvidersDeclarationContext extends ParserRuleContext {
		public TerminalNode Providers() { return getToken(AngularParser.Providers, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ProvidersDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_providersDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProvidersDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProvidersDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProvidersDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProvidersDeclarationContext providersDeclaration() throws RecognitionException {
		ProvidersDeclarationContext _localctx = new ProvidersDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_providersDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(Providers);
			setState(696);
			match(Colon);
			setState(697);
			arrayLiteral();
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
	public static class BootstrapDeclarationContext extends ParserRuleContext {
		public TerminalNode Bootstrap() { return getToken(AngularParser.Bootstrap, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public BootstrapDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bootstrapDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBootstrapDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBootstrapDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBootstrapDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BootstrapDeclarationContext bootstrapDeclaration() throws RecognitionException {
		BootstrapDeclarationContext _localctx = new BootstrapDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_bootstrapDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(Bootstrap);
			setState(700);
			match(Colon);
			setState(701);
			arrayLiteral();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0087\u02c0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u0001\u0000\u0001\u0000\u0005\u0000i\b\u0000\n\u0000\f"+
		"\u0000l\t\u0000\u0001\u0001\u0003\u0001o\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0005\u0002s\b\u0002\n\u0002\f\u0002v\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003|\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0084\b\u0003"+
		"\u0001\u0003\u0003\u0003\u0087\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u008c\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0092\b\u0004\n\u0004\f\u0004\u0095\t\u0004\u0003\u0004\u0097"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009c\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a1\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00a9\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ae\b"+
		"\u0006\n\u0006\f\u0006\u00b1\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b9\b\u0007\n\u0007"+
		"\f\u0007\u00bc\t\u0007\u0003\u0007\u00be\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0003\b\u00c3\b\b\u0001\b\u0001\b\u0001\b\u0005\b\u00c8\b\b\n"+
		"\b\f\b\u00cb\t\b\u0001\b\u0001\b\u0005\b\u00cf\b\b\n\b\f\b\u00d2\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00d7\b\b\n\b\f\b\u00da\t\b\u0001\b\u0001\b"+
		"\u0003\b\u00de\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0003\n\u00e5"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ea\b\n\n\n\f\n\u00ed\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0003\u000b\u00f2\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00f6\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00fa\b"+
		"\u000b\u0001\u000b\u0003\u000b\u00fd\b\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0102\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u0107\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0116\b\u000e\n\u000e\f\u000e\u0119\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0123\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0129\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u014f\b\u000e\n\u000e\f\u000e\u0152"+
		"\t\u000e\u0001\u000f\u0003\u000f\u0155\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0166\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u016f\b\u0011"+
		"\n\u0011\f\u0011\u0172\t\u0011\u0003\u0011\u0174\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0181\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0185\b\u0014\n\u0014\f\u0014\u0188\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0003\u0016\u0193\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u019d\b\u0017\n\u0017\f\u0017\u01a0\t\u0017\u0001"+
		"\u0017\u0003\u0017\u01a3\b\u0017\u0003\u0017\u01a5\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u01af\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u01c9\b\u001e\n\u001e"+
		"\f\u001e\u01cc\t\u001e\u0001\u001e\u0005\u001e\u01cf\b\u001e\n\u001e\f"+
		"\u001e\u01d2\t\u001e\u0001\u001e\u0003\u001e\u01d5\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01d9\b\u001f\u0001 \u0004 \u01dc\b \u000b \f"+
		" \u01dd\u0001!\u0001!\u0001!\u0005!\u01e3\b!\n!\f!\u01e6\t!\u0001!\u0001"+
		"!\u0003!\u01ea\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u01f2"+
		"\b!\n!\f!\u01f5\t!\u0001!\u0001!\u0003!\u01f9\b!\u0001\"\u0001\"\u0005"+
		"\"\u01fd\b\"\n\"\f\"\u0200\t\"\u0001#\u0001#\u0001#\u0003#\u0205\b#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u020e\b#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u0215\b#\u0001#\u0001#\u0001#\u0003#\u021a"+
		"\b#\u0001#\u0001#\u0001#\u0003#\u021f\b#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u0226\b#\u0001#\u0001#\u0001#\u0001#\u0003#\u022c\b#\u0003#\u022e"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0005$\u0234\b$\n$\f$\u0237\t$\u0003$"+
		"\u0239\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0242"+
		"\b%\n%\f%\u0245\t%\u0001%\u0001%\u0003%\u0249\b%\u0001&\u0001&\u0003&"+
		"\u024d\b&\u0001&\u0001&\u0001&\u0005&\u0252\b&\n&\f&\u0255\t&\u0003&\u0257"+
		"\b&\u0001&\u0003&\u025a\b&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0005(\u0266\b(\n(\f(\u0269\t(\u0001("+
		"\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0005)\u0272\b)\n)\f)\u0275"+
		"\t)\u0001)\u0001)\u0005)\u0279\b)\n)\f)\u027c\t)\u0003)\u027e\b)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0003*\u0286\b*\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u0297\b,\u0001-\u0001-\u0001-\u0001-\u0005-\u029d"+
		"\b-\n-\f-\u02a0\t-\u0001-\u0003-\u02a3\b-\u0003-\u02a5\b-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02ae\b.\u0001/\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00012\u0001\u0267\u0001\u001c3\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0003\u0002\u0000\u0019\u0019"+
		"-.\u0001\u0000ij\u0004\u0000fgoo}}\u0087\u0087\u0307\u0000f\u0001\u0000"+
		"\u0000\u0000\u0002n\u0001\u0000\u0000\u0000\u0004t\u0001\u0000\u0000\u0000"+
		"\u0006\u008b\u0001\u0000\u0000\u0000\b\u00a0\u0001\u0000\u0000\u0000\n"+
		"\u00a8\u0001\u0000\u0000\u0000\f\u00aa\u0001\u0000\u0000\u0000\u000e\u00b4"+
		"\u0001\u0000\u0000\u0000\u0010\u00c2\u0001\u0000\u0000\u0000\u0012\u00df"+
		"\u0001\u0000\u0000\u0000\u0014\u00e4\u0001\u0000\u0000\u0000\u0016\u00fc"+
		"\u0001\u0000\u0000\u0000\u0018\u00fe\u0001\u0000\u0000\u0000\u001a\u0106"+
		"\u0001\u0000\u0000\u0000\u001c\u0128\u0001\u0000\u0000\u0000\u001e\u0154"+
		"\u0001\u0000\u0000\u0000 \u0159\u0001\u0000\u0000\u0000\"\u0169\u0001"+
		"\u0000\u0000\u0000$\u0177\u0001\u0000\u0000\u0000&\u0179\u0001\u0000\u0000"+
		"\u0000(\u0182\u0001\u0000\u0000\u0000*\u018b\u0001\u0000\u0000\u0000,"+
		"\u0192\u0001\u0000\u0000\u0000.\u0198\u0001\u0000\u0000\u00000\u01ae\u0001"+
		"\u0000\u0000\u00002\u01b0\u0001\u0000\u0000\u00004\u01b4\u0001\u0000\u0000"+
		"\u00006\u01b8\u0001\u0000\u0000\u00008\u01bc\u0001\u0000\u0000\u0000:"+
		"\u01c2\u0001\u0000\u0000\u0000<\u01d4\u0001\u0000\u0000\u0000>\u01d8\u0001"+
		"\u0000\u0000\u0000@\u01db\u0001\u0000\u0000\u0000B\u01f8\u0001\u0000\u0000"+
		"\u0000D\u01fe\u0001\u0000\u0000\u0000F\u022d\u0001\u0000\u0000\u0000H"+
		"\u022f\u0001\u0000\u0000\u0000J\u0248\u0001\u0000\u0000\u0000L\u024a\u0001"+
		"\u0000\u0000\u0000N\u025d\u0001\u0000\u0000\u0000P\u0262\u0001\u0000\u0000"+
		"\u0000R\u026d\u0001\u0000\u0000\u0000T\u0281\u0001\u0000\u0000\u0000V"+
		"\u0287\u0001\u0000\u0000\u0000X\u0296\u0001\u0000\u0000\u0000Z\u0298\u0001"+
		"\u0000\u0000\u0000\\\u02ad\u0001\u0000\u0000\u0000^\u02af\u0001\u0000"+
		"\u0000\u0000`\u02b3\u0001\u0000\u0000\u0000b\u02b7\u0001\u0000\u0000\u0000"+
		"d\u02bb\u0001\u0000\u0000\u0000fj\u0003\u0004\u0002\u0000gi\u0003\n\u0005"+
		"\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000k\u0001\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000mo\u0005\u0011\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000o\u0003\u0001\u0000\u0000\u0000pq\u0005"+
		"t\u0000\u0000qs\u0003\u0006\u0003\u0000rp\u0001\u0000\u0000\u0000sv\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"u\u0005\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005\u0016"+
		"\u0000\u0000xy\u0005\u000e\u0000\u0000y{\u0005\u0017\u0000\u0000z|\u0003"+
		"\b\u0004\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}~\u0005d\u0000\u0000~\u007f\u0005o\u0000\u0000\u007f"+
		"\u008c\u0003\u0002\u0001\u0000\u0080\u0081\u0005o\u0000\u0000\u0081\u008c"+
		"\u0003\u0002\u0001\u0000\u0082\u0084\u0005~\u0000\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085\u0087\u0003\b\u0004\u0000\u0086\u0085\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005d\u0000\u0000\u0089\u008a\u0005o\u0000\u0000"+
		"\u008a\u008c\u0003\u0002\u0001\u0000\u008bw\u0001\u0000\u0000\u0000\u008b"+
		"\u0080\u0001\u0000\u0000\u0000\u008b\u0083\u0001\u0000\u0000\u0000\u008c"+
		"\u0007\u0001\u0000\u0000\u0000\u008d\u0096\u0005\u0016\u0000\u0000\u008e"+
		"\u0093\u0005~\u0000\u0000\u008f\u0090\u0005\u0018\u0000\u0000\u0090\u0092"+
		"\u0005~\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0096\u008e\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u00a1\u0005"+
		"\u0017\u0000\u0000\u0099\u009b\u0005\u0016\u0000\u0000\u009a\u009c\u0005"+
		"\b\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00a1\u0005\u0017"+
		"\u0000\u0000\u009e\u009f\u0005\u0016\u0000\u0000\u009f\u00a1\u0005\u0017"+
		"\u0000\u0000\u00a0\u008d\u0001\u0000\u0000\u0000\u00a0\u0099\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\t\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a9\u0003*\u0015\u0000\u00a3\u00a9\u0003X,\u0000\u00a4"+
		"\u00a9\u0003\u0010\b\u0000\u00a5\u00a9\u0003,\u0016\u0000\u00a6\u00a9"+
		"\u0003\f\u0006\u0000\u00a7\u00a9\u0003\u0014\n\u0000\u00a8\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u000b\u0001"+
		"\u0000\u0000\u0000\u00aa\u00af\u0003\u001c\u000e\u0000\u00ab\u00ac\u0005"+
		"\u0018\u0000\u0000\u00ac\u00ae\u0003\u001c\u000e\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003"+
		"\u0002\u0001\u0000\u00b3\r\u0001\u0000\u0000\u0000\u00b4\u00bd\u0005S"+
		"\u0000\u0000\u00b5\u00ba\u0003\u001c\u000e\u0000\u00b6\u00b7\u0005\u0018"+
		"\u0000\u0000\u00b7\u00b9\u0003\u001c\u000e\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00b5\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0003\u0002\u0001\u0000\u00c0\u000f\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c3\u0005\u0006\u0000\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005~\u0000\u0000\u00c5\u00c9\u0005\u0014\u0000"+
		"\u0000\u00c6\u00c8\u0003\u001c\u000e\u0000\u00c7\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00d0\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0018\u0000"+
		"\u0000\u00cd\u00cf\u0003\u001c\u000e\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0015\u0000"+
		"\u0000\u00d4\u00d8\u0005\u0016\u0000\u0000\u00d5\u00d7\u0003\n\u0005\u0000"+
		"\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000"+
		"\u00db\u00dd\u0005\u0017\u0000\u0000\u00dc\u00de\u0003\u0012\t\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u0011\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0006\u0000\u0000\u00e0"+
		"\u00e1\u0005~\u0000\u0000\u00e1\u00e2\u0003\u0002\u0001\u0000\u00e2\u0013"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e5\u0003\u0016\u000b\u0000\u00e4\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00eb\u0003\u0018\f\u0000\u00e7\u00e8\u0005"+
		"\u0018\u0000\u0000\u00e8\u00ea\u0003\u0018\f\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003\u0002"+
		"\u0001\u0000\u00ef\u0015\u0001\u0000\u0000\u0000\u00f0\u00f2\u0005\u0006"+
		"\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00fd\u0005P\u0000"+
		"\u0000\u00f4\u00f6\u0005\u0006\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fd\u0005\u0007\u0000\u0000\u00f8\u00fa\u0005\u0006\u0000"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005s\u0000\u0000"+
		"\u00fc\u00f1\u0001\u0000\u0000\u0000\u00fc\u00f5\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fd\u0017\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0003\u001a\r\u0000\u00ff\u0100\u0005\u0019\u0000\u0000\u0100"+
		"\u0102\u0003\u001c\u000e\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0019\u0001\u0000\u0000\u0000\u0103"+
		"\u0107\u0003L&\u0000\u0104\u0107\u0005~\u0000\u0000\u0105\u0107\u0003"+
		"R)\u0000\u0106\u0103\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u001b\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0006\u000e\uffff\uffff\u0000\u0109\u0129\u0003V+\u0000"+
		"\u010a\u0129\u0003N\'\u0000\u010b\u0129\u0003L&\u0000\u010c\u0129\u0003"+
		" \u0010\u0000\u010d\u0129\u0003R)\u0000\u010e\u0129\u0003H$\u0000\u010f"+
		"\u0129\u0003\u000e\u0007\u0000\u0110\u0129\u0003@ \u0000\u0111\u0112\u0005"+
		"\u0014\u0000\u0000\u0112\u0117\u0003\u001c\u000e\u0000\u0113\u0114\u0005"+
		"\u0018\u0000\u0000\u0114\u0116\u0003\u001c\u000e\u0000\u0115\u0113\u0001"+
		"\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001"+
		"\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		"\u0015\u0000\u0000\u011b\u0129\u0001\u0000\u0000\u0000\u011c\u0129\u0005"+
		"~\u0000\u0000\u011d\u0129\u0005h\u0000\u0000\u011e\u011f\u0005\u0016\u0000"+
		"\u0000\u011f\u0122\u0003\u001c\u000e\u0000\u0120\u0121\u0005\u0014\u0000"+
		"\u0000\u0121\u0123\u0005\u0015\u0000\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005\u0017\u0000\u0000\u0125\u0129\u0001\u0000\u0000"+
		"\u0000\u0126\u0129\u0005[\u0000\u0000\u0127\u0129\u0003\u001e\u000f\u0000"+
		"\u0128\u0108\u0001\u0000\u0000\u0000\u0128\u010a\u0001\u0000\u0000\u0000"+
		"\u0128\u010b\u0001\u0000\u0000\u0000\u0128\u010c\u0001\u0000\u0000\u0000"+
		"\u0128\u010d\u0001\u0000\u0000\u0000\u0128\u010e\u0001\u0000\u0000\u0000"+
		"\u0128\u010f\u0001\u0000\u0000\u0000\u0128\u0110\u0001\u0000\u0000\u0000"+
		"\u0128\u0111\u0001\u0000\u0000\u0000\u0128\u011c\u0001\u0000\u0000\u0000"+
		"\u0128\u011d\u0001\u0000\u0000\u0000\u0128\u011e\u0001\u0000\u0000\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u0150\u0001\u0000\u0000\u0000\u012a\u012b\n\u0013\u0000\u0000\u012b"+
		"\u012c\u0005\u001e\u0000\u0000\u012c\u014f\u0003\u001c\u000e\u0014\u012d"+
		"\u012e\n\u0012\u0000\u0000\u012e\u012f\u0005%\u0000\u0000\u012f\u014f"+
		"\u0003\u001c\u000e\u0013\u0130\u0131\n\u0011\u0000\u0000\u0131\u0132\u0005"+
		"&\u0000\u0000\u0132\u014f\u0003\u001c\u000e\u0012\u0133\u0134\n\u0010"+
		"\u0000\u0000\u0134\u0135\u0005!\u0000\u0000\u0135\u014f\u0003\u001c\u000e"+
		"\u0011\u0136\u0137\n\u000f\u0000\u0000\u0137\u0138\u0005\"\u0000\u0000"+
		"\u0138\u014f\u0003\u001c\u000e\u0010\u0139\u013a\n\u000e\u0000\u0000\u013a"+
		"\u013b\u0005\u001c\u0000\u0000\u013b\u014f\u0003\u001c\u000e\u000f\u013c"+
		"\u013d\n\r\u0000\u0000\u013d\u013e\u00058\u0000\u0000\u013e\u014f\u0003"+
		"\u001c\u000e\u000e\u013f\u0140\n\f\u0000\u0000\u0140\u0141\u0005\u001a"+
		"\u0000\u0000\u0141\u0142\u0003\u001c\u000e\u0000\u0142\u0143\u0005\u001c"+
		"\u0000\u0000\u0143\u0144\u0003\u001c\u000e\r\u0144\u014f\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\n\u000b\u0000\u0000\u0146\u0147\u0005\u0019\u0000\u0000"+
		"\u0147\u014f\u0003\u001c\u000e\f\u0148\u0149\n\n\u0000\u0000\u0149\u014f"+
		"\u0003\u001c\u000e\u000b\u014a\u014b\n\u0005\u0000\u0000\u014b\u014f\u0005"+
		"\u001f\u0000\u0000\u014c\u014d\n\u0003\u0000\u0000\u014d\u014f\u0005 "+
		"\u0000\u0000\u014e\u012a\u0001\u0000\u0000\u0000\u014e\u012d\u0001\u0000"+
		"\u0000\u0000\u014e\u0130\u0001\u0000\u0000\u0000\u014e\u0133\u0001\u0000"+
		"\u0000\u0000\u014e\u0136\u0001\u0000\u0000\u0000\u014e\u0139\u0001\u0000"+
		"\u0000\u0000\u014e\u013c\u0001\u0000\u0000\u0000\u014e\u013f\u0001\u0000"+
		"\u0000\u0000\u014e\u0145\u0001\u0000\u0000\u0000\u014e\u0148\u0001\u0000"+
		"\u0000\u0000\u014e\u014a\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u001d\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0155\u0005\u001e"+
		"\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0005~\u0000"+
		"\u0000\u0157\u0158\u0003R)\u0000\u0158\u001f\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0005V\u0000\u0000\u015a\u015b\u0005\u0014\u0000\u0000\u015b\u015c"+
		"\u0003\u0014\n\u0000\u015c\u015d\u0005~\u0000\u0000\u015d\u015e\u0007"+
		"\u0000\u0000\u0000\u015e\u015f\u0003\u001c\u000e\u0000\u015f\u0160\u0005"+
		"\u0011\u0000\u0000\u0160\u0161\u0003\u001c\u000e\u0000\u0161\u0162\u0005"+
		"\u0015\u0000\u0000\u0162\u0163\u0005\u0016\u0000\u0000\u0163\u0165\u0003"+
		"\u001c\u000e\u0000\u0164\u0166\u0003\u0002\u0001\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0005\u0017\u0000\u0000\u0168!\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0005~\u0000\u0000\u016a\u0173\u0005\u0014\u0000"+
		"\u0000\u016b\u0170\u0003\u001c\u000e\u0000\u016c\u016d\u0005\u0018\u0000"+
		"\u0000\u016d\u016f\u0003\u001c\u000e\u0000\u016e\u016c\u0001\u0000\u0000"+
		"\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000"+
		"\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u016b\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0005\u0015\u0000\u0000\u0176#\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0007\u0001\u0000\u0000\u0178%\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0005^\u0000\u0000\u017a\u017b\u0005\u0014\u0000\u0000\u017b\u017c"+
		"\u0003\u001c\u000e\u0000\u017c\u017d\u0005\u0015\u0000\u0000\u017d\u0180"+
		"\u0003(\u0014\u0000\u017e\u017f\u0005M\u0000\u0000\u017f\u0181\u0003("+
		"\u0014\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181\'\u0001\u0000\u0000\u0000\u0182\u0186\u0005\u0016\u0000"+
		"\u0000\u0183\u0185\u0003\n\u0005\u0000\u0184\u0183\u0001\u0000\u0000\u0000"+
		"\u0185\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000"+
		"\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u018a\u0005\u0017\u0000\u0000"+
		"\u018a)\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0003\u0000\u0000\u018c"+
		"\u018d\u0005\b\u0000\u0000\u018d\u018e\u0005\u0014\u0000\u0000\u018e\u018f"+
		"\u0003.\u0017\u0000\u018f\u0190\u0005\u0015\u0000\u0000\u0190+\u0001\u0000"+
		"\u0000\u0000\u0191\u0193\u0005\u0006\u0000\u0000\u0192\u0191\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0005\u0005\u0000\u0000\u0195\u0196\u0005~\u0000"+
		"\u0000\u0196\u0197\u0003<\u001e\u0000\u0197-\u0001\u0000\u0000\u0000\u0198"+
		"\u01a4\u0005\u0016\u0000\u0000\u0199\u019e\u00030\u0018\u0000\u019a\u019b"+
		"\u0005\u0018\u0000\u0000\u019b\u019d\u00030\u0018\u0000\u019c\u019a\u0001"+
		"\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a3\u0005"+
		"\u0018\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u0199\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0005\u0017\u0000\u0000\u01a7/\u0001\u0000"+
		"\u0000\u0000\u01a8\u01af\u00032\u0019\u0000\u01a9\u01af\u00034\u001a\u0000"+
		"\u01aa\u01af\u00036\u001b\u0000\u01ab\u01af\u00038\u001c\u0000\u01ac\u01af"+
		"\u0003:\u001d\u0000\u01ad\u01af\u0003\u001e\u000f\u0000\u01ae\u01a8\u0001"+
		"\u0000\u0000\u0000\u01ae\u01a9\u0001\u0000\u0000\u0000\u01ae\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ae\u01ab\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af1\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0005\t\u0000\u0000\u01b1\u01b2\u0005\u001c\u0000"+
		"\u0000\u01b2\u01b3\u0005o\u0000\u0000\u01b33\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0005\n\u0000\u0000\u01b5\u01b6\u0005\u001c\u0000\u0000\u01b6\u01b7"+
		"\u0005g\u0000\u0000\u01b75\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u000b"+
		"\u0000\u0000\u01b9\u01ba\u0005\u001c\u0000\u0000\u01ba\u01bb\u0003L&\u0000"+
		"\u01bb7\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005\f\u0000\u0000\u01bd"+
		"\u01be\u0005\u001c\u0000\u0000\u01be\u01bf\u0005\u0004\u0000\u0000\u01bf"+
		"\u01c0\u0003@ \u0000\u01c0\u01c1\u0005\u0004\u0000\u0000\u01c19\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0005\r\u0000\u0000\u01c3\u01c4\u0005\u001c"+
		"\u0000\u0000\u01c4\u01c5\u0003L&\u0000\u01c5;\u0001\u0000\u0000\u0000"+
		"\u01c6\u01ca\u0005\u0016\u0000\u0000\u01c7\u01c9\u0003\u001c\u000e\u0000"+
		"\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000\u0000"+
		"\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cb\u01d5\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cf\u0003\u0010\b\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d5\u0005\u0017\u0000\u0000\u01d4"+
		"\u01c6\u0001\u0000\u0000\u0000\u01d4\u01d0\u0001\u0000\u0000\u0000\u01d5"+
		"=\u0001\u0000\u0000\u0000\u01d6\u01d9\u0003@ \u0000\u01d7\u01d9\u0003"+
		"\u001c\u000e\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d9?\u0001\u0000\u0000\u0000\u01da\u01dc\u0003B!"+
		"\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000"+
		"\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000"+
		"\u0000\u01deA\u0001\u0000\u0000\u0000\u01df\u01e0\u0005-\u0000\u0000\u01e0"+
		"\u01e4\u0005~\u0000\u0000\u01e1\u01e3\u0003F#\u0000\u01e2\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e9\u0005"+
		".\u0000\u0000\u01e8\u01ea\u0003D\"\u0000\u01e9\u01e8\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0005\u0086\u0000\u0000\u01ec\u01ed\u0005~\u0000\u0000"+
		"\u01ed\u01f9\u0005.\u0000\u0000\u01ee\u01ef\u0005-\u0000\u0000\u01ef\u01f3"+
		"\u0005~\u0000\u0000\u01f0\u01f2\u0003F#\u0000\u01f1\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005&\u0000"+
		"\u0000\u01f7\u01f9\u0005.\u0000\u0000\u01f8\u01df\u0001\u0000\u0000\u0000"+
		"\u01f8\u01ee\u0001\u0000\u0000\u0000\u01f9C\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fd\u0003B!\u0000\u01fb\u01fd\u0003\u001c\u000e\u0000\u01fc\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fd\u0200\u0001"+
		"\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001"+
		"\u0000\u0000\u0000\u01ffE\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000"+
		"\u0000\u0000\u0201\u0204\u0005~\u0000\u0000\u0202\u0203\u0005\u0019\u0000"+
		"\u0000\u0203\u0205\u0003J%\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204"+
		"\u0205\u0001\u0000\u0000\u0000\u0205\u022e\u0001\u0000\u0000\u0000\u0206"+
		"\u0207\u0005\u0012\u0000\u0000\u0207\u0208\u0005\u0005\u0000\u0000\u0208"+
		"\u0209\u0005\u001e\u0000\u0000\u0209\u020a\u0005~\u0000\u0000\u020a\u020d"+
		"\u0005\u0013\u0000\u0000\u020b\u020c\u0005\u0019\u0000\u0000\u020c\u020e"+
		"\u0003J%\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000"+
		"\u0000\u0000\u020e\u022e\u0001\u0000\u0000\u0000\u020f\u0210\u0005\u0014"+
		"\u0000\u0000\u0210\u0211\u0005~\u0000\u0000\u0211\u0214\u0005\u0015\u0000"+
		"\u0000\u0212\u0213\u0005\u0019\u0000\u0000\u0213\u0215\u0003J%\u0000\u0214"+
		"\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215"+
		"\u022e\u0001\u0000\u0000\u0000\u0216\u0219\u0003$\u0012\u0000\u0217\u0218"+
		"\u0005\u0019\u0000\u0000\u0218\u021a\u0003J%\u0000\u0219\u0217\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u022e\u0001\u0000"+
		"\u0000\u0000\u021b\u021e\u0005\u0005\u0000\u0000\u021c\u021d\u0005\u0019"+
		"\u0000\u0000\u021d\u021f\u0003J%\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u022e\u0001\u0000\u0000\u0000"+
		"\u0220\u0221\u0005\u0012\u0000\u0000\u0221\u0222\u0005~\u0000\u0000\u0222"+
		"\u0225\u0005\u0013\u0000\u0000\u0223\u0224\u0005\u0019\u0000\u0000\u0224"+
		"\u0226\u0003J%\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001"+
		"\u0000\u0000\u0000\u0226\u022e\u0001\u0000\u0000\u0000\u0227\u0228\u0005"+
		"%\u0000\u0000\u0228\u022b\u0005~\u0000\u0000\u0229\u022a\u0005\u0019\u0000"+
		"\u0000\u022a\u022c\u0003J%\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0001\u0000\u0000\u0000\u022c\u022e\u0001\u0000\u0000\u0000\u022d"+
		"\u0201\u0001\u0000\u0000\u0000\u022d\u0206\u0001\u0000\u0000\u0000\u022d"+
		"\u020f\u0001\u0000\u0000\u0000\u022d\u0216\u0001\u0000\u0000\u0000\u022d"+
		"\u021b\u0001\u0000\u0000\u0000\u022d\u0220\u0001\u0000\u0000\u0000\u022d"+
		"\u0227\u0001\u0000\u0000\u0000\u022eG\u0001\u0000\u0000\u0000\u022f\u0238"+
		"\u0005\u0084\u0000\u0000\u0230\u0235\u0003\u001c\u000e\u0000\u0231\u0232"+
		"\u0005\u0018\u0000\u0000\u0232\u0234\u0003\u001c\u000e\u0000\u0233\u0231"+
		"\u0001\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000\u0000\u0235\u0233"+
		"\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0239"+
		"\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0238\u0230"+
		"\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0005\u0085\u0000\u0000\u023bI\u0001"+
		"\u0000\u0000\u0000\u023c\u0249\u0005o\u0000\u0000\u023d\u023e\u0005\u0016"+
		"\u0000\u0000\u023e\u0243\u0003\u001c\u000e\u0000\u023f\u0240\u0005\u0018"+
		"\u0000\u0000\u0240\u0242\u0003\u001c\u000e\u0000\u0241\u023f\u0001\u0000"+
		"\u0000\u0000\u0242\u0245\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000"+
		"\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0246\u0001\u0000"+
		"\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0246\u0247\u0005\u0017"+
		"\u0000\u0000\u0247\u0249\u0001\u0000\u0000\u0000\u0248\u023c\u0001\u0000"+
		"\u0000\u0000\u0248\u023d\u0001\u0000\u0000\u0000\u0249K\u0001\u0000\u0000"+
		"\u0000\u024a\u024c\u0005\u0012\u0000\u0000\u024b\u024d\u0005\u0004\u0000"+
		"\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000"+
		"\u0000\u024d\u0256\u0001\u0000\u0000\u0000\u024e\u0253\u0003\u001c\u000e"+
		"\u0000\u024f\u0250\u0005\u0018\u0000\u0000\u0250\u0252\u0003\u001c\u000e"+
		"\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0255\u0001\u0000\u0000"+
		"\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000"+
		"\u0000\u0254\u0257\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000"+
		"\u0000\u0256\u024e\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000"+
		"\u0000\u0257\u0259\u0001\u0000\u0000\u0000\u0258\u025a\u0005\u0004\u0000"+
		"\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0005\u0013\u0000"+
		"\u0000\u025cM\u0001\u0000\u0000\u0000\u025d\u025e\u0005~\u0000\u0000\u025e"+
		"\u025f\u0005\u0012\u0000\u0000\u025f\u0260\u0005}\u0000\u0000\u0260\u0261"+
		"\u0005\u0013\u0000\u0000\u0261O\u0001\u0000\u0000\u0000\u0262\u0263\u0005"+
		"\u0012\u0000\u0000\u0263\u0267\u0005\u0004\u0000\u0000\u0264\u0266\u0003"+
		"\u001e\u000f\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0266\u0269\u0001"+
		"\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0267\u0265\u0001"+
		"\u0000\u0000\u0000\u0268\u026a\u0001\u0000\u0000\u0000\u0269\u0267\u0001"+
		"\u0000\u0000\u0000\u026a\u026b\u0005\u0004\u0000\u0000\u026b\u026c\u0005"+
		"\u0013\u0000\u0000\u026cQ\u0001\u0000\u0000\u0000\u026d\u027d\u0005\u0016"+
		"\u0000\u0000\u026e\u0273\u0003T*\u0000\u026f\u0270\u0005\u0018\u0000\u0000"+
		"\u0270\u0272\u0003T*\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0272\u0275"+
		"\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0001\u0000\u0000\u0000\u0274\u027a\u0001\u0000\u0000\u0000\u0275\u0273"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u0005\u0011\u0000\u0000\u0277\u0279"+
		"\u0003T*\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027c\u0001\u0000"+
		"\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000"+
		"\u0000\u0000\u027b\u027e\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000"+
		"\u0000\u0000\u027d\u026e\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000"+
		"\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0005\u0017"+
		"\u0000\u0000\u0280S\u0001\u0000\u0000\u0000\u0281\u0282\u0003\u001c\u000e"+
		"\u0000\u0282\u0283\u0005\u001c\u0000\u0000\u0283\u0285\u0003\u001c\u000e"+
		"\u0000\u0284\u0286\u0005\u0011\u0000\u0000\u0285\u0284\u0001\u0000\u0000"+
		"\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286U\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0007\u0002\u0000\u0000\u0288W\u0001\u0000\u0000\u0000\u0289"+
		"\u028a\u0005\u0003\u0000\u0000\u028a\u028b\u0005\u000e\u0000\u0000\u028b"+
		"\u028c\u0005\u0014\u0000\u0000\u028c\u028d\u0003Z-\u0000\u028d\u028e\u0005"+
		"\u0015\u0000\u0000\u028e\u0297\u0001\u0000\u0000\u0000\u028f\u0290\u0005"+
		"\u0003\u0000\u0000\u0290\u0291\u0005\u000e\u0000\u0000\u0291\u0292\u0005"+
		"~\u0000\u0000\u0292\u0293\u0005\u0014\u0000\u0000\u0293\u0294\u0003Z-"+
		"\u0000\u0294\u0295\u0005\u0015\u0000\u0000\u0295\u0297\u0001\u0000\u0000"+
		"\u0000\u0296\u0289\u0001\u0000\u0000\u0000\u0296\u028f\u0001\u0000\u0000"+
		"\u0000\u0297Y\u0001\u0000\u0000\u0000\u0298\u02a4\u0005\u0016\u0000\u0000"+
		"\u0299\u029e\u0003\\.\u0000\u029a\u029b\u0005\u0018\u0000\u0000\u029b"+
		"\u029d\u0003\\.\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029d\u02a0"+
		"\u0001\u0000\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\u0001\u0000\u0000\u0000\u029f\u02a2\u0001\u0000\u0000\u0000\u02a0\u029e"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a3\u0005\u0018\u0000\u0000\u02a2\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a4\u0299\u0001\u0000\u0000\u0000\u02a4\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a7"+
		"\u0005\u0017\u0000\u0000\u02a7[\u0001\u0000\u0000\u0000\u02a8\u02ae\u0003"+
		"^/\u0000\u02a9\u02ae\u00036\u001b\u0000\u02aa\u02ae\u0003`0\u0000\u02ab"+
		"\u02ae\u0003b1\u0000\u02ac\u02ae\u0003d2\u0000\u02ad\u02a8\u0001\u0000"+
		"\u0000\u0000\u02ad\u02a9\u0001\u0000\u0000\u0000\u02ad\u02aa\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ae]\u0001\u0000\u0000\u0000\u02af\u02b0\u0005n\u0000\u0000"+
		"\u02b0\u02b1\u0005\u001c\u0000\u0000\u02b1\u02b2\u0003L&\u0000\u02b2_"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005m\u0000\u0000\u02b4\u02b5\u0005"+
		"\u001c\u0000\u0000\u02b5\u02b6\u0003L&\u0000\u02b6a\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0005l\u0000\u0000\u02b8\u02b9\u0005\u001c\u0000\u0000"+
		"\u02b9\u02ba\u0003L&\u0000\u02bac\u0001\u0000\u0000\u0000\u02bb\u02bc"+
		"\u0005k\u0000\u0000\u02bc\u02bd\u0005\u001c\u0000\u0000\u02bd\u02be\u0003"+
		"L&\u0000\u02bee\u0001\u0000\u0000\u0000Qjnt{\u0083\u0086\u008b\u0093\u0096"+
		"\u009b\u00a0\u00a8\u00af\u00ba\u00bd\u00c2\u00c9\u00d0\u00d8\u00dd\u00e4"+
		"\u00eb\u00f1\u00f5\u00f9\u00fc\u0101\u0106\u0117\u0122\u0128\u014e\u0150"+
		"\u0154\u0165\u0170\u0173\u0180\u0186\u0192\u019e\u01a2\u01a4\u01ae\u01ca"+
		"\u01d0\u01d4\u01d8\u01dd\u01e4\u01e9\u01f3\u01f8\u01fc\u01fe\u0204\u020d"+
		"\u0214\u0219\u021e\u0225\u022b\u022d\u0235\u0238\u0243\u0248\u024c\u0253"+
		"\u0256\u0259\u0267\u0273\u027a\u027d\u0285\u0296\u029e\u02a2\u02a4\u02ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}