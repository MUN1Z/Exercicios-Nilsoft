/*
 * Faça um Programa que peça a área de um quadrado,
 * em seguida mostre o dobro desta área para o usuário
 */
package exercicios.aula01;

import java.util.Scanner;

/**
 * Exericicio07 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int area;
        
        System.out.println("Digite a area do quadrado:");
        area = entrada.nextInt();

        System.out.println("\nO dobro da area é " +(area*area));

    }
}
