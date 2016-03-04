/*
 * Faça um Programa que converta metros para centímetros.
 */
package exercicios.aula01;

import java.util.Scanner;

/**
 * Exericicio05 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float metro, centimetro;

        System.out.println("Digite quantos metros quer converter para centimetros:");
        metro = entrada.nextFloat();

        System.out.println("\n" + metro + " metros é igual a " + metro / 0.010000 +" centimetros");

    }
}
