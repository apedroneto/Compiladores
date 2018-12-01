package pascal;

import utils.SemanticManager;

import java.io.File;

public class GeneratorPascal {

    public static void main(String[] args) {

        String file = "/home/lucas/Compiladores/src/main/java/pascal/pascal.flex";

        File sourceCode = new File(file);

        jflex.Main.generate(sourceCode);

    }
}
