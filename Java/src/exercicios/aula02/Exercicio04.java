/*
 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */
package exercicios.aula02;

import java.util.Scanner;

/**
 * Exericicio04 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String letra;

        System.out.println("Digite uma letra");
        letra = entrada.next();

        if (letra.equals("a")) {
            System.out.println("A letra " + letra + " é uma vogal!");
        } else if (letra.equals("e")) {
            System.out.println("A letra " + letra + " é uma vogal!");
        } else if (letra.equals("i")) {
            System.out.println("A letra " + letra + " é uma vogal!");
        } else if (letra.equals("o")) {
            System.out.println("A letra " + letra + " é uma vogal!");
        } else if (letra.equals("u")) {
            System.out.println("A letra " + letra + " é uma vogal!");
        } else {
            System.out.println("A letra " + letra + " é uma consolante!");
        }

    }

}
