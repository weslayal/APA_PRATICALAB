/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

import ordena.Ordena;

/**
 *
 * @author wesley
 */
public class Insection extends Ordena{
    public void organizaVetor(int[] vetor) {
        int coringa;
        int compara = 0;
        int troca = 0;
        
        //ordena o vetor insection sort
        for (int i = 0; i < vetor.length; i++) {
            compara++;
            coringa = vetor[i];
            int j = 0;
            j = i - 1;
            while (j >= 0 && coringa < vetor[j]) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
                troca++;
            }
            vetor[j + 1] = coringa;
        }
        System.out.println("Número de comparações: " + compara);
        System.out.println("Número de trocas: " + troca);
    }
}
