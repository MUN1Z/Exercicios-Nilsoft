/*
 * Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
 * sabendo que a decisão é sempre pelo mais barato.
 */
package exercicios.aula02;

import java.util.Scanner;

/**
 * Exericicio08 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float min = Float.MAX_VALUE;
        
        float preco[] = new float[3];

        for (int i = 0; i < 3; i++) {
            
            System.out.println("Digite o preço do " + (i + 1) + "º Produto");
            preco[i] = entrada.nextInt();

            if (preco[i] < min) {
                min = preco[i];
                
            }

        }
        
        System.out.println("O melhor produto é o que tem o o valor de " + min+" R$");
        

    }

}
