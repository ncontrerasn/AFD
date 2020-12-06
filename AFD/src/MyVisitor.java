import java.util.ArrayList;

public class MyVisitor<T> extends GrammarAFDBaseVisitor {

    ArrayList<String> estados = new ArrayList<>();
    ArrayList<Character> alfabeto = new ArrayList<>();

    @Override
    public Object visitAutomata(GrammarAFDParser.AutomataContext ctx) {
        visitAlfabeto(ctx.alfabeto());
        visitEstados(ctx.estados());
        visitTransiciones(ctx.transiciones());
        return null;
    }

    @Override
    public Object visitAlfabeto(GrammarAFDParser.AlfabetoContext ctx) {
        char letra = ctx.DECL_ALF().toString().charAt(0);
        alfabeto.add(letra);
        System.out.println(letra);
        if(ctx.decl_alf() != null)
            visitDecl_alf(ctx.decl_alf());
        return null;
    }

    @Override
    public Object visitDecl_alf(GrammarAFDParser.Decl_alfContext ctx) {
        if(ctx.DECL_ALF() != null){
            char letra = ctx.DECL_ALF().toString().charAt(0);
            alfabeto.add(letra);
            System.out.println(letra);
        }
        if(ctx.decl_alf() != null)
            visitDecl_alf(ctx.decl_alf());
        return null;
    }

    @Override
    public Object visitEstados(GrammarAFDParser.EstadosContext ctx) {
        visitE_inicial(ctx.e_inicial());
        visitE_final(ctx.e_final());
        visitE_intermedio(ctx.e_intermedio());
        return null;
    }

    @Override
    public Object visitE_inicial(GrammarAFDParser.E_inicialContext ctx) {
        String estado = ctx.ESTADO().toString();
        estados.add(estado);
        System.out.println(estado);
        return null;
    }

    @Override
    public Object visitE_final(GrammarAFDParser.E_finalContext ctx) {
        String estado = ctx.ESTADO().toString();
        estados.add(estado);
        System.out.println(estado);
        return null;
    }

    @Override
    public Object visitE_intermedio(GrammarAFDParser.E_intermedioContext ctx) {
        String estado = ctx.ESTADO().toString();
        estados.add(estado);
        System.out.println(estado);
        if(ctx.decl_interm() != null)
            visitDecl_interm(ctx.decl_interm());
        return null;
    }

    @Override
    public Object visitDecl_interm(GrammarAFDParser.Decl_intermContext ctx) {
        if(ctx.ESTADO() != null){
            String estado = ctx.ESTADO().toString();
            estados.add(estado);
            System.out.println(estado);
        }
        if(ctx.ESTADO() != null)
            visitDecl_interm(ctx.decl_interm());
        return null;
    }

    @Override
    public Object visitTransiciones(GrammarAFDParser.TransicionesContext ctx) {
        if(ctx.transicion() != null)
            visitTransicion(ctx.transicion());
        else
            visitConjunto_transiciones(ctx.conjunto_transiciones());
        return null;
    }

    @Override
    public Object visitTransicion(GrammarAFDParser.TransicionContext ctx) {
        if(ctx.LLAVE_IZQ() != null)
            visitConjunto_predicados(ctx.conjunto_predicados());
        else
            visitPredicado(ctx.predicado());
        return null;
    }

    @Override
    public Object visitConjunto_transiciones(GrammarAFDParser.Conjunto_transicionesContext ctx) {
        visitTransicion(ctx.transicion());
        visitConj_tran(ctx.conj_tran());
        return null;
    }

    @Override
    public Object visitConj_tran(GrammarAFDParser.Conj_tranContext ctx) {
        if(ctx.transicion() != null){
            visitTransicion(ctx.transicion());
            visitConj_tran(ctx.conj_tran());
        }
        return null;
    }

    @Override
    public Object visitPredicado(GrammarAFDParser.PredicadoContext ctx) {
        if(ctx.mas_pred() != null)
            visitMas_pred(ctx.mas_pred());
        return null;
    }

    @Override
    public Object visitMas_pred(GrammarAFDParser.Mas_predContext ctx) {
        if(ctx.mas_pred() != null)
            visitMas_pred(ctx.mas_pred());
        return null;
    }

    @Override
    public Object visitConjunto_predicados(GrammarAFDParser.Conjunto_predicadosContext ctx) {
        if(ctx.predicado() != null && ctx.otro_pred() != null){
            visitPredicado(ctx.predicado());
            visitOtro_pred(ctx.otro_pred());
        }
        return null;
    }

    @Override
    public Object visitOtro_pred(GrammarAFDParser.Otro_predContext ctx) {
        if(ctx.predicado() != null){
            visitPredicado(ctx.predicado());
            visitOtro_pred(ctx.otro_pred());
        }

        return null;
    }
}