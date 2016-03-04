/*
 * Faça um Programa que peça dois números e imprima a soma.
 */
package exercicios.aula01;

import java.util.Scanner;

/**
 * Exericicio03 [Classe]
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        soma = numero1 + numero2;
        
        System.out.println("A soma dos números é: "+soma);
    }
}
