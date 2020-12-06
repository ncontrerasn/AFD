// Generated from C:/Users/Nicolas Contreras/Desktop/AFD/grammar\GrammarAFD.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarAFDParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DECL_ALF=14, ESTADO=15, WS=16, 
		COMMENT=17, LINE_COMMENT=18;
	public static final int
		RULE_automata = 0, RULE_alfabeto = 1, RULE_estados = 2, RULE_e_inicial = 3, 
		RULE_e_final = 4, RULE_e_intermedio = 5, RULE_transiciones = 6, RULE_transicion = 7, 
		RULE_conjunto_transiciones = 8, RULE_predicado = 9, RULE_conjunto_predicados = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"automata", "alfabeto", "estados", "e_inicial", "e_final", "e_intermedio", 
			"transiciones", "transicion", "conjunto_transiciones", "predicado", "conjunto_predicados"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fin'", "'alfabeto'", "'['", "','", "']'", "'.'", "'E_inicial'", 
			"'E_final'", "'E_intermedio'", "'pasa_a'", "'con'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "DECL_ALF", "ESTADO", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "GrammarAFD.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarAFDParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AutomataContext extends ParserRuleContext {
		public AlfabetoContext alfabeto() {
			return getRuleContext(AlfabetoContext.class,0);
		}
		public EstadosContext estados() {
			return getRuleContext(EstadosContext.class,0);
		}
		public TransicionesContext transiciones() {
			return getRuleContext(TransicionesContext.class,0);
		}
		public AutomataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).enterAutomata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).exitAutomata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAFDVisitor ) return ((GrammarAFDVisitor<? extends T>)visitor).visitAutomata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomataContext automata() throws RecognitionException {
		AutomataContext _localctx = new AutomataContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_automata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			alfabeto();
			setState(23);
			estados();
			setState(24);
			transiciones();
			setState(25);
			match(T__0);
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

	public static class AlfabetoContext extends ParserRuleContext {
		public List<TerminalNode> DECL_ALF() { return getTokens(GrammarAFDParser.DECL_ALF); }
		public TerminalNode DECL_ALF(int i) {
			return getToken(GrammarAFDParser.DECL_ALF, i);
		}
		public AlfabetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alfabeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).enterAlfabeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).exitAlfabeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAFDVisitor ) return ((GrammarAFDVisitor<? extends T>)visitor).visitAlfabeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlfabetoContext alfabeto() throws RecognitionException {
		AlfabetoContext _localctx = new AlfabetoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alfabeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__1);
			setState(28);
			match(T__2);
			setState(29);
			match(DECL_ALF);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(30);
				match(T__3);
				setState(31);
				match(DECL_ALF);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(T__4);
			setState(38);
			match(T__5);
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

	public static class EstadosContext extends ParserRuleContext {
		public E_inicialContext e_inicial() {
			return getRuleContext(E_inicialContext.class,0);
		}
		public E_finalContext e_final() {
			return getRuleContext(E_finalContext.class,0);
		}
		public E_intermedioContext e_intermedio() {
			return getRuleContext(E_intermedioContext.class,0);
		}
		public EstadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).enterEstados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).exitEstados(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAFDVisitor ) return ((GrammarAFDVisitor<? extends T>)visitor).visitEstados(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstadosContext estados() throws RecognitionException {
		EstadosContext _localctx = new EstadosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_estados);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			e_inicial();
			setState(41);
			match(T__3);
			setState(42);
			e_final();
			setState(43);
			match(T__3);
			setState(44);
			e_intermedio();
			setState(45);
			match(T__5);
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

	public static class E_inicialContext extends ParserRuleContext {
		public TerminalNode ESTADO() { return getToken(GrammarAFDParser.ESTADO, 0); }
		public E_inicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_inicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).enterE_inicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).exitE_inicial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAFDVisitor ) return ((GrammarAFDVisitor<? extends T>)visitor).visitE_inicial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_inicialContext e_inicial() throws RecognitionException {
		E_inicialContext _localctx = new E_inicialContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_e_inicial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__6);
			setState(48);
			match(ESTADO);
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

	public static class E_finalContext extends ParserRuleContext {
		public TerminalNode ESTADO() { return getToken(GrammarAFDParser.ESTADO, 0); }
		public E_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).enterE_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).exitE_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAFDVisitor ) return ((GrammarAFDVisitor<? extends T>)visitor).visitE_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_finalContext e_final() throws RecognitionException {
		E_finalContext _localctx = new E_finalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_e_final);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__7);
			setState(51);
			match(ESTADO);
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

	public static class E_intermedioContext extends ParserRuleContext {
		public List<TerminalNode> ESTADO() { return getTokens(GrammarAFDParser.ESTADO); }
		public TerminalNode ESTADO(int i) {
			return getToken(GrammarAFDParser.ESTADO, i);
		}
		public E_intermedioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_intermedio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).enterE_intermedio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).exitE_intermedio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAFDVisitor ) return ((GrammarAFDVisitor<? extends T>)visitor).visitE_intermedio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_intermedioContext e_intermedio() throws RecognitionException {
		E_intermedioContext _localctx = new E_intermedioContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_e_intermedio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__8);
			setState(54);
			match(ESTADO);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(55);
				match(T__3);
				setState(56);
				match(ESTADO);
				}
				}
				setState(61);
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

	public static class TransicionesContext extends ParserRuleContext {
		public TransicionContext transicion() {
			return getRuleContext(TransicionContext.class,0);
		}
		public Conjunto_transicionesContext conjunto_transiciones() {
			return getRuleContext(Conjunto_transicionesContext.class,0);
		}
		public TransicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transiciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).enterTransiciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).exitTransiciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAFDVisitor ) return ((GrammarAFDVisitor<? extends T>)visitor).visitTransiciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransicionesContext transiciones() throws RecognitionException {
		TransicionesContext _localctx = new TransicionesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transiciones);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				transicion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				conjunto_transiciones();
				setState(64);
				match(T__5);
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

	public static class TransicionContext extends ParserRuleContext {
		public TerminalNode ESTADO() { return getToken(GrammarAFDParser.ESTADO, 0); }
		public PredicadoContext predicado() {
			return getRuleContext(PredicadoContext.class,0);
		}
		public Conjunto_predicadosContext conjunto_predicados() {
			return getRuleContext(Conjunto_predicadosContext.class,0);
		}
		public TransicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).enterTransicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).exitTransicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAFDVisitor ) return ((GrammarAFDVisitor<? extends T>)visitor).visitTransicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransicionContext transicion() throws RecognitionException {
		TransicionContext _localctx = new TransicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ESTADO);
			setState(69);
			match(T__9);
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTADO:
				{
				setState(70);
				predicado();
				}
				break;
			case T__11:
				{
				setState(71);
				conjunto_predicados();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Conjunto_transicionesContext extends ParserRuleContext {
		public List<TransicionContext> transicion() {
			return getRuleContexts(TransicionContext.class);
		}
		public TransicionContext transicion(int i) {
			return getRuleContext(TransicionContext.class,i);
		}
		public Conjunto_transicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto_transiciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).enterConjunto_transiciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).exitConjunto_transiciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAFDVisitor ) return ((GrammarAFDVisitor<? extends T>)visitor).visitConjunto_transiciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conjunto_transicionesContext conjunto_transiciones() throws RecognitionException {
		Conjunto_transicionesContext _localctx = new Conjunto_transicionesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conjunto_transiciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			transicion();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(75);
				match(T__3);
				setState(76);
				transicion();
				}
				}
				setState(81);
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

	public static class PredicadoContext extends ParserRuleContext {
		public TerminalNode ESTADO() { return getToken(GrammarAFDParser.ESTADO, 0); }
		public List<TerminalNode> DECL_ALF() { return getTokens(GrammarAFDParser.DECL_ALF); }
		public TerminalNode DECL_ALF(int i) {
			return getToken(GrammarAFDParser.DECL_ALF, i);
		}
		public PredicadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).enterPredicado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).exitPredicado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAFDVisitor ) return ((GrammarAFDVisitor<? extends T>)visitor).visitPredicado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicadoContext predicado() throws RecognitionException {
		PredicadoContext _localctx = new PredicadoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predicado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ESTADO);
			setState(83);
			match(T__10);
			setState(84);
			match(T__2);
			setState(85);
			match(DECL_ALF);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(86);
				match(T__3);
				setState(87);
				match(DECL_ALF);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__4);
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

	public static class Conjunto_predicadosContext extends ParserRuleContext {
		public List<PredicadoContext> predicado() {
			return getRuleContexts(PredicadoContext.class);
		}
		public PredicadoContext predicado(int i) {
			return getRuleContext(PredicadoContext.class,i);
		}
		public Conjunto_predicadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto_predicados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).enterConjunto_predicados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarAFDListener ) ((GrammarAFDListener)listener).exitConjunto_predicados(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAFDVisitor ) return ((GrammarAFDVisitor<? extends T>)visitor).visitConjunto_predicados(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conjunto_predicadosContext conjunto_predicados() throws RecognitionException {
		Conjunto_predicadosContext _localctx = new Conjunto_predicadosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conjunto_predicados);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__11);
			setState(96);
			predicado();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(97);
				match(T__3);
				setState(98);
				predicado();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__12);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16\3&\13\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\3\b\3\b\3\b\3\b\5\bE\n\b\3\t\3\t\3"+
		"\t\3\t\5\tK\n\t\3\n\3\n\3\n\7\nP\n\n\f\n\16\nS\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13[\n\13\f\13\16\13^\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f"+
		"f\n\f\f\f\16\fi\13\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2"+
		"\2h\2\30\3\2\2\2\4\35\3\2\2\2\6*\3\2\2\2\b\61\3\2\2\2\n\64\3\2\2\2\f\67"+
		"\3\2\2\2\16D\3\2\2\2\20F\3\2\2\2\22L\3\2\2\2\24T\3\2\2\2\26a\3\2\2\2\30"+
		"\31\5\4\3\2\31\32\5\6\4\2\32\33\5\16\b\2\33\34\7\3\2\2\34\3\3\2\2\2\35"+
		"\36\7\4\2\2\36\37\7\5\2\2\37$\7\20\2\2 !\7\6\2\2!#\7\20\2\2\" \3\2\2\2"+
		"#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\7\2\2()\7\b"+
		"\2\2)\5\3\2\2\2*+\5\b\5\2+,\7\6\2\2,-\5\n\6\2-.\7\6\2\2./\5\f\7\2/\60"+
		"\7\b\2\2\60\7\3\2\2\2\61\62\7\t\2\2\62\63\7\21\2\2\63\t\3\2\2\2\64\65"+
		"\7\n\2\2\65\66\7\21\2\2\66\13\3\2\2\2\678\7\13\2\28=\7\21\2\29:\7\6\2"+
		"\2:<\7\21\2\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\r\3\2\2\2?=\3\2"+
		"\2\2@E\5\20\t\2AB\5\22\n\2BC\7\b\2\2CE\3\2\2\2D@\3\2\2\2DA\3\2\2\2E\17"+
		"\3\2\2\2FG\7\21\2\2GJ\7\f\2\2HK\5\24\13\2IK\5\26\f\2JH\3\2\2\2JI\3\2\2"+
		"\2K\21\3\2\2\2LQ\5\20\t\2MN\7\6\2\2NP\5\20\t\2OM\3\2\2\2PS\3\2\2\2QO\3"+
		"\2\2\2QR\3\2\2\2R\23\3\2\2\2SQ\3\2\2\2TU\7\21\2\2UV\7\r\2\2VW\7\5\2\2"+
		"W\\\7\20\2\2XY\7\6\2\2Y[\7\20\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\7\2\2`\25\3\2\2\2ab\7\16\2\2bg\5\24\13"+
		"\2cd\7\6\2\2df\5\24\13\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2"+
		"\2\2ig\3\2\2\2jk\7\17\2\2k\27\3\2\2\2\t$=DJQ\\g";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}