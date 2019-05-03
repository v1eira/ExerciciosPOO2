package arquivo.txt;


/*
Exercicios que mostra como ler um arquivo e salvar os dados de um arquivo em outro arquivo.
 */

import java.io.*;

public class ArquivoFileStream {
    
    public static void main(String[] args) throws IOException {
                
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "\\src\\arquivo_entrada.txt");        
        File outputFile = new File(current + "\\src\\arquivo_saida.txt");        
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        
        in.close();
        out.close();
       
        System.out.println("Arquivo gerado em: " + outputFile.getAbsolutePath());
    }
}

   
