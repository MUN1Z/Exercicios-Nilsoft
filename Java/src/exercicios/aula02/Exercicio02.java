/*
 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */
package exercicios.aula02;

import java.util.Scanner;

/**
 * Exericicio02 [Classe]
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n1;
        
        System.out.println("Digite um número");
        n1 = entrada.nextInt();
        
        if(n1 >= 0){
            System.out.println(n1+" é positivo");
        }else{
            System.out.println(n1+" é negativo");
        }
        
    }
    
}