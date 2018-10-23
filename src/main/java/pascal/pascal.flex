package pascal;

import java_cup.runtime.*;

%%

%{


private PascalToken createToken(String name, String value) {
    return new PascalToken( name, value, yyline, yycolumn);
}

%}

%public
%class LexicalAnalyzer
%type PascalToken
%line
%column

inteiro = 0|[1-9][0-9]*
brancos = [\n| |\t]


%%
or {return createToken("OR", yytext()); }
and {return createToken("AND", yytext()); }
not {return createToken("NEGACAO", yytext());}
"<=" {return createToken("MENORIGUAL", yytext()); }
">=" {return createToken("MAIORIGUAL", yytext()); }
"<>" {return createToken("DIFERENTE", yytext()); }
"="  {return createToken("IGUAL", yytext()); }
">" {return createToken("MAIORQUE", yytext()); }
"<" {return createToken("MENORQUE", yytext()); }
{inteiro} { return createToken("inteiro", yytext()); }
{brancos} { /**/ }

. { throw new RuntimeException("Caractere inválido " + yytext() + " na linha " + yyline + ", coluna " +yycolumn); }