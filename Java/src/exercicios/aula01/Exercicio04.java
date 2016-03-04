/*
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */
package exercicios.aula01;

import java.util.Scanner;

/**
 * Exericicio04 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float nota[] = new float[4];
        float media;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a "+(i+1)+"ª nota: ");
            nota[i] = entrada.nextFloat();
        }
        
        media = (nota[0] + nota[1] + nota[2] + nota[3]) / 4;
        
        System.out.println("\nA média das Notas é: "+media);
        
    }
}
