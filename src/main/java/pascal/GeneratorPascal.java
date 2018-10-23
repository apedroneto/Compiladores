package pascal;

import java.io.File;

public class GeneratorPascal {

    public static void main(String[] args) {

        String file = "/home/antonio/compilador_jflex_cup/Compiladores/src/main/java/pascal/pascal.flex";

        File sourceCode = new File(file);

        jflex.Main.generate(sourceCode);

    }
}
