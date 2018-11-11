package pascal;

import java.io.File;

public class GeneratorPascal {

    public static void main(String[] args) {

        String file = "/home/antonio/horaDoShow/Compiladores/src/main/java/pascal/pascal.flex";

        File sourceCode = new File(file);

        jflex.Main.generate(sourceCode);

    }
}
