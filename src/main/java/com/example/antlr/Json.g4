grammar Json;

// Json definition
json: object | array;

// Object definition
object : '{' (keyvalue (',' keyvalue)*)? '}';
keyvalue : STRING ':' value;

// Array definition
array : '[' (value (',' value)*)? ']';

// Value definition
value : STRING | NUMBER | object | array | 'true' | 'false' | 'null';

// String definition
STRING : '"' (~["\\] | ESCAPE)* '"';
fragment ESCAPE : '\\' ( ["\\/bfnrt]| UNICODE) ;
fragment UNICODE : 'u' HEXADECIMAL HEXADECIMAL HEXADECIMAL HEXADECIMAL;
fragment HEXADECIMAL : [0-9a-fA-F];

// Number definition
NUMBER : '-' ? INTEGER ( ('.' DIGIT+ EXPONENT?) | (EXPONENT))?;
fragment EXPONENT : [eE] [\-\+]? INTEGER+;
fragment INTEGER : '0' | ('1' .. '9') DIGIT+;
fragment DIGIT : '0'..'9';

// Skip white spaces
WhiteSpace : [\r\n\t ]+ -> skip;

// Skip multi line comments
MultiLineComments : '/*' .*? '*/' -> skip;

// Skip single line comments
Comments : '//' ~('\r' | '\n')* -> skip;
