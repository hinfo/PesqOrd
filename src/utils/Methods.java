package utils;

import java.util.ArrayList;
import java.util.Arrays;
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
        int trocados[] = {};
	for(int i = 0; i < vetor.length; i++){
		for(int j = 0; j < (vetor.length - 1); j++){
			if( vetor[j] > vetor[j + 1]){
                            trocados = troca(vetor[j],vetor[j+1]);
                            vetor[j] = trocados[0];
                            vetor[j+1] = trocados[1];
			}
		}
	}
        return vetor;
    }
    public List<Integer> agitacao(int[] vetor){
        int aux = 0;
        List<Integer> numeros = new ArrayList<>();
	for(int i = 0; i < vetor.length; i++){
		for(int j = 0; j < (vetor.length - 1); j++){
			if( vetor[j] > vetor[j + 1]){
				aux = vetor[j];
				vetor[j] = vetor[j+1];
				vetor[j+1] = aux;
			}
		}
        }
        
        for (int num : vetor){
            numeros.add(num);
        }
        return numeros;
    }
    
    public int[] troca(int numA, int numB){
        int numeros[] = new int[2];
        int aux = 0;
        aux = numA;
        numA = numB;
        numB = aux;
        numeros[0] = numA;
        numeros[1] = numB;
        return numeros;
    }
    /**
     * mostra vetor, utilizado em testes.
     * @param vetor 
     */
    
    public void mostraVetor(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
		System.out.print(vetor[i] + " ");
	}
        System.out.println("");
    }
    public int[] geraVetorAleatorio(int tamanhoVetor, int max){
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
    public static void SelectionSort ( int [ ] num ){

     int i, j, first, temp; 
     for ( i = num.length - 1; i > 0; i--){
          first = 0;   //initialize to subscript of first element
          for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
          {
               if( num[ j ] < num[ first ] )         
                 first = j;
          }
          temp = num[ first ];   //swap smallest found with element in position i.
          num[ first ] = num[ i ];
          num[ i ] = temp; 
      }           
    }
    public static int[] doInsertionSort(int[] input){ //vetor
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
    public static void mergeSort(int[] A) {
        int[] vetor = null;
        if (A.length > 1) {
            int q = A.length/2;

        //Altera a faixa da porçao esquerda de 0-até-q para 0-até-(q-1)
            int[] leftArray = Arrays.copyOfRange(A, 0, q-1);
        //Altera a faixa da porção da direita de q-até-A.length para q-até-(A.length-1)
            int[] rightArray = Arrays.copyOfRange(A,q,A.length-1);

            mergeSort(leftArray); // Método auxiliar
            mergeSort(rightArray);

        }
    }
    /**
     * Metodo auxiliar do mergeSort
     * @param a
     * @param l
     * @param r 
     */
    static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        //return a;

    }
    public static void shellSort(int[] nums) {
    int h = 1;
    int n = nums.length;
    while(h < n) {
        h = h * 3 + 1;
    }
    h = h / 3;
    int c, j;
    while (h > 0) {
        for (int i = h; i < n; i++) {
            c = nums[i];
            j = i;
            while (j >= h && nums[j - h] > c) {
                nums[j] = nums[j - h];
                j = j - h;
            }
            nums[j] = c;
        }
        h = h / 2;
    }
    }
    
}
