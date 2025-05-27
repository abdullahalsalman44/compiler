

lexer grammar AngularLexer;

MultiLineComment  : '/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment : '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);
At                         : '@';
BACKTICK                   : '`';
Class                      :'class';
Export                     :'export';
Let                         :'let';
Component               : 'Component' ;
Selector                   : 'selector';
Standalone                 : 'standalone';
Imports                    : 'imports';
Template                   : 'template';
Styles                     : 'styles';
SemiColon                  : ';';
OpenBracket                : '[';
CloseBracket               : ']';
OpenParen                  : '(';
CloseParen                 : ')';
OpenBrace                  : '{';
CloseBrace                 : '}';
Comma                      : ',';
Assign                     : '=';
QuestionMark               : '?';
QuestionMarkDot            : '?.';
Colon                      : ':';
Ellipsis                   : '...';
Dot                        : '.';
PlusPlus                   : '++';
MinusMinus                 : '--';
Plus                       : '+';
Minus                      : '-';
BitNot                     : '~';
Not                        : '!';
Multiply                   : '*';
Divide                     : '/';
Modulus                    : '%';
NullCoalesce               : '??';
Hashtag                    : '#';
RightShiftArithmetic       : '>>';
LeftShiftArithmetic        : '<<';
RightShiftLogical          : '>>>';
LessThan                   : '<';
MoreThan                   : '>';
LessThanEquals             : '<=';
GreaterThanEquals          : '>=';
Equals_                    : '==';
NotEquals                  : '!=';
IdentityEquals             : '===';
IdentityNotEquals          : '!==';
BitAnd                     : '&';
BitXOr                     : '^';
BitOr                      : '|';
And                        : '&&';
Or                         : '||';
MultiplyAssign             : '*=';
DivideAssign               : '/=';
ModulusAssign              : '%=';
PlusAssign                 : '+=';
MinusAssign                : '-=';
LeftShiftArithmeticAssign  : '<<=';
RightShiftArithmeticAssign : '>>=';
RightShiftLogicalAssign    : '>>>=';
BitAndAssign               : '&=';
BitXorAssign               : '^=';
BitOrAssign                : '|=';
NullishCoalescingAssign    : '??=';
ARROW                      : '=>';
ReactCreatElement:'React.createElement';
Break      : 'break';
Do         : 'do';
Instanceof : 'instanceof';
Typeof     : 'typeof';
Case       : 'case';
Else       : 'else';
ElseIf     : 'else if';
New        : 'new';
Var        : 'var';
Catch      : 'catch';
Finally    : 'finally';
Return     : 'return';
Void       : 'void';
Continue   : 'continue';
For        : 'for';
Switch     : 'switch';
While      : 'while';
Debugger   : 'debugger';
Function_  : 'function';
This       : 'this';
With       : 'with';
Default    : 'default';
If         : 'if';
Throw      : 'throw';
Delete     : 'delete';
In         : 'in';
Try        : 'try';
As         : 'as';
From       : 'from';
Of         : 'of';
NullLiteral: 'null';
BooleanLiteral: 'true' | 'false';


StringLiteral:
    ('"' DoubleStringCharacter* '"' | '\'' SingleStringCharacter* '\'')
;
/// Future Reserved Words
Enum    : 'enum';

Extends : 'extends';
Super   : 'super';
Const   : 'const';
Import  : 'import';
Implements   : 'implements' ;
StrictLet    : 'let'        ;
Private      : 'private'    ;
Public       : 'public'     ;
Interface    : 'interface'  ;
Package      : 'package'   ;
Protected    : 'protected'  ;
Static       : 'static'     ;
Map:'map';


DecimalLiteral:
    DecimalIntegerLiteral '.' [0-9] [0-9_]* ExponentPart?
    | '.' [0-9] [0-9_]* ExponentPart?
    | DecimalIntegerLiteral ExponentPart?
;

Identifier : [a-zA-Z_] [a-zA-Z0-9_-]* |[0-9_a-zA-Z] [a-zA-Z_]*;
TagName: TagNameStartChar TagNameChar*;
ID: [a-zA-Z]+;
Number : [0-9]+;
WS: [ \t\r\n]+ -> skip;

fragment ESC: '\\' (["\\/bfnrt] | UNICODE_ESCAPE);
fragment UNICODE_ESCAPE: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;
fragment HEX_DIGIT: [0-9a-fA-F] ;
fragment AttributeChar:
    '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
;
fragment TagNameStartChar:
    [a-zA-Z];

fragment TagNameChar:
    TagNameStartChar
    | '-'
    | '_'
//    | '.'
    | Digit;

fragment Digit: [0-9];

fragment AttributeChars: AttributeChar+ ' '?;

fragment HexChars: '#' [0-9a-fA-F]+;

fragment DecChars: [0-9]+ '%'?;

fragment DoubleQuoteString : '"' ~[<"]* '"';
fragment SingleQuoteString : '\'' ~[<']* '\'';
fragment DoubleStringCharacter: ~["\\] | '\\' EscapeSequence | LineContinuation;

fragment SingleStringCharacter: ~['\\] | '\\' EscapeSequence | LineContinuation;

fragment EscapeSequence:
    CharacterEscapeSequence
    | '0' // no digit ahead! TODO

;

fragment CharacterEscapeSequence: SingleEscapeCharacter | NonEscapeCharacter;
fragment SingleEscapeCharacter: ['"\\bfnrtv];

fragment NonEscapeCharacter: ~['"\\bfnrtv0-9xu\r\n];

fragment EscapeCharacter: SingleEscapeCharacter | [0-9] | [xu];

fragment LineContinuation: '\\' [\r\n\u2028\u2029];

fragment HexDigit: [_0-9a-fA-F];

fragment DecimalIntegerLiteral: '0' | [1-9] [0-9_]*;

fragment ExponentPart: [eE] [+-]? [0-9_]+;

fragment IdentifierPart: IdentifierStart | [\p{Mn}] | [\p{Nd}] | [\p{Pc}];

fragment IdentifierStart: [\p{L}] | [$_];
//fragment IdentifierStart: [\p{L}$] ~[:.];


fragment RegularExpressionFirstChar:
    ~[*\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
;

fragment RegularExpressionChar:
    ~[\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
;

fragment RegularExpressionClassChar: ~[\r\n\u2028\u2029\]\\] | RegularExpressionBackslashSequence;

fragment RegularExpressionBackslashSequence: '\\' ~[\r\n\u2028\u2029];

fragment CapitalLetter : [A-Z];

fragment Lowercase : [a-z];

NgIfDirective : '*ngIf' ;
NgForDirective : '*ngFor' ;
NgModule : 'NgModule' ;
Injectable : 'Injectable' ;
Pipe : 'Pipe' ;

Qut:'"';
OPEN_MUSTACHE : '{{' ;
CLOSE_MUSTACHE: '}}' ;
CLOSE_TAG     : '</' ;
HexColor: '#' [0-9a-fA-F]+;
// Keep other tokens from ReactLexer that are shared
//Margin                     : 'margin';
//Margin_top                 : 'margin_top';
//Padding                    : 'padding';
//Display                    :'display';
//Color                      : 'color';
//Border_color               : 'border-color';
//Box_shadow                 : 'box-shadow';
//Flex                       : 'flex';
//Background_color           : 'background-color';
//Width                      : 'width';
//Line_height                : 'line-height';
//Flex_direction             : 'flex-direction';
//Flex_wrap                  : 'flex-wrap';
//Gap                        : 'gap';
//Justify_content            : 'justify-content';