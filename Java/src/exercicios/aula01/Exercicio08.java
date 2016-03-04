/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 * Calcule e mostre o total do seu salário no referido mês.
 */
package exercicios.aula01;

import java.util.Scanner;

/**
 * Exericicio08 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float ganhaPorHora, horasTrabalhadas;
        int mes;
        
        System.out.println("Digite quanto você ganha por hora");
        ganhaPorHora = entrada.nextFloat();
        
        System.out.println("Digite quantas horas você trabalha por dia");
        horasTrabalhadas = entrada.nextFloat();
        
        System.out.println("Digite quantos dias tem o mês");
        mes = entrada.nextInt();
        
        

        System.out.println("O seu salario será " +((ganhaPorHora*horasTrabalhadas)*mes)+" R$");

    }
}
