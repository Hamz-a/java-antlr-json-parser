// Generated from C:/Users/Hamza/github/Antlr Json Parser/src/main/java/com/example/antlr\Json.g4 by ANTLR 4.5.3
package com.example.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, NUMBER=11, WhiteSpace=12, MultiLineComments=13, Comments=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"STRING", "ESCAPE", "UNICODE", "HEXADECIMAL", "NUMBER", "EXPONENT", "INTEGER", 
		"DIGIT", "WhiteSpace", "MultiLineComments", "Comments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "STRING", 
		"NUMBER", "WhiteSpace", "MultiLineComments", "Comments"
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


	public JsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Json.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\7\13K\n\13\f\13\16\13N\13\13\3\13\3\13\3\f\3\f"+
		"\3\f\5\fU\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\5\17`\n\17\3\17\3"+
		"\17\3\17\6\17e\n\17\r\17\16\17f\3\17\5\17j\n\17\3\17\5\17m\n\17\3\20\3"+
		"\20\5\20q\n\20\3\20\6\20t\n\20\r\20\16\20u\3\21\3\21\3\21\6\21{\n\21\r"+
		"\21\16\21|\5\21\177\n\21\3\22\3\22\3\23\6\23\u0084\n\23\r\23\16\23\u0085"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u008e\n\24\f\24\16\24\u0091\13\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u009c\n\25\f\25\16"+
		"\25\u009f\13\25\3\25\3\25\3\u008f\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\2\31\2\33\2\35\r\37\2!\2#\2%\16\'\17)\20\3\2\t\4\2$$"+
		"^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\4\2GGgg\5\2--//^^\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\35\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-"+
		"\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2"+
		"\2\2\21<\3\2\2\2\23B\3\2\2\2\25G\3\2\2\2\27Q\3\2\2\2\31V\3\2\2\2\33\\"+
		"\3\2\2\2\35_\3\2\2\2\37n\3\2\2\2!~\3\2\2\2#\u0080\3\2\2\2%\u0083\3\2\2"+
		"\2\'\u0089\3\2\2\2)\u0097\3\2\2\2+,\7}\2\2,\4\3\2\2\2-.\7.\2\2.\6\3\2"+
		"\2\2/\60\7\177\2\2\60\b\3\2\2\2\61\62\7<\2\2\62\n\3\2\2\2\63\64\7]\2\2"+
		"\64\f\3\2\2\2\65\66\7_\2\2\66\16\3\2\2\2\678\7v\2\289\7t\2\29:\7w\2\2"+
		":;\7g\2\2;\20\3\2\2\2<=\7h\2\2=>\7c\2\2>?\7n\2\2?@\7u\2\2@A\7g\2\2A\22"+
		"\3\2\2\2BC\7p\2\2CD\7w\2\2DE\7n\2\2EF\7n\2\2F\24\3\2\2\2GL\7$\2\2HK\n"+
		"\2\2\2IK\5\27\f\2JH\3\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO"+
		"\3\2\2\2NL\3\2\2\2OP\7$\2\2P\26\3\2\2\2QT\7^\2\2RU\t\3\2\2SU\5\31\r\2"+
		"TR\3\2\2\2TS\3\2\2\2U\30\3\2\2\2VW\7w\2\2WX\5\33\16\2XY\5\33\16\2YZ\5"+
		"\33\16\2Z[\5\33\16\2[\32\3\2\2\2\\]\t\4\2\2]\34\3\2\2\2^`\7/\2\2_^\3\2"+
		"\2\2_`\3\2\2\2`a\3\2\2\2al\5!\21\2bd\7\60\2\2ce\5#\22\2dc\3\2\2\2ef\3"+
		"\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\5\37\20\2ih\3\2\2\2ij\3\2\2\2j"+
		"m\3\2\2\2km\5\37\20\2lb\3\2\2\2lk\3\2\2\2lm\3\2\2\2m\36\3\2\2\2np\t\5"+
		"\2\2oq\t\6\2\2po\3\2\2\2pq\3\2\2\2qs\3\2\2\2rt\5!\21\2sr\3\2\2\2tu\3\2"+
		"\2\2us\3\2\2\2uv\3\2\2\2v \3\2\2\2w\177\7\62\2\2xz\4\63;\2y{\5#\22\2z"+
		"y\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~w\3\2\2\2~x\3\2\2"+
		"\2\177\"\3\2\2\2\u0080\u0081\4\62;\2\u0081$\3\2\2\2\u0082\u0084\t\7\2"+
		"\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\23\2\2\u0088&\3\2\2\2\u0089"+
		"\u008a\7\61\2\2\u008a\u008b\7,\2\2\u008b\u008f\3\2\2\2\u008c\u008e\13"+
		"\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7,"+
		"\2\2\u0093\u0094\7\61\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\24\2\2\u0096"+
		"(\3\2\2\2\u0097\u0098\7\61\2\2\u0098\u0099\7\61\2\2\u0099\u009d\3\2\2"+
		"\2\u009a\u009c\n\b\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a1\b\25\2\2\u00a1*\3\2\2\2\21\2JLT_filpu|~\u0085\u008f\u009d\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}