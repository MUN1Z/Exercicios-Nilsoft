/*
 * Faça um Programa que leia três números e mostre o maior e o menor deles.
 */
package exercicios.aula02;

import java.util.Scanner;

/**
 * Exericicio07 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int numero;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i + 1) + "º número");
            numero = entrada.nextInt();

            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }

        }

        System.out.println("O maior número é " + max);
        System.out.println("O Menor número é " + min);

    }

}
