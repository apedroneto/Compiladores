# Compiladores

##Passos para testar

###Mude o caminho o arquivo GeneratorPascal e PascalLexicalAnalyzer para o respectivo caminho do seu computador

##1º
## execute o generator pascal(vai gerar um arquvio .java), mova esse arquivo para a pasta generator
##2º
## execute o comando java -jar libs/java-cup-11a.jar -compact_red -expect 10000 -package compiler.generated -destdir src/main/java/pascal/ -symbols sym -parser Parser  src/main/java/pascal/Pascal.cup
## vai gerar dois arquivos .jar "sym" e "Parser", mova os dois para a pasta generator
##(obs talvez no processo precise comentar algum trexo de codigo no arquivo "PascalLexicalAnalyzer")
##3º
## mude a classe "LexicalAnalysisCalculator" para public e seu contrutor também para public
##4º
## coloque um programa pascal no arquivo "program.pas"
##5º
## rode a classe "PascalLexicalAnalyzer" (o console vai mostrar se deu erro)
