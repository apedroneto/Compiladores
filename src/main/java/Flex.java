import jflex.*;

import java.io.File;

public class Flex {
    public static void main(String args[]){
        String caminho = "/home/antonio/compilador_jflex_cup/Compiladores/src/main/java/Lexer.flex";
        geraLexer(caminho);
    }

    //F f

    private static void geraLexer(String caminho){
        File arquivo = new File(caminho);
        jflex.Main.generate(arquivo);
    }

}