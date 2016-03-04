/*
 * Faça um programa para a leitura de duas notas parciais de um aluno. 
 * O programa deve calcular a média alcançada por aluno e apresentar:
 * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 * A mensagem "Reprovado", se a média for menor do que sete;
 * A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */
package exercicios.aula02;

import java.util.Scanner;

/**
 * Exericicio05 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Float nota1, nota2, media;

        System.out.println("Digite a primeira nota");
        nota1 = entrada.nextFloat();
        
        System.out.println("Digite a segunda nota");
        nota2 = entrada.nextFloat();
        
        media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("É o bixaum mesmo!");
        } else if (media > 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        } 

    }

}
