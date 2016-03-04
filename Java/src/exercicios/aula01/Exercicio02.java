/*
 * Faça um Programa que peça um número,
 * e então mostre a mensagem "O número informado foi [número]".
 */
package exercicios.aula01;

import java.util.Scanner;

/**
 * Exericicio01 [Classe]
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
         
         int numero = 0;
         
         System.out.println("Digite um número: ");
         numero = entrada.nextInt();
         
         System.out.println("O número informado é: "+numero);
    }
    
}
