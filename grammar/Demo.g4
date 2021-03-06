grammar Demo;

program: programPart+;

programPart: statement          #MainStatement
          | functionDefinition  #ProgPartFunctionDefinition
          | constructorDeclaration #Construction
          ;

constructorDeclaration: className=IDENTIFIER '(' params=parametersDeclaration ')' '{' statements=statementList '}' ;

statement: println ';'
         | print ';'
		 | varDeclaration ';'
		 | assignment ';'
		 | branch
		 | expression ';'
		 | forStat
		 | whileStatement
		 | returnStatement
		 ;

returnStatement: 'return' returnValue=expression ';' ;

statementList: statement* ; 

branch: 'if' '(' condition=expression ')' onTrue=block ('else' onFalse=block)?
      ;

block: '{' statement* '}' ;

expression: varName=IDENTIFIER operation=('++'|'--') #Unary
          | left=expression '/' right=expression #Div
		  | left=expression '*' right=expression #Mult
		  | left=expression '-' right=expression #Minus
		  | left=expression '+' right=expression #Plus
		  | left=expression operation=('<' | '<=' | '>' | '>=' | '==' | '!=') right=expression #Relational
		  | left=expression '&&' right=expression #And
		  | left=expression '||' right=expression #Or
		  | number=NUMBER #Number
		  | varName=IDENTIFIER #Variable
		  | functionCall #funcCallExpression
		  | string=STRING #String
		  | r_float=FLOAT #Float
		  | bool=BOOLEAN #Boolean
		  ;
		  
expressionList: expressions+=expression (',' expressions+=expression)*
              |
              ;

varDeclaration: type=primitiveType varName=IDENTIFIER ('=' expr=expression)? ;

assignment: varName=IDENTIFIER '=' expr=expression ;

println: 'println(' argument=expression ')';

print: 'print(' argument=expression ')';


functionDefinition: returnType=primitiveType funcName=IDENTIFIER '(' params=parametersDeclaration ')' '{' statements=statementList '}' ;

parametersDeclaration: declarations+=varDeclaration (',' declarations+=varDeclaration)*
                     | 
                     ;

functionCall: funcName=IDENTIFIER '(' arguments=expressionList ')' ;

primitiveType
    :   type='boolean'
    |   type='string'
    |   type='int'
    |   type='float'
    ;
    
forStat: 'for' '(' declaration=varDeclaration? ';' expr=expression? ';' (expr2=expression | assign=assignment)? ')' forBlock=block ;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]* ;
WHITESPACE: [ \t\n\r]+ -> skip;
COMMENT : ( '//' ~[\r\n]* '\r'? '\n' | '/*' .*? '*/' ) -> skip ;

NUMBER: [0-9]+;
STRING: '"' (~["\\\r\n] | '\\' (. | EOF))* '"' ;
FLOAT: NUMBER+ '.' NUMBER+ ;
BOOLEAN: 'true' | 'false' ;
whileStatement: 'while' '(' condition=expression ')' whileTrue=block
    ;