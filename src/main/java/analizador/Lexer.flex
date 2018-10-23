package analizador;

import static analizador.Tokens.*;
%%

%{


  public String Tipo;

//  private Symbol symbol(int type) {
//  		return new Token(type, yyline, yycolumn);
//
//  }



%}

%class LexicalAnalyzer
%type Tokens


digito=[0-9]
esp=[\ \t\r\n]
WHITE=[ \t\r\n]

%%

"+" {return SOMA;}
"-" {return RESTA;}
"*" {return MULTIPLICACAO;}
"/" {return DIVISAO;}
"^" {return POTENCIA;}
{digito}+{esp}* {Tipo=yytext(); return NUMERO;}
{digito}+("*"|"+"|"-"|"/"|"^"){digito}+{esp}* {Tipo=yytext(); return EXPRESSAO_VALIDA;}
      /* Operadores Logicos */
"==" { return IGUALIGUAL; }
">=" { return IGUALIGUAL; }
"<=" { return IGUALIGUAL; }
"<" { return IGUALIGUAL; }
">" { return IGUALIGUAL; }
"||" { return IGUALIGUAL; }
"&&" { return IGUALIGUAL; }
"!" { return IGUALIGUAL; }
"!=" { return IGUALIGUAL; }


