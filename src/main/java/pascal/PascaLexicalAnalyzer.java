package pascal;

import java.io.FileReader;
import java.io.IOException;

import generator.*;
import utils.SemanticManager;


public class PascaLexicalAnalyzer {


    public static void main(String[] args) throws IOException {

        String sourceCode = "/home/lucas/Documents/Compiladores/src/main/java/pascal/program.pas";

        try{
            LexicalAnalysisCalculator scanner = new LexicalAnalysisCalculator(new FileReader(sourceCode));

            Parser p = new Parser(scanner);

            System.out.println(p.parse() + "\n");

            SemanticManager.setInstance();


        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
