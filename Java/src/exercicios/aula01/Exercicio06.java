/*
 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */
package exercicios.aula01;

import java.util.Scanner;

/**
 * Exericicio06 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int area, raio;
        
        System.out.println("Digite o raio do circulo:");
        raio = entrada.nextInt();

        System.out.println("\nA area do circulo é " + Math.PI * (raio*raio));

    }
}
