// Generated from C:/Users/Nicolas Contreras/Desktop/AFD/grammar\GrammarAFD.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarAFDParser}.
 */
public interface GrammarAFDListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarAFDParser#automata}.
	 * @param ctx the parse tree
	 */
	void enterAutomata(GrammarAFDParser.AutomataContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarAFDParser#automata}.
	 * @param ctx the parse tree
	 */
	void exitAutomata(GrammarAFDParser.AutomataContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarAFDParser#alfabeto}.
	 * @param ctx the parse tree
	 */
	void enterAlfabeto(GrammarAFDParser.AlfabetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarAFDParser#alfabeto}.
	 * @param ctx the parse tree
	 */
	void exitAlfabeto(GrammarAFDParser.AlfabetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarAFDParser#estados}.
	 * @param ctx the parse tree
	 */
	void enterEstados(GrammarAFDParser.EstadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarAFDParser#estados}.
	 * @param ctx the parse tree
	 */
	void exitEstados(GrammarAFDParser.EstadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarAFDParser#e_inicial}.
	 * @param ctx the parse tree
	 */
	void enterE_inicial(GrammarAFDParser.E_inicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarAFDParser#e_inicial}.
	 * @param ctx the parse tree
	 */
	void exitE_inicial(GrammarAFDParser.E_inicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarAFDParser#e_final}.
	 * @param ctx the parse tree
	 */
	void enterE_final(GrammarAFDParser.E_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarAFDParser#e_final}.
	 * @param ctx the parse tree
	 */
	void exitE_final(GrammarAFDParser.E_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarAFDParser#e_intermedio}.
	 * @param ctx the parse tree
	 */
	void enterE_intermedio(GrammarAFDParser.E_intermedioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarAFDParser#e_intermedio}.
	 * @param ctx the parse tree
	 */
	void exitE_intermedio(GrammarAFDParser.E_intermedioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarAFDParser#transiciones}.
	 * @param ctx the parse tree
	 */
	void enterTransiciones(GrammarAFDParser.TransicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarAFDParser#transiciones}.
	 * @param ctx the parse tree
	 */
	void exitTransiciones(GrammarAFDParser.TransicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarAFDParser#transicion}.
	 * @param ctx the parse tree
	 */
	void enterTransicion(GrammarAFDParser.TransicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarAFDParser#transicion}.
	 * @param ctx the parse tree
	 */
	void exitTransicion(GrammarAFDParser.TransicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarAFDParser#conjunto_transiciones}.
	 * @param ctx the parse tree
	 */
	void enterConjunto_transiciones(GrammarAFDParser.Conjunto_transicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarAFDParser#conjunto_transiciones}.
	 * @param ctx the parse tree
	 */
	void exitConjunto_transiciones(GrammarAFDParser.Conjunto_transicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarAFDParser#predicado}.
	 * @param ctx the parse tree
	 */
	void enterPredicado(GrammarAFDParser.PredicadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarAFDParser#predicado}.
	 * @param ctx the parse tree
	 */
	void exitPredicado(GrammarAFDParser.PredicadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarAFDParser#conjunto_predicados}.
	 * @param ctx the parse tree
	 */
	void enterConjunto_predicados(GrammarAFDParser.Conjunto_predicadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarAFDParser#conjunto_predicados}.
	 * @param ctx the parse tree
	 */
	void exitConjunto_predicados(GrammarAFDParser.Conjunto_predicadosContext ctx);
}