package pascal;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

import generator.LexicalAnalysisCalculator;
import generator.Parser;


public class PascaLexicalAnalyzer {


    public static void main(String[] args) throws IOException {

        String sourceCode = "/home/antonio/horaDoShow/Compiladores/src/main/java/pascal/program.pas";

        try{
            LexicalAnalysisCalculator scanner = new LexicalAnalysisCalculator(new FileReader(sourceCode));

            Parser p = new Parser(scanner);

            System.out.println(p.parse() + "\n");

        } catch (Exception e) {
            System.out.println(e);
        }



//        LexicalAnalyzer lexical = new LexicalAnalyzer(new FileReader(sourceCode));
//
//        PascalToken token;
//
//        while ((token = lexical.yylex()) != null) {
//            System.out.println("<" + token.name + ", " + token.value + "> (" + token.line + " - " + token.column + ")");
//        }
    }

}
