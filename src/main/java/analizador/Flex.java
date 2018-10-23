package analizador;

import jflex.*;

import javax.swing.*;
import java.io.File;
import java.io.StringReader;

public class Flex {
    public static void main(String args[]){
      try {
//          String caminho = "/home/antonio/compilador_jflex_cup/Compiladores/src/main/java/analizador/Lexer.flex";
//          geraLexer(caminho);

          String n = (JOptionPane.showInputDialog("Coloque a expressao"));
          LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer(new StringReader(n));

          for(int i =0; i < n.length(); i++) {

              if(n.charAt(i) >= '0' && n.charAt(i) <= '9') {
                  LexicalAnalyzer lexicalAnalyzer1 = new LexicalAnalyzer( new StringReader(String.valueOf(n.charAt(i))));
                  System.out.println(lexicalAnalyzer1.yylex());
              }

              if(n.charAt(i) == '+' || n.charAt(i) == '-' || n.charAt(i) == '*'|| n.charAt(i) == '/' || n.charAt(i) == '^') {
                  LexicalAnalyzer lexicalAnalyzer1 = new LexicalAnalyzer( new StringReader(String.valueOf(n.charAt(i))));
                  System.out.println(lexicalAnalyzer1.yylex());
              }

              if(n.charAt(i) == ' ') {
                  LexicalAnalyzer lexicalAnalyzer1 = new LexicalAnalyzer( new StringReader(String.valueOf(n.charAt(i))));
                  System.out.println(lexicalAnalyzer1.yylex());
              }

          }

          System.out.println("ER="+ lexicalAnalyzer.yylex());
      } catch (Exception e){
          System.out.println("ERROR LEXICO");
      }


    }

    //F f

    private static void geraLexer(String caminho){
        File arquivo = new File(caminho);
        jflex.Main.generate(arquivo);
    }

}