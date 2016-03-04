/*
 * Faça um Programa que peça a temperatura em graus Farenheit,
 * transforme e mostre a temperatura em graus Celsius.
 */
package exercicios.aula01;

import java.util.Scanner;

/**
 * Exericicio09 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float celsius, farenheit;
        
        System.out.println("Digite a temperatura em Farenheit: ");
        farenheit = entrada.nextFloat();
        
        celsius = (5 * (farenheit-32) / 9);
        
        System.out.println("A temperatura em Celcius é " +celsius);

    }
}
