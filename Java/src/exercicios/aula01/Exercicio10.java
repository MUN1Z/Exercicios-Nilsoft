/*
 * Faça um Programa que peça a temperatura em graus Celsius,
 * transforme e mostre a temperatura em graus Farenheit.
 */
package exercicios.aula01;

import java.util.Scanner;

/**
 * Exericicio10 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float celsius, farenheit;
        
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = entrada.nextFloat();
        
        farenheit = (celsius * 9) / 5;
        
        System.out.println("A temperatura em Farenheit é " +celsius);

    }
}
