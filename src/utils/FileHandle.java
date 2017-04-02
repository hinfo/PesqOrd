/*
 * Classe para manipular arquivos, leitura e gravação.
 *  
 */
package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henrique
 */
public class FileHandle {
    /**
     * Lendo um arquivo e retornando um array de inteiros.
     * @param inputFileName
     * @return array de inteiros
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public List readFile(String inputFileName) throws FileNotFoundException, IOException{
        FileReader inputFile = new FileReader(inputFileName);
        BufferedReader bf = new BufferedReader(inputFile);
        String line;
        List<Integer> numeros = new ArrayList<>();
        while ((line = bf.readLine()) != null){
            numeros.add(Integer.parseInt(line));
        }
        inputFile.close();
        return numeros;
        
    }
    /**
     * Gravar arquivo com os valores
     * @param outputFileName nome do arquivo de saída
     * @param vetor valores ordenados
     * @param metodo nome do método utilizado na ordenação
     * @throws java.io.IOException 
     */
    public void writeFile(String outputFileName, List vetor, String metodo, String tempo) throws IOException{
        try (FileWriter out = new FileWriter(outputFileName)) {
            out.write("Método utilizado: " + metodo + "\nTempo de duração: " + tempo + "\n");
            for (Object num : vetor){
                out.write((String) num.toString() + "\n");
            }
            
            out.close();
        }
    }
}
