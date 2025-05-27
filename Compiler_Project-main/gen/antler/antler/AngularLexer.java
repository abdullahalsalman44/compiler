// Generated from C:/Users/hazem/OneDrive/Desktop/4/compiler_test/CompilerProject/src/antler/antler/AngularLexer.g4 by ANTLR 4.13.2
package antler.antler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_TAG_OPEN=1, HTML_TAG_CLOSE=2, HTML_ATTR_NAME=3, HTML_ATTR_VALUE=4, 
		HTML_TEXT=5, CSS_SELECTOR=6, CSS_PROPERTY=7, CSS_VALUE=8, CSS_BLOCK_START=9, 
		CSS_BLOCK_END=10, CSS_SEMICOLON=11, TS_KEYWORD=12, TS_IDENTIFIER=13, TS_STRING=14, 
		TS_NUMBER=15, TS_OPERATOR=16, IDENTIFIER=17, EQUAL=18, COLON=19, SEMICOLON=20, 
		WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HTML_TAG_OPEN", "HTML_TAG_CLOSE", "HTML_ATTR_NAME", "HTML_ATTR_VALUE", 
			"HTML_TEXT", "CSS_SELECTOR", "CSS_PROPERTY", "CSS_VALUE", "CSS_BLOCK_START", 
			"CSS_BLOCK_END", "CSS_SEMICOLON", "TS_KEYWORD", "TS_IDENTIFIER", "TS_STRING", 
			"TS_NUMBER", "TS_OPERATOR", "IDENTIFIER", "EQUAL", "COLON", "SEMICOLON", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'{'", "'}'", null, 
			null, null, null, null, null, null, "'='", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_TAG_OPEN", "HTML_TAG_CLOSE", "HTML_ATTR_NAME", "HTML_ATTR_VALUE", 
			"HTML_TEXT", "CSS_SELECTOR", "CSS_PROPERTY", "CSS_VALUE", "CSS_BLOCK_START", 
			"CSS_BLOCK_END", "CSS_SEMICOLON", "TS_KEYWORD", "TS_IDENTIFIER", "TS_STRING", 
			"TS_NUMBER", "TS_OPERATOR", "IDENTIFIER", "EQUAL", "COLON", "SEMICOLON", 
			"WS"
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


	public AngularLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AngularLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u00a9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u00039\b\u0003\n\u0003\f\u0003<\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0004\u0004A\b\u0004\u000b\u0004\f\u0004B\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007J\b"+
		"\u0007\u000b\u0007\f\u0007K\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000br\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rx\b\r\n\r"+
		"\f\r{\t\r\u0001\r\u0001\r\u0001\r\u0005\r\u0080\b\r\n\r\f\r\u0083\t\r"+
		"\u0001\r\u0003\r\u0086\b\r\u0001\u000e\u0004\u000e\u0089\b\u000e\u000b"+
		"\u000e\f\u000e\u008a\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0094\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0098\b\u0010\n\u0010\f\u0010\u009b\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0004\u0014\u00a4\b\u0014\u000b\u0014\f\u0014\u00a5\u0001\u0014\u0001"+
		"\u0014\u0003:y\u0081\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015\u0001\u0000\u0007\u0001\u0000<<\u0002\u0000\'\';;\u0001"+
		"\u000009\u0003\u0000*+--//\u0003\u0000AZ__az\u0005\u0000--09AZ__az\u0003"+
		"\u0000\t\n\r\r  \u00b8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003.\u0001"+
		"\u0000\u0000\u0000\u00054\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000"+
		"\u0000\t@\u0001\u0000\u0000\u0000\u000bD\u0001\u0000\u0000\u0000\rF\u0001"+
		"\u0000\u0000\u0000\u000fI\u0001\u0000\u0000\u0000\u0011M\u0001\u0000\u0000"+
		"\u0000\u0013O\u0001\u0000\u0000\u0000\u0015Q\u0001\u0000\u0000\u0000\u0017"+
		"q\u0001\u0000\u0000\u0000\u0019s\u0001\u0000\u0000\u0000\u001b\u0085\u0001"+
		"\u0000\u0000\u0000\u001d\u0088\u0001\u0000\u0000\u0000\u001f\u0093\u0001"+
		"\u0000\u0000\u0000!\u0095\u0001\u0000\u0000\u0000#\u009c\u0001\u0000\u0000"+
		"\u0000%\u009e\u0001\u0000\u0000\u0000\'\u00a0\u0001\u0000\u0000\u0000"+
		")\u00a3\u0001\u0000\u0000\u0000+,\u0005<\u0000\u0000,-\u0003!\u0010\u0000"+
		"-\u0002\u0001\u0000\u0000\u0000./\u0005<\u0000\u0000/0\u0005/\u0000\u0000"+
		"01\u0001\u0000\u0000\u000012\u0003!\u0010\u000023\u0005>\u0000\u00003"+
		"\u0004\u0001\u0000\u0000\u000045\u0003!\u0010\u00005\u0006\u0001\u0000"+
		"\u0000\u00006:\u0005\"\u0000\u000079\t\u0000\u0000\u000087\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=>\u0005\"\u0000\u0000>\b\u0001\u0000\u0000\u0000?A\b\u0000\u0000\u0000"+
		"@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000C\n\u0001\u0000\u0000\u0000DE\u0003!\u0010"+
		"\u0000E\f\u0001\u0000\u0000\u0000FG\u0003!\u0010\u0000G\u000e\u0001\u0000"+
		"\u0000\u0000HJ\b\u0001\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0010"+
		"\u0001\u0000\u0000\u0000MN\u0005{\u0000\u0000N\u0012\u0001\u0000\u0000"+
		"\u0000OP\u0005}\u0000\u0000P\u0014\u0001\u0000\u0000\u0000QR\u0005;\u0000"+
		"\u0000R\u0016\u0001\u0000\u0000\u0000ST\u0005l\u0000\u0000TU\u0005e\u0000"+
		"\u0000Ur\u0005t\u0000\u0000VW\u0005c\u0000\u0000WX\u0005o\u0000\u0000"+
		"XY\u0005n\u0000\u0000YZ\u0005s\u0000\u0000Zr\u0005t\u0000\u0000[\\\u0005"+
		"f\u0000\u0000\\]\u0005u\u0000\u0000]^\u0005n\u0000\u0000^_\u0005c\u0000"+
		"\u0000_`\u0005t\u0000\u0000`a\u0005i\u0000\u0000ab\u0005o\u0000\u0000"+
		"br\u0005n\u0000\u0000cd\u0005c\u0000\u0000de\u0005l\u0000\u0000ef\u0005"+
		"a\u0000\u0000fg\u0005s\u0000\u0000gr\u0005s\u0000\u0000hi\u0005i\u0000"+
		"\u0000ij\u0005n\u0000\u0000jk\u0005t\u0000\u0000kl\u0005e\u0000\u0000"+
		"lm\u0005r\u0000\u0000mn\u0005f\u0000\u0000no\u0005a\u0000\u0000op\u0005"+
		"c\u0000\u0000pr\u0005e\u0000\u0000qS\u0001\u0000\u0000\u0000qV\u0001\u0000"+
		"\u0000\u0000q[\u0001\u0000\u0000\u0000qc\u0001\u0000\u0000\u0000qh\u0001"+
		"\u0000\u0000\u0000r\u0018\u0001\u0000\u0000\u0000st\u0003!\u0010\u0000"+
		"t\u001a\u0001\u0000\u0000\u0000uy\u0005\"\u0000\u0000vx\t\u0000\u0000"+
		"\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|\u0086\u0005\"\u0000\u0000}\u0081\u0005\'\u0000\u0000"+
		"~\u0080\t\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0005\'\u0000\u0000\u0085u\u0001"+
		"\u0000\u0000\u0000\u0085}\u0001\u0000\u0000\u0000\u0086\u001c\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0007\u0002\u0000\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u001e\u0001\u0000"+
		"\u0000\u0000\u008c\u0094\u0005=\u0000\u0000\u008d\u008e\u0005=\u0000\u0000"+
		"\u008e\u0094\u0005=\u0000\u0000\u008f\u0090\u0005=\u0000\u0000\u0090\u0091"+
		"\u0005=\u0000\u0000\u0091\u0094\u0005=\u0000\u0000\u0092\u0094\u0007\u0003"+
		"\u0000\u0000\u0093\u008c\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000"+
		"\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0094 \u0001\u0000\u0000\u0000\u0095\u0099\u0007\u0004\u0000"+
		"\u0000\u0096\u0098\u0007\u0005\u0000\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\"\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005=\u0000\u0000\u009d"+
		"$\u0001\u0000\u0000\u0000\u009e\u009f\u0005:\u0000\u0000\u009f&\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005;\u0000\u0000\u00a1(\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0007\u0006\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0006\u0014\u0000\u0000\u00a8*\u0001\u0000\u0000\u0000"+
		"\f\u0000:BKqy\u0081\u0085\u008a\u0093\u0099\u00a5\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}