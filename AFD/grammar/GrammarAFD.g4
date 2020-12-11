grammar GrammarAFD;

automata: alfabeto estados transiciones 'fin';

alfabeto: 'alfabeto' '[' DECL_ALF decl_alf ']' '.' ;

decl_alf: ',' DECL_ALF decl_alf
        |
        ;

estados: e_inicial ',' e_intermedio ',' e_final '.' ;

e_inicial: 'E_inicial' ESTADO ;

e_final: 'E_final' ESTADO ;

e_intermedio: 'E_intermedio' ESTADO decl_interm ;

decl_interm: ',' ESTADO decl_interm
           |
           ;

transiciones: transicion '.'
            | conjunto_transiciones '.' ;

transicion: ESTADO 'pasa_a' predicado
          | ESTADO 'pasa_a' LLAVE_IZQ conjunto_predicados ;

conjunto_transiciones: transicion conj_tran ;

conj_tran: ',' transicion conj_tran
         |
         ;

predicado: ESTADO 'con' '[' DECL_ALF mas_pred ']' ;

mas_pred: ',' DECL_ALF mas_pred
        |
        ;

conjunto_predicados: predicado otro_pred '}';

otro_pred: ',' predicado otro_pred
         |
         ;

WS: [ \t\r\n]+ -> skip ;

COMMENT: '/#' .*? '#/' -> skip ;

LINE_COMMENT: '#' ~[\r\n]* -> skip ;

DECL_ALF: [a-z] ;

ESTADO: [a-z][0-9] ;

LLAVE_IZQ: '{' ;