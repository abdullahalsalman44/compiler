parser grammar AngularParser;

options {
  tokenVocab=AngularLexer;
}
program : importStatement statment*;

eos : SemiColon? ;

importStatement : (Import importFromBlock)* ;
importFromBlock
    : StringLiteral eos
    | Identifier? moduleItems? From StringLiteral eos
    ;

moduleItems
    : '{' (Identifier (Comma Identifier)*)? '}'
    | '{' (Component )? '}'
    ;


statment
    :
      functionDeclaration
    | componentDeclaration
    | classDeclaration
    | expressionStatement
    | variableStatement
    ;


expressionStatement : singleExpression (',' singleExpression)* eos ;

returnStatement : Return (singleExpression (',' singleExpression)*)? eos ;

functionDeclaration
    : Export? Identifier '(' singleExpression* (',' singleExpression)* ')' '{' statment* '}' exportStatement?
    ;

exportStatement
    : Export Identifier eos
    ;

variableStatement
    : varModifier ? variableDeclaration (',' variableDeclaration)* eos
    ;

varModifier
    : Export? Var
    | Export? Let
    | Export? Const
    ;

variableDeclaration
    : assignable (Assign singleExpression)?
    ;

assignable : arrayLiteral | Identifier | ObjectLiteral ;

singleExpression:
          literal
        | indexarray
        | arrayLiteral
        | forstatment
        | objectLiteral
        | mustacheExpression
        | returnStatement
        | singleExpression Dot singleExpression
        | singleExpression Multiply singleExpression
        | singleExpression Divide singleExpression
        | singleExpression Plus singleExpression
        | singleExpression Minus singleExpression
        | singleExpression Colon singleExpression
        | singleExpression And singleExpression
        | singleExpression QuestionMark singleExpression Colon singleExpression
        | singleExpression Assign singleExpression
        | singleExpression singleExpression
        | htmlElements
        | OpenParen singleExpression (Comma singleExpression)*  CloseParen
        | Identifier
        | Map
        | singleExpression PlusPlus
        | OpenBrace singleExpression (OpenParen CloseParen)?CloseBrace
        | singleExpression MinusMinus
        | This
        | singleExpressionCss
        ;



singleExpressionCss
    : Dot? Identifier objectLiteral
    ;
 forstatment : For '(' variableStatement  Identifier (Assign|MoreThan|LessThan ) singleExpression ';'singleExpression ')' '{'singleExpression eos?'}' ;

functionCall
    : Identifier OpenParen (singleExpression (Comma singleExpression)*)? CloseParen
    ;

directive
    : NgIfDirective
    | NgForDirective
    ;

ifStatement
    : If OpenParen singleExpression CloseParen statementBlock (Else statementBlock)?
    ;

statementBlock
    : '{' statment* '}'
    ;

componentDeclaration
    : At Component '(' componentAttributes ')'
    ;

componentAttributes
    : '{' (componentAttribute (',' componentAttribute)* ','?)? '}'
    ;
componentAttribute
    : selectorDeclaration
    | standaloneDeclaration
    | importsDeclaration
    | templateDeclaration
    | stylesDeclaration
    | singleExpressionCss
    ;

selectorDeclaration
    : Selector Colon StringLiteral
    ;

standaloneDeclaration
    : Standalone Colon BooleanLiteral
    ;

importsDeclaration
    : Imports Colon arrayLiteral
    ;

templateDeclaration
    : Template Colon '`' htmlElements '`'
    ;

stylesDeclaration
    : Styles  Colon arrayLiteral
    ;


classDeclaration
    : Export? Class Identifier  classBody
    ;


classBody
    :'{' singleExpression* |functionDeclaration*  '}'
    ;

templateStatement
    : htmlElements
    | singleExpression
    ;

htmlElements : htmlElement+ ;
htmlElement
    : '<' Identifier ( htmlAttribute)*  '>' htmlContent? CLOSE_TAG Identifier '>'
    | '<' Identifier ( htmlAttribute)*  '/' '>'
    ;

htmlContent : (htmlElement  |singleExpression)* ;

htmlAttribute
    : Identifier (Assign htmlAttributeValue)?
    | '[' Class Dot Identifier ']' (Assign htmlAttributeValue)?
    | '(' Identifier ')' (Assign htmlAttributeValue)?
    | directive (Assign htmlAttributeValue)?
    | Class (Assign htmlAttributeValue)?
    |'['Identifier']' (Assign htmlAttributeValue)?
    ;

mustacheExpression : '{{'  (singleExpression (',' singleExpression)*)?  '}}';

  htmlAttributeValue :StringLiteral
                     |  '{'singleExpression (','  singleExpression)* '}'

                     ;

arrayLiteral : '[''`'?  (singleExpression (',' singleExpression)*)?  '`'?']'
             ;
indexarray : Identifier '['DecimalLiteral']'
           ;
arrayCss : '['  '`' (singleExpressionCss)*? '`' ']'
             ;
objectLiteral
    : '{' (propertyAssignment (',' propertyAssignment)* (';' propertyAssignment)* )?  '}'
    ;

propertyAssignment
    : singleExpression ':' singleExpression ';'?
    ;

literal
    : NullLiteral
    | BooleanLiteral
    | StringLiteral
    | DecimalLiteral
    | HexColor
    ;



