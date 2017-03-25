package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author henrique
 */
public class Methods {
    
     
    public int[] bubbleSort(int[] vetor){
	int aux = 0;
	for(int i = 0; i < vetor.length; i++){
		for(int j = 0; j < (vetor.length - 1); j++){
			if( vetor[j] > vetor[j + 1]){
				aux = vetor[j];
				vetor[j] = vetor[j+1];
				vetor[j+1] = aux;
                                
//                            troca(vetor[j],vetor[j+1]);
			}
		}
	}
        return vetor;
    }
    public int[] agitacao(int[] vetor){
        int aux = 0;
	for(int i = 0; i < vetor.length; i++){
		for(int j = 0; j < (vetor.length - 1); j++){
			if( vetor[j] > vetor[j + 1]){
				aux = vetor[j];
				vetor[j] = vetor[j+1];
				vetor[j+1] = aux;
			}
		}
        }
        
        return vetor;
    }
    public void troca(int numA, int numB){
        int aux = 0;
        aux = numA;
        numA = numB;
        numB = aux;
    }
    public void mostraVetor(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
		System.out.print(vetor[i] + " ");
	}
        System.out.println("");
    }
    public int[] geraVetor(int tamanhoVetor, int max){
        /**
         * Gera uma lista organizada e depois mistura
         */
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < max; i++){
            numeros.add(i);
        }
        Collections.shuffle(numeros);
        
        
        int[] vetor = new int[tamanhoVetor];
        for (int i = 0; i < vetor.length; i++){
              vetor[i] = numeros.get(i);
        }
        
        return vetor;
        }
    
}
