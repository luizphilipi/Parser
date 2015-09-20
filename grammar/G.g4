grammar G;

program: classList+ ;

classList: classDeclaration classList* ;

classDeclaration: 'class' IDENTIFIER classBody ;

classBody: '{' classList* (varDeclaration ';')* constructorDeclaration*
            functionDefinition* '}' ;

constructorDeclaration: 'constructor' constName=IDENTIFIER '(' params=parameterDeclaration ')' constructorBlock=block ;

statement: println ';'
         | varDeclaration ';'
         | assignment ';'
         | branch
         | loopFor
         | loopWhile
         | branchSwitch
         | 'break' ';'
         ;
         
branch: 'if' '(' condition=expression ')' onTrue=block 'else' onFalse=block
      ;
      
block: '{' statement* '}' ;

loopWhile: 'while' '(' condition=expression ')' whileBlock=block ;

branchSwitch: 'switch' '(' varName=IDENTIFIER ')' '{' (switchCase = cases)? '}' ;

cases: caseSwitch (caseSwitch)? ;

caseSwitch: ( 'case' factor | 'default' ) ';' switchBlock=block ;

factor: number=NUMBER ;

loopFor: 'for' '(' varDeclaration? ';' expression? ';' assignment? ')' forBlock=block ;

expression: left=expression '/' right=expression #Div 
            | left=expression '*' right=expression #Mult
            | left=expression '-' right=expression #Minus
            | left=expression '+' right=expression #Plus
            | number=NUMBER #Number
            | varName=IDENTIFIER #Variable
            | functionCall #funcCallExpression
            | left=expression operator=('<' | '<=' | '>' | '>=') right=expression
                 #Relational
            ;

varDeclaration: primitiveType varName=IDENTIFIER ('=' expr=expression)?;

assignment: varName=IDENTIFIER '=' expr=expression 
          | varName=IDENTIFIER '++'
          | varName=IDENTIFIER '--' ;

println: 'println(' argument=expression ')' ;

functionDefinition: primitiveType funcName=IDENTIFIER '(' params=parameterDeclaration ')' '{' statements=statementList 'return' returnValue=expression ';' '}';

parameterDeclaration: declarations+=varDeclaration (',' declarations+=varDeclaration)*
                              |
                              ;
                              
statementList: statement* ;

functionCall: funcName=IDENTIFIER '(' arguments=expressionList ')' ; 

expressionList: (expression | expression) (',' (expression | expression))* | ;

primitiveType: 'int' | 'string' | 'boolean' | 'float' ;

COMMENT : ( '//' ~[\r\n]* '\r'? '\n' | '/*' .*? '*/' ) -> skip ;
IDENTIFIER: [a-zA-Z][a-zA-Z0-9]* ;
NUMBER: [0-9]+;
STRING: '"' (~["\\\r\n] | '\\' (. | EOF))* '"' ;
BOOLEAN: ('true' | 'false') ;
WHITESPACE: [ \t\n\r]+ -> skip;