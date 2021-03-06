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
public class Selection implements IOrganizador {

    public void organizaVetor(int[] vetor) {
        int menor, aux;
        int compara = 0;
        int troca = 0;

        //organiza o vetor no modo selection sort
        for (int i = 0; i < vetor.length; i++) {
            menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                compara++;
                if (vetor[menor] > vetor[j]) {
                    menor = j;
                }
            }
            if (menor != i) {
                aux = vetor[menor];
                vetor[menor] = vetor[i];
                vetor[i] = aux;
                troca++;
            }
        }
        System.out.println("Número de comparações: " + compara);
        System.out.println("Número de trocas: " + troca);
    }

}
