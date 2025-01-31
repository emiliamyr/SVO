// Generated from C:/Users/emili/PycharmProjects/pythonProject19/SVO.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SVOParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRONOUN=1, PRONOUN_SINGULAR=2, PRONOUN_I=3, DETERMINER=4, DETERMINER_SINGULAR=5, 
		NOUN_SINGULAR=6, NOUN_PLURAL=7, ADJECTIVE=8, AUXILIARY_PRESENT=9, AUXILIARY_PRESENT_I=10, 
		AUXILIARY_PRESENT_PLURAL=11, AUXILIARY_PRESENT_HAS=12, AUXILIARY_PRESENT_HAVE=13, 
		AUXILIARY_PAST=14, AUXILIARY_PAST_PLURAL=15, AUXILIARY_FUTURE=16, AUXILIARY_INFINITIVE=17, 
		VERB_PRESENT=18, VERB_PAST=19, VERB_FUTURE=20, PREPOSITION=21, CONJ=22, 
		WS=23;
	public static final int
		RULE_start = 0, RULE_sentence = 1, RULE_nounPhrase = 2, RULE_nounPhrasePlural = 3, 
		RULE_nounPhraseI = 4, RULE_prepositionalPhrase = 5, RULE_verbPhrase = 6, 
		RULE_verbPhrasePlural = 7, RULE_verbPhraseI = 8, RULE_tense = 9, RULE_tensePlural = 10, 
		RULE_tenseI = 11, RULE_past = 12, RULE_present = 13, RULE_future = 14, 
		RULE_pastPlural = 15, RULE_presentPlural = 16, RULE_presentI = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sentence", "nounPhrase", "nounPhrasePlural", "nounPhraseI", 
			"prepositionalPhrase", "verbPhrase", "verbPhrasePlural", "verbPhraseI", 
			"tense", "tensePlural", "tenseI", "past", "present", "future", "pastPlural", 
			"presentPlural", "presentI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'I'", null, null, null, null, null, "'is'", "'am'", 
			"'are'", "'has'", "'have'", null, null, "'will'", "'be'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRONOUN", "PRONOUN_SINGULAR", "PRONOUN_I", "DETERMINER", "DETERMINER_SINGULAR", 
			"NOUN_SINGULAR", "NOUN_PLURAL", "ADJECTIVE", "AUXILIARY_PRESENT", "AUXILIARY_PRESENT_I", 
			"AUXILIARY_PRESENT_PLURAL", "AUXILIARY_PRESENT_HAS", "AUXILIARY_PRESENT_HAVE", 
			"AUXILIARY_PAST", "AUXILIARY_PAST_PLURAL", "AUXILIARY_FUTURE", "AUXILIARY_INFINITIVE", 
			"VERB_PRESENT", "VERB_PAST", "VERB_FUTURE", "PREPOSITION", "CONJ", "WS"
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
	public String getGrammarFileName() { return "SVO.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SVOParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SVOParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			sentence(0);
			setState(37);
			match(EOF);
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
	public static class SentenceContext extends ParserRuleContext {
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public VerbPhraseContext verbPhrase() {
			return getRuleContext(VerbPhraseContext.class,0);
		}
		public NounPhrasePluralContext nounPhrasePlural() {
			return getRuleContext(NounPhrasePluralContext.class,0);
		}
		public VerbPhrasePluralContext verbPhrasePlural() {
			return getRuleContext(VerbPhrasePluralContext.class,0);
		}
		public NounPhraseIContext nounPhraseI() {
			return getRuleContext(NounPhraseIContext.class,0);
		}
		public VerbPhraseIContext verbPhraseI() {
			return getRuleContext(VerbPhraseIContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode CONJ() { return getToken(SVOParser.CONJ, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		return sentence(0);
	}

	private SentenceContext sentence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SentenceContext _localctx = new SentenceContext(_ctx, _parentState);
		SentenceContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_sentence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(40);
				nounPhrase();
				setState(41);
				verbPhrase();
				}
				break;
			case 2:
				{
				setState(43);
				nounPhrasePlural();
				setState(44);
				verbPhrasePlural();
				}
				break;
			case 3:
				{
				setState(46);
				nounPhraseI();
				setState(47);
				verbPhraseI();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SentenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sentence);
					setState(51);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(52);
					match(CONJ);
					setState(53);
					sentence(5);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class NounPhraseContext extends ParserRuleContext {
		public TerminalNode PRONOUN_SINGULAR() { return getToken(SVOParser.PRONOUN_SINGULAR, 0); }
		public TerminalNode DETERMINER_SINGULAR() { return getToken(SVOParser.DETERMINER_SINGULAR, 0); }
		public TerminalNode DETERMINER() { return getToken(SVOParser.DETERMINER, 0); }
		public TerminalNode NOUN_SINGULAR() { return getToken(SVOParser.NOUN_SINGULAR, 0); }
		public PrepositionalPhraseContext prepositionalPhrase() {
			return getRuleContext(PrepositionalPhraseContext.class,0);
		}
		public List<TerminalNode> ADJECTIVE() { return getTokens(SVOParser.ADJECTIVE); }
		public TerminalNode ADJECTIVE(int i) {
			return getToken(SVOParser.ADJECTIVE, i);
		}
		public NounPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterNounPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitNounPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitNounPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounPhraseContext nounPhrase() throws RecognitionException {
		NounPhraseContext _localctx = new NounPhraseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nounPhrase);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN_SINGULAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(PRONOUN_SINGULAR);
				}
				break;
			case DETERMINER:
			case DETERMINER_SINGULAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				_la = _input.LA(1);
				if ( !(_la==DETERMINER || _la==DETERMINER_SINGULAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(61);
					match(NOUN_SINGULAR);
					}
					break;
				case 2:
					{
					{
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ADJECTIVE) {
						{
						{
						setState(62);
						match(ADJECTIVE);
						}
						}
						setState(67);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(68);
					match(NOUN_SINGULAR);
					}
					}
					break;
				}
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(71);
					prepositionalPhrase();
					}
					break;
				}
				}
				break;
			case NOUN_SINGULAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(NOUN_SINGULAR);
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
	public static class NounPhrasePluralContext extends ParserRuleContext {
		public TerminalNode PRONOUN() { return getToken(SVOParser.PRONOUN, 0); }
		public TerminalNode NOUN_PLURAL() { return getToken(SVOParser.NOUN_PLURAL, 0); }
		public TerminalNode DETERMINER() { return getToken(SVOParser.DETERMINER, 0); }
		public PrepositionalPhraseContext prepositionalPhrase() {
			return getRuleContext(PrepositionalPhraseContext.class,0);
		}
		public List<TerminalNode> ADJECTIVE() { return getTokens(SVOParser.ADJECTIVE); }
		public TerminalNode ADJECTIVE(int i) {
			return getToken(SVOParser.ADJECTIVE, i);
		}
		public NounPhrasePluralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounPhrasePlural; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterNounPhrasePlural(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitNounPhrasePlural(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitNounPhrasePlural(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounPhrasePluralContext nounPhrasePlural() throws RecognitionException {
		NounPhrasePluralContext _localctx = new NounPhrasePluralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nounPhrasePlural);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(PRONOUN);
				}
				break;
			case NOUN_PLURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(NOUN_PLURAL);
				}
				break;
			case DETERMINER:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(DETERMINER);
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(80);
					match(NOUN_PLURAL);
					}
					break;
				case 2:
					{
					{
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ADJECTIVE) {
						{
						{
						setState(81);
						match(ADJECTIVE);
						}
						}
						setState(86);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(87);
					match(NOUN_PLURAL);
					}
					}
					break;
				}
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(90);
					prepositionalPhrase();
					}
					break;
				}
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
	public static class NounPhraseIContext extends ParserRuleContext {
		public TerminalNode PRONOUN_I() { return getToken(SVOParser.PRONOUN_I, 0); }
		public TerminalNode DETERMINER() { return getToken(SVOParser.DETERMINER, 0); }
		public TerminalNode NOUN_SINGULAR() { return getToken(SVOParser.NOUN_SINGULAR, 0); }
		public PrepositionalPhraseContext prepositionalPhrase() {
			return getRuleContext(PrepositionalPhraseContext.class,0);
		}
		public List<TerminalNode> ADJECTIVE() { return getTokens(SVOParser.ADJECTIVE); }
		public TerminalNode ADJECTIVE(int i) {
			return getToken(SVOParser.ADJECTIVE, i);
		}
		public NounPhraseIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounPhraseI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterNounPhraseI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitNounPhraseI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitNounPhraseI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounPhraseIContext nounPhraseI() throws RecognitionException {
		NounPhraseIContext _localctx = new NounPhraseIContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nounPhraseI);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN_I:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(PRONOUN_I);
				}
				break;
			case DETERMINER:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(DETERMINER);
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(97);
					match(NOUN_SINGULAR);
					}
					break;
				case 2:
					{
					{
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ADJECTIVE) {
						{
						{
						setState(98);
						match(ADJECTIVE);
						}
						}
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(104);
					match(NOUN_SINGULAR);
					}
					}
					break;
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREPOSITION) {
					{
					setState(107);
					prepositionalPhrase();
					}
				}

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
	public static class PrepositionalPhraseContext extends ParserRuleContext {
		public TerminalNode PREPOSITION() { return getToken(SVOParser.PREPOSITION, 0); }
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public NounPhrasePluralContext nounPhrasePlural() {
			return getRuleContext(NounPhrasePluralContext.class,0);
		}
		public PrepositionalPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepositionalPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterPrepositionalPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitPrepositionalPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitPrepositionalPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrepositionalPhraseContext prepositionalPhrase() throws RecognitionException {
		PrepositionalPhraseContext _localctx = new PrepositionalPhraseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_prepositionalPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PREPOSITION);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(113);
				nounPhrase();
				}
				break;
			case 2:
				{
				setState(114);
				nounPhrasePlural();
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
	public static class VerbPhraseContext extends ParserRuleContext {
		public TenseContext tense() {
			return getRuleContext(TenseContext.class,0);
		}
		public TerminalNode ADJECTIVE() { return getToken(SVOParser.ADJECTIVE, 0); }
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public PrepositionalPhraseContext prepositionalPhrase() {
			return getRuleContext(PrepositionalPhraseContext.class,0);
		}
		public NounPhrasePluralContext nounPhrasePlural() {
			return getRuleContext(NounPhrasePluralContext.class,0);
		}
		public VerbPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterVerbPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitVerbPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitVerbPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbPhraseContext verbPhrase() throws RecognitionException {
		VerbPhraseContext _localctx = new VerbPhraseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_verbPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			tense();
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(118);
					nounPhrase();
					}
					break;
				case 2:
					{
					setState(119);
					prepositionalPhrase();
					}
					break;
				case 3:
					{
					setState(120);
					nounPhrasePlural();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(123);
				match(ADJECTIVE);
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
	public static class VerbPhrasePluralContext extends ParserRuleContext {
		public TensePluralContext tensePlural() {
			return getRuleContext(TensePluralContext.class,0);
		}
		public TerminalNode ADJECTIVE() { return getToken(SVOParser.ADJECTIVE, 0); }
		public NounPhrasePluralContext nounPhrasePlural() {
			return getRuleContext(NounPhrasePluralContext.class,0);
		}
		public PrepositionalPhraseContext prepositionalPhrase() {
			return getRuleContext(PrepositionalPhraseContext.class,0);
		}
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public VerbPhrasePluralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbPhrasePlural; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterVerbPhrasePlural(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitVerbPhrasePlural(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitVerbPhrasePlural(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbPhrasePluralContext verbPhrasePlural() throws RecognitionException {
		VerbPhrasePluralContext _localctx = new VerbPhrasePluralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_verbPhrasePlural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			tensePlural();
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(127);
					nounPhrasePlural();
					}
					break;
				case 2:
					{
					setState(128);
					prepositionalPhrase();
					}
					break;
				case 3:
					{
					setState(129);
					nounPhrase();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(132);
				match(ADJECTIVE);
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
	public static class VerbPhraseIContext extends ParserRuleContext {
		public TenseIContext tenseI() {
			return getRuleContext(TenseIContext.class,0);
		}
		public TerminalNode ADJECTIVE() { return getToken(SVOParser.ADJECTIVE, 0); }
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public PrepositionalPhraseContext prepositionalPhrase() {
			return getRuleContext(PrepositionalPhraseContext.class,0);
		}
		public NounPhrasePluralContext nounPhrasePlural() {
			return getRuleContext(NounPhrasePluralContext.class,0);
		}
		public VerbPhraseIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbPhraseI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterVerbPhraseI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitVerbPhraseI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitVerbPhraseI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbPhraseIContext verbPhraseI() throws RecognitionException {
		VerbPhraseIContext _localctx = new VerbPhraseIContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_verbPhraseI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			tenseI();
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(136);
					nounPhrase();
					}
					break;
				case 2:
					{
					setState(137);
					prepositionalPhrase();
					}
					break;
				case 3:
					{
					setState(138);
					nounPhrasePlural();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(141);
				match(ADJECTIVE);
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
	public static class TenseContext extends ParserRuleContext {
		public PastContext past() {
			return getRuleContext(PastContext.class,0);
		}
		public PresentContext present() {
			return getRuleContext(PresentContext.class,0);
		}
		public FutureContext future() {
			return getRuleContext(FutureContext.class,0);
		}
		public TenseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tense; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterTense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitTense(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitTense(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TenseContext tense() throws RecognitionException {
		TenseContext _localctx = new TenseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tense);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUXILIARY_PAST:
			case VERB_PAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				past();
				}
				break;
			case AUXILIARY_PRESENT:
			case AUXILIARY_PRESENT_HAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				present();
				}
				break;
			case AUXILIARY_FUTURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				future();
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
	public static class TensePluralContext extends ParserRuleContext {
		public PastPluralContext pastPlural() {
			return getRuleContext(PastPluralContext.class,0);
		}
		public PresentPluralContext presentPlural() {
			return getRuleContext(PresentPluralContext.class,0);
		}
		public FutureContext future() {
			return getRuleContext(FutureContext.class,0);
		}
		public TensePluralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensePlural; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterTensePlural(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitTensePlural(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitTensePlural(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TensePluralContext tensePlural() throws RecognitionException {
		TensePluralContext _localctx = new TensePluralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tensePlural);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUXILIARY_PAST_PLURAL:
			case VERB_PAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				pastPlural();
				}
				break;
			case AUXILIARY_PRESENT_PLURAL:
			case AUXILIARY_PRESENT_HAVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				presentPlural();
				}
				break;
			case AUXILIARY_FUTURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				future();
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
	public static class TenseIContext extends ParserRuleContext {
		public PastContext past() {
			return getRuleContext(PastContext.class,0);
		}
		public PresentIContext presentI() {
			return getRuleContext(PresentIContext.class,0);
		}
		public FutureContext future() {
			return getRuleContext(FutureContext.class,0);
		}
		public TenseIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tenseI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterTenseI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitTenseI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitTenseI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TenseIContext tenseI() throws RecognitionException {
		TenseIContext _localctx = new TenseIContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tenseI);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUXILIARY_PAST:
			case VERB_PAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				past();
				}
				break;
			case AUXILIARY_PRESENT_I:
			case AUXILIARY_PRESENT_HAVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				presentI();
				}
				break;
			case AUXILIARY_FUTURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				future();
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
	public static class PastContext extends ParserRuleContext {
		public TerminalNode AUXILIARY_PAST() { return getToken(SVOParser.AUXILIARY_PAST, 0); }
		public TerminalNode VERB_PAST() { return getToken(SVOParser.VERB_PAST, 0); }
		public PastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_past; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterPast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitPast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitPast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PastContext past() throws RecognitionException {
		PastContext _localctx = new PastContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_past);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(AUXILIARY_PAST);
				setState(160);
				match(VERB_PAST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(VERB_PAST);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(AUXILIARY_PAST);
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
	public static class PresentContext extends ParserRuleContext {
		public TerminalNode AUXILIARY_PRESENT() { return getToken(SVOParser.AUXILIARY_PRESENT, 0); }
		public TerminalNode VERB_PRESENT() { return getToken(SVOParser.VERB_PRESENT, 0); }
		public TerminalNode AUXILIARY_PRESENT_HAS() { return getToken(SVOParser.AUXILIARY_PRESENT_HAS, 0); }
		public PresentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_present; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterPresent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitPresent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitPresent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PresentContext present() throws RecognitionException {
		PresentContext _localctx = new PresentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_present);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(AUXILIARY_PRESENT);
				setState(166);
				match(VERB_PRESENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(AUXILIARY_PRESENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(AUXILIARY_PRESENT_HAS);
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
	public static class FutureContext extends ParserRuleContext {
		public TerminalNode AUXILIARY_FUTURE() { return getToken(SVOParser.AUXILIARY_FUTURE, 0); }
		public TerminalNode VERB_FUTURE() { return getToken(SVOParser.VERB_FUTURE, 0); }
		public TerminalNode AUXILIARY_INFINITIVE() { return getToken(SVOParser.AUXILIARY_INFINITIVE, 0); }
		public List<TerminalNode> AUXILIARY_PRESENT() { return getTokens(SVOParser.AUXILIARY_PRESENT); }
		public TerminalNode AUXILIARY_PRESENT(int i) {
			return getToken(SVOParser.AUXILIARY_PRESENT, i);
		}
		public FutureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_future; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterFuture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitFuture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitFuture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FutureContext future() throws RecognitionException {
		FutureContext _localctx = new FutureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_future);
		try {
			int _alt;
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(AUXILIARY_FUTURE);
				setState(172);
				match(VERB_FUTURE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(AUXILIARY_FUTURE);
				setState(174);
				match(AUXILIARY_INFINITIVE);
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(175);
						match(AUXILIARY_PRESENT);
						}
						} 
					}
					setState(180);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
	public static class PastPluralContext extends ParserRuleContext {
		public TerminalNode AUXILIARY_PAST_PLURAL() { return getToken(SVOParser.AUXILIARY_PAST_PLURAL, 0); }
		public TerminalNode VERB_PAST() { return getToken(SVOParser.VERB_PAST, 0); }
		public PastPluralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pastPlural; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterPastPlural(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitPastPlural(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitPastPlural(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PastPluralContext pastPlural() throws RecognitionException {
		PastPluralContext _localctx = new PastPluralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pastPlural);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(AUXILIARY_PAST_PLURAL);
				setState(184);
				match(VERB_PAST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(VERB_PAST);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(AUXILIARY_PAST_PLURAL);
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
	public static class PresentPluralContext extends ParserRuleContext {
		public TerminalNode AUXILIARY_PRESENT_PLURAL() { return getToken(SVOParser.AUXILIARY_PRESENT_PLURAL, 0); }
		public TerminalNode VERB_PRESENT() { return getToken(SVOParser.VERB_PRESENT, 0); }
		public TerminalNode AUXILIARY_PRESENT_HAVE() { return getToken(SVOParser.AUXILIARY_PRESENT_HAVE, 0); }
		public PresentPluralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_presentPlural; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterPresentPlural(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitPresentPlural(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitPresentPlural(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PresentPluralContext presentPlural() throws RecognitionException {
		PresentPluralContext _localctx = new PresentPluralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_presentPlural);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(AUXILIARY_PRESENT_PLURAL);
				setState(190);
				match(VERB_PRESENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(AUXILIARY_PRESENT_PLURAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(AUXILIARY_PRESENT_HAVE);
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
	public static class PresentIContext extends ParserRuleContext {
		public TerminalNode AUXILIARY_PRESENT_I() { return getToken(SVOParser.AUXILIARY_PRESENT_I, 0); }
		public TerminalNode VERB_PRESENT() { return getToken(SVOParser.VERB_PRESENT, 0); }
		public TerminalNode AUXILIARY_PRESENT_HAVE() { return getToken(SVOParser.AUXILIARY_PRESENT_HAVE, 0); }
		public PresentIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_presentI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).enterPresentI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVOListener ) ((SVOListener)listener).exitPresentI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVOVisitor ) return ((SVOVisitor<? extends T>)visitor).visitPresentI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PresentIContext presentI() throws RecognitionException {
		PresentIContext _localctx = new PresentIContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_presentI);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(AUXILIARY_PRESENT_I);
				setState(196);
				match(VERB_PRESENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(AUXILIARY_PRESENT_I);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(AUXILIARY_PRESENT_HAVE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return sentence_sempred((SentenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sentence_sempred(SentenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u00ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00012\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00017\b\u0001"+
		"\n\u0001\f\u0001:\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002@\b\u0002\n\u0002\f\u0002C\t\u0002\u0001\u0002\u0003\u0002"+
		"F\b\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0002\u0003\u0002L\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003S\b\u0003\n\u0003\f\u0003V\t\u0003\u0001\u0003\u0003\u0003Y\b\u0003"+
		"\u0001\u0003\u0003\u0003\\\b\u0003\u0003\u0003^\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004d\b\u0004\n\u0004\f\u0004g\t"+
		"\u0004\u0001\u0004\u0003\u0004j\b\u0004\u0001\u0004\u0003\u0004m\b\u0004"+
		"\u0003\u0004o\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"t\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"z\b\u0006\u0001\u0006\u0003\u0006}\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007\u0001\u0007\u0003\u0007\u0086"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008c\b\b\u0001\b\u0003"+
		"\b\u008f\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u0094\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u0099\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u009e\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a4\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00aa\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b1\b\u000e\n\u000e\f\u000e"+
		"\u00b4\t\u000e\u0003\u000e\u00b6\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00bc\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00c2\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00c8\b\u0011\u0001\u0011\u0000\u0001\u0002"+
		"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0001\u0001\u0000\u0004\u0005\u00e7\u0000"+
		"$\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0004K\u0001"+
		"\u0000\u0000\u0000\u0006]\u0001\u0000\u0000\u0000\bn\u0001\u0000\u0000"+
		"\u0000\np\u0001\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000\u000e~\u0001"+
		"\u0000\u0000\u0000\u0010\u0087\u0001\u0000\u0000\u0000\u0012\u0093\u0001"+
		"\u0000\u0000\u0000\u0014\u0098\u0001\u0000\u0000\u0000\u0016\u009d\u0001"+
		"\u0000\u0000\u0000\u0018\u00a3\u0001\u0000\u0000\u0000\u001a\u00a9\u0001"+
		"\u0000\u0000\u0000\u001c\u00b5\u0001\u0000\u0000\u0000\u001e\u00bb\u0001"+
		"\u0000\u0000\u0000 \u00c1\u0001\u0000\u0000\u0000\"\u00c7\u0001\u0000"+
		"\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005\u0000\u0000\u0001&\u0001"+
		"\u0001\u0000\u0000\u0000\'(\u0006\u0001\uffff\uffff\u0000()\u0003\u0004"+
		"\u0002\u0000)*\u0003\f\u0006\u0000*2\u0001\u0000\u0000\u0000+,\u0003\u0006"+
		"\u0003\u0000,-\u0003\u000e\u0007\u0000-2\u0001\u0000\u0000\u0000./\u0003"+
		"\b\u0004\u0000/0\u0003\u0010\b\u000002\u0001\u0000\u0000\u00001\'\u0001"+
		"\u0000\u0000\u00001+\u0001\u0000\u0000\u00001.\u0001\u0000\u0000\u0000"+
		"28\u0001\u0000\u0000\u000034\n\u0004\u0000\u000045\u0005\u0016\u0000\u0000"+
		"57\u0003\u0002\u0001\u000563\u0001\u0000\u0000\u00007:\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u0003\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;L\u0005\u0002\u0000\u0000"+
		"<E\u0007\u0000\u0000\u0000=F\u0005\u0006\u0000\u0000>@\u0005\b\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DF\u0005\u0006\u0000\u0000E=\u0001\u0000\u0000\u0000EA\u0001"+
		"\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GI\u0003\n\u0005\u0000HG\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JL\u0005\u0006\u0000\u0000K;\u0001\u0000\u0000\u0000K<\u0001\u0000\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000M^\u0005"+
		"\u0001\u0000\u0000N^\u0005\u0007\u0000\u0000OX\u0005\u0004\u0000\u0000"+
		"PY\u0005\u0007\u0000\u0000QS\u0005\b\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0005\u0007"+
		"\u0000\u0000XP\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000Y[\u0001"+
		"\u0000\u0000\u0000Z\\\u0003\n\u0005\u0000[Z\u0001\u0000\u0000\u0000[\\"+
		"\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]M\u0001\u0000\u0000"+
		"\u0000]N\u0001\u0000\u0000\u0000]O\u0001\u0000\u0000\u0000^\u0007\u0001"+
		"\u0000\u0000\u0000_o\u0005\u0003\u0000\u0000`i\u0005\u0004\u0000\u0000"+
		"aj\u0005\u0006\u0000\u0000bd\u0005\b\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hj\u0005\u0006"+
		"\u0000\u0000ia\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000jl\u0001"+
		"\u0000\u0000\u0000km\u0003\n\u0005\u0000lk\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000n_\u0001\u0000\u0000\u0000"+
		"n`\u0001\u0000\u0000\u0000o\t\u0001\u0000\u0000\u0000ps\u0005\u0015\u0000"+
		"\u0000qt\u0003\u0004\u0002\u0000rt\u0003\u0006\u0003\u0000sq\u0001\u0000"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000t\u000b\u0001\u0000\u0000\u0000"+
		"u|\u0003\u0012\t\u0000vz\u0003\u0004\u0002\u0000wz\u0003\n\u0005\u0000"+
		"xz\u0003\u0006\u0003\u0000yv\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z}\u0001\u0000"+
		"\u0000\u0000{}\u0005\b\u0000\u0000|y\u0001\u0000\u0000\u0000|{\u0001\u0000"+
		"\u0000\u0000}\r\u0001\u0000\u0000\u0000~\u0085\u0003\u0014\n\u0000\u007f"+
		"\u0083\u0003\u0006\u0003\u0000\u0080\u0083\u0003\n\u0005\u0000\u0081\u0083"+
		"\u0003\u0004\u0002\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0005\b\u0000\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u008e\u0003"+
		"\u0016\u000b\u0000\u0088\u008c\u0003\u0004\u0002\u0000\u0089\u008c\u0003"+
		"\n\u0005\u0000\u008a\u008c\u0003\u0006\u0003\u0000\u008b\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000"+
		"\u0000\u0000\u008d\u008f\u0005\b\u0000\u0000\u008e\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0011\u0001\u0000\u0000"+
		"\u0000\u0090\u0094\u0003\u0018\f\u0000\u0091\u0094\u0003\u001a\r\u0000"+
		"\u0092\u0094\u0003\u001c\u000e\u0000\u0093\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0013\u0001\u0000\u0000\u0000\u0095\u0099\u0003\u001e\u000f\u0000"+
		"\u0096\u0099\u0003 \u0010\u0000\u0097\u0099\u0003\u001c\u000e\u0000\u0098"+
		"\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u0015\u0001\u0000\u0000\u0000\u009a"+
		"\u009e\u0003\u0018\f\u0000\u009b\u009e\u0003\"\u0011\u0000\u009c\u009e"+
		"\u0003\u001c\u000e\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u0017"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000e\u0000\u0000\u00a0\u00a4"+
		"\u0005\u0013\u0000\u0000\u00a1\u00a4\u0005\u0013\u0000\u0000\u00a2\u00a4"+
		"\u0005\u000e\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u0019"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\t\u0000\u0000\u00a6\u00aa\u0005"+
		"\u0012\u0000\u0000\u00a7\u00aa\u0005\t\u0000\u0000\u00a8\u00aa\u0005\f"+
		"\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u001b\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\u0010\u0000\u0000\u00ac\u00b6\u0005\u0014"+
		"\u0000\u0000\u00ad\u00ae\u0005\u0010\u0000\u0000\u00ae\u00b2\u0005\u0011"+
		"\u0000\u0000\u00af\u00b1\u0005\t\u0000\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00ab\u0001\u0000\u0000"+
		"\u0000\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b6\u001d\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8\u00bc\u0005\u0013\u0000"+
		"\u0000\u00b9\u00bc\u0005\u0013\u0000\u0000\u00ba\u00bc\u0005\u000f\u0000"+
		"\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u001f\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005\u000b\u0000\u0000\u00be\u00c2\u0005\u0012\u0000"+
		"\u0000\u00bf\u00c2\u0005\u000b\u0000\u0000\u00c0\u00c2\u0005\r\u0000\u0000"+
		"\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2!\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0005\n\u0000\u0000\u00c4\u00c8\u0005\u0012\u0000\u0000\u00c5\u00c8"+
		"\u0005\n\u0000\u0000\u00c6\u00c8\u0005\r\u0000\u0000\u00c7\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8#\u0001\u0000\u0000\u0000\u001f18AEHKTX[]eiln"+
		"sy|\u0082\u0085\u008b\u008e\u0093\u0098\u009d\u00a3\u00a9\u00b2\u00b5"+
		"\u00bb\u00c1\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}