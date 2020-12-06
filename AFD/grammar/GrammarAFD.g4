grammar GrammarAFD;

automata: alfabeto estados transiciones 'fin';

alfabeto: 'alfabeto' '[' DECL_ALF ( ',' DECL_ALF ) * ']' '.' ;

estados: e_inicial ',' e_final ',' e_intermedio '.' ;

e_inicial: 'E_inicial' ESTADO ;

e_final: 'E_final' ESTADO ;

e_intermedio: 'E_intermedio' ESTADO ( ',' ESTADO) * ;

transiciones:  transicion | conjunto_transiciones '.' ;

transicion: ESTADO 'pasa_a' ( predicado | conjunto_predicados ) ;

conjunto_transiciones: transicion ( ',' transicion ) * ;

predicado: ESTADO 'con' '[' DECL_ALF ( ',' DECL_ALF ) * ']' ;

conjunto_predicados: '{' predicado (',' predicado ) * '}' ;

DECL_ALF: [a-z] ;

ESTADO: [a-z][0-9] ;

WS: [ \t\r\n]+ -> skip ;

COMMENT: '/#' .*? '#/' ;

LINE_COMMENT: '#' ~[\r\n]* -> skip ;