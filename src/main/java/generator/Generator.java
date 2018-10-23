package generator;

import java.io.File;
import java.nio.file.Paths;

public class Generator {

    public static void main(String[] args) {

        String file = "/home/antonio/compilador_jflex_cup/Compiladores/src/main/java/generator/language.flex";

        File sourceCode = new File(file);

        jflex.Main.generate(sourceCode);

    }
}
