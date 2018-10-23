package src;

import static Tokens.*;
%%

%{


public String Tipo;


%}

%public
%class LexicalAnalyzer
%type Tokens
%line
%column

digito=[0-9]
esp=[\ \t\r\n]
WHITE=[ \t\r\n]

%%

"+" {return SOMA;}
"-" {return RESTA;}
"*" {return MULTIPLICACAO;}
"/" {return DIVISAO;}
"^" {return POTENCIA;}