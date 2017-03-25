
package testes;

import utils.Methods;

/**
 *
 * @author henrique
 */
public class Main {
    public static void main(String[] args) {
        int i = 0;
        int[] vetorOriginal = {45,8,1,58,5,10,32};
        int[] vetorOrganizado = {};
            
        Methods trab = new Methods();
        vetorOriginal = trab.geraVetor(20, 100); // gera 20 numeros entre 0 e 100
        System.out.println("Mostra vetor desorganizado");
        trab.mostraVetor(vetorOriginal);
        vetorOrganizado = trab.bubbleSort(vetorOriginal);
        System.out.println("Mostra vetor organizado");
        trab.mostraVetor(vetorOrganizado);
        
    }
  
}
