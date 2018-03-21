package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {

    public LinkedList<Cliente> leCsvClientes() throws IOException {

        LinkedList<Cliente> clientes = new LinkedList<Cliente>();
        String current = new java.io.File(".").getCanonicalPath();
        File inputFile = new File(current + "\\src\\arquivo.csv");
        FileReader in = new FileReader(inputFile);
        
        BufferedReader br = new BufferedReader(in);
        
        String linha = br.readLine();
        
        String[] clientStr;
        
        while ((linha = br.readLine()) != null ) {
            clientStr = linha.split(";");
            
            Cliente cliente = new Cliente();
            cliente.setId(clientStr[0]);
            cliente.setNome(clientStr[1]);
            cliente.setEmail(clientStr[2]);
            cliente.setDataNascimento(clientStr[3]);
            cliente.setTelefone(clientStr[4]);
            cliente.setTotalCompras(new Double(clientStr[5]));
            
            clientes.add(cliente);
        }
        br.close();
        in.close();
 
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        return clientes;
    }
}
