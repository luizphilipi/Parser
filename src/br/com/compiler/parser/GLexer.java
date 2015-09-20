// Generated from G.g4 by ANTLR 4.5.1
package br.com.compiler.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, COMMENT=34, IDENTIFIER=35, NUMBER=36, STRING=37, BOOLEAN=38, 
		WHITESPACE=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"COMMENT", "IDENTIFIER", "NUMBER", "STRING", "BOOLEAN", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "';'", "'}'", "'constructor'", "'('", "')'", "'break'", 
		"'if'", "'else'", "'while'", "'switch'", "'case'", "'default'", "'for'", 
		"'/'", "'*'", "'-'", "'+'", "'<'", "'<='", "'>'", "'>='", "'='", "'++'", 
		"'--'", "'println('", "'return'", "','", "'int'", "'string'", "'boolean'", 
		"'float'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "COMMENT", 
		"IDENTIFIER", "NUMBER", "STRING", "BOOLEAN", "WHITESPACE"
	};
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


	public GLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "G.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u0126\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u00e3\n#\f#\16"+
		"#\u00e6\13#\3#\5#\u00e9\n#\3#\3#\3#\3#\3#\7#\u00f0\n#\f#\16#\u00f3\13"+
		"#\3#\3#\5#\u00f7\n#\3#\3#\3$\3$\7$\u00fd\n$\f$\16$\u0100\13$\3%\6%\u0103"+
		"\n%\r%\16%\u0104\3&\3&\3&\3&\3&\5&\u010c\n&\7&\u010e\n&\f&\16&\u0111\13"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u011e\n\'\3(\6(\u0121"+
		"\n(\r(\16(\u0122\3(\3(\3\u00f1\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\b\4\2\f\f\17"+
		"\17\4\2C\\c|\5\2\62;C\\c|\3\2\62;\6\2\f\f\17\17$$^^\5\2\13\f\17\17\"\""+
		"\u0130\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5W\3"+
		"\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3"+
		"\2\2\2\23s\3\2\2\2\25v\3\2\2\2\27{\3\2\2\2\31\u0081\3\2\2\2\33\u0088\3"+
		"\2\2\2\35\u008d\3\2\2\2\37\u0095\3\2\2\2!\u0099\3\2\2\2#\u009b\3\2\2\2"+
		"%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a1\3\2\2\2+\u00a3\3\2\2\2-\u00a6\3"+
		"\2\2\2/\u00a8\3\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00b0\3\2\2"+
		"\2\67\u00b3\3\2\2\29\u00bc\3\2\2\2;\u00c3\3\2\2\2=\u00c5\3\2\2\2?\u00c9"+
		"\3\2\2\2A\u00d0\3\2\2\2C\u00d8\3\2\2\2E\u00f6\3\2\2\2G\u00fa\3\2\2\2I"+
		"\u0102\3\2\2\2K\u0106\3\2\2\2M\u011d\3\2\2\2O\u0120\3\2\2\2QR\7e\2\2R"+
		"S\7n\2\2ST\7c\2\2TU\7u\2\2UV\7u\2\2V\4\3\2\2\2WX\7}\2\2X\6\3\2\2\2YZ\7"+
		"=\2\2Z\b\3\2\2\2[\\\7\177\2\2\\\n\3\2\2\2]^\7e\2\2^_\7q\2\2_`\7p\2\2`"+
		"a\7u\2\2ab\7v\2\2bc\7t\2\2cd\7w\2\2de\7e\2\2ef\7v\2\2fg\7q\2\2gh\7t\2"+
		"\2h\f\3\2\2\2ij\7*\2\2j\16\3\2\2\2kl\7+\2\2l\20\3\2\2\2mn\7d\2\2no\7t"+
		"\2\2op\7g\2\2pq\7c\2\2qr\7m\2\2r\22\3\2\2\2st\7k\2\2tu\7h\2\2u\24\3\2"+
		"\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2yz\7g\2\2z\26\3\2\2\2{|\7y\2\2|}\7j\2\2"+
		"}~\7k\2\2~\177\7n\2\2\177\u0080\7g\2\2\u0080\30\3\2\2\2\u0081\u0082\7"+
		"u\2\2\u0082\u0083\7y\2\2\u0083\u0084\7k\2\2\u0084\u0085\7v\2\2\u0085\u0086"+
		"\7e\2\2\u0086\u0087\7j\2\2\u0087\32\3\2\2\2\u0088\u0089\7e\2\2\u0089\u008a"+
		"\7c\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\34\3\2\2\2\u008d\u008e"+
		"\7f\2\2\u008e\u008f\7g\2\2\u008f\u0090\7h\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7w\2\2\u0092\u0093\7n\2\2\u0093\u0094\7v\2\2\u0094\36\3\2\2\2\u0095"+
		"\u0096\7h\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098 \3\2\2\2\u0099"+
		"\u009a\7\61\2\2\u009a\"\3\2\2\2\u009b\u009c\7,\2\2\u009c$\3\2\2\2\u009d"+
		"\u009e\7/\2\2\u009e&\3\2\2\2\u009f\u00a0\7-\2\2\u00a0(\3\2\2\2\u00a1\u00a2"+
		"\7>\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7?\2\2\u00a5,\3"+
		"\2\2\2\u00a6\u00a7\7@\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\62\3\2\2\2\u00ad\u00ae"+
		"\7-\2\2\u00ae\u00af\7-\2\2\u00af\64\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2"+
		"\7/\2\2\u00b2\66\3\2\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6"+
		"\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7n\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7*\2\2\u00bb8\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7t\2\2"+
		"\u00c1\u00c2\7p\2\2\u00c2:\3\2\2\2\u00c3\u00c4\7.\2\2\u00c4<\3\2\2\2\u00c5"+
		"\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8>\3\2\2\2\u00c9"+
		"\u00ca\7u\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2\2"+
		"\u00cd\u00ce\7p\2\2\u00ce\u00cf\7i\2\2\u00cf@\3\2\2\2\u00d0\u00d1\7d\2"+
		"\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7p\2\2\u00d7B\3\2\2\2\u00d8\u00d9"+
		"\7h\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7v\2\2\u00ddD\3\2\2\2\u00de\u00df\7\61\2\2\u00df\u00e0\7\61\2\2"+
		"\u00e0\u00e4\3\2\2\2\u00e1\u00e3\n\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e9\7\17\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f7\7\f\2\2\u00eb\u00ec\7\61\2\2\u00ec"+
		"\u00ed\7,\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00f0\13\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7,\2\2\u00f5\u00f7\7\61"+
		"\2\2\u00f6\u00de\3\2\2\2\u00f6\u00eb\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\b#\2\2\u00f9F\3\2\2\2\u00fa\u00fe\t\3\2\2\u00fb\u00fd\t\4\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ffH\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\t\5\2\2\u0102\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"J\3\2\2\2\u0106\u010f\7$\2\2\u0107\u010e\n\6\2\2\u0108\u010b\7^\2\2\u0109"+
		"\u010c\13\2\2\2\u010a\u010c\7\2\2\3\u010b\u0109\3\2\2\2\u010b\u010a\3"+
		"\2\2\2\u010c\u010e\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0108\3\2\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7$\2\2\u0113L\3\2\2\2\u0114\u0115"+
		"\7v\2\2\u0115\u0116\7t\2\2\u0116\u0117\7w\2\2\u0117\u011e\7g\2\2\u0118"+
		"\u0119\7h\2\2\u0119\u011a\7c\2\2\u011a\u011b\7n\2\2\u011b\u011c\7u\2\2"+
		"\u011c\u011e\7g\2\2\u011d\u0114\3\2\2\2\u011d\u0118\3\2\2\2\u011eN\3\2"+
		"\2\2\u011f\u0121\t\7\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b("+
		"\2\2\u0125P\3\2\2\2\16\2\u00e4\u00e8\u00f1\u00f6\u00fe\u0104\u010b\u010d"+
		"\u010f\u011d\u0122\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}