// Generated from C:/Users/Nicolas Contreras/Desktop/AFD/grammar\GrammarAFD.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarAFDParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarAFDVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarAFDParser#automata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomata(GrammarAFDParser.AutomataContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarAFDParser#alfabeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlfabeto(GrammarAFDParser.AlfabetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarAFDParser#estados}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstados(GrammarAFDParser.EstadosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarAFDParser#e_inicial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_inicial(GrammarAFDParser.E_inicialContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarAFDParser#e_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_final(GrammarAFDParser.E_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarAFDParser#e_intermedio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_intermedio(GrammarAFDParser.E_intermedioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarAFDParser#transiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransiciones(GrammarAFDParser.TransicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarAFDParser#transicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransicion(GrammarAFDParser.TransicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarAFDParser#conjunto_transiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunto_transiciones(GrammarAFDParser.Conjunto_transicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarAFDParser#predicado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicado(GrammarAFDParser.PredicadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarAFDParser#conjunto_predicados}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunto_predicados(GrammarAFDParser.Conjunto_predicadosContext ctx);
}