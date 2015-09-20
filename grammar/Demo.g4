grammar Demo;

program: programPart+;

programPart: statement          #MainStatement
          | functionDefinition  #ProgPartFunctionDefinition
          ;

statement: println ';'
         | print ';'
		 | varDeclaration ';'
		 | assignment ';'
		 | branch
		 ;

statementList: statement* ; 

branch: 'if' '(' condition=expression ')' onTrue=block 'else' onFalse=block
      ;

block: '{' statement* '}' ;

expression: left=expression '/' right=expression #Div
		  | left=expression '*' right=expression #Mult 
		  | left=expression '-' right=expression #Minus 
		  | left=expression '+' right=expression #Plus 
		  | left=expression operation=('<' | '<=' | '>' | '>=') right=expression #Relational
		  | left=expression '&&' right=expression #And 
		  | left=expression '||' right=expression #Or 
		  | number=NUMBER #Number
		  | varName=IDENTIFIER #Variable
		  | functionCall #funcCallExpression
		  | string=STRING #String
		  | r_float=FLOAT #Float
		  ;
		  
expressionList: expressions+=expression (',' expressions+=expression)*
              |
              ;

varDeclaration: 'int' varName=IDENTIFIER ;

assignment: varName=IDENTIFIER '=' expr=expression ;

println: 'println(' argument=expression ')';

print: 'print(' argument=expression ')';


functionDefinition: 'int' funcName=IDENTIFIER '(' params=parametersDeclaration ')' '{' statements=statementList 'return' returnValue=expression ';' '}' ;

parametersDeclaration: declarations+=varDeclaration (',' declarations+=varDeclaration)*
                     | 
                     ;

functionCall: funcName=IDENTIFIER '(' arguments=expressionList ')' ;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]* ;
WHITESPACE: [ \t\n\r]+ -> skip;
COMMENT : ( '//' ~[\r\n]* '\r'? '\n' | '/*' .*? '*/' ) -> skip ;
NUMBER: [0-9]+;
STRING: '"' (~["\\\r\n] | '\\' (. | EOF))* '"' ;
FLOAT: NUMBER+ '.' NUMBER+ ;

whileStatement: 'while' '(' condition=expression ')' block
    ;