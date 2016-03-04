/*
 * Faça um Programa que leia três números e mostre o maior deles.
 */
package exercicios.aula02;

import java.util.Scanner;

/**
 * Exericicio06 [Classe]
 *
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int numero;

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o "+(i+1)+"º número");
            numero = entrada.nextInt();
            
            if(numero > max){
                max =  numero;
            }
            
        }
        
         System.out.println("O maior número é "+max);
        
    }

}
