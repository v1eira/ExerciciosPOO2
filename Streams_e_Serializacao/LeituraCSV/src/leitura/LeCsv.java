
package leitura;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();
        String current = new java.io.File( "." ).getCanonicalPath();
        File inputFile = new File(current + "//src//arquivo.csv");
        FileReader in = new FileReader(inputFile);
        String input = "";
        Cliente cliente = new Cliente();
        int linha = 1;
        int count = 0;
        int c;
        
        while ((c = in.read()) != -1)
        {
            if(linha == 1)
            {
                if((char)(c) == '\n')
                {
                    linha = 0;
                }
            }
            else
            {
                if (((char)(c) != ';') && ((char)(c) != '\n'))
                {
                    char caracter = (char)(c);
                    input += caracter;
                }
                else
                {
                    count += 1;
                    switch(count)
                    {
                        case 1:
                            cliente.setId(input);
                            break;
                        case 2:
                            cliente.setNome(input);
                            break;
                        case 3:
                            cliente.setEmail(input);
                            break;
                        case 4:
                            cliente.setDataNascimento(input);
                            break;
                        case 5:
                            cliente.setTelefone(input);
                            break;
                        case 6:
                            cliente.setTotalCompras(Double.parseDouble(input));
                            count = 0;
                            clientes.add(cliente);
                            cliente = new Cliente();
                            break;
                    }
                    input = "";
                }
            }
        }
        in.close();
        
        return clientes;
     }
}
