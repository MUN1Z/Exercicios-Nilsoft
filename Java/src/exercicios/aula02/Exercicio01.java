/*
 * Faça um Programa que peça dois números e imprima o maior deles
 */
package exercicios.aula02;

import exercicios.aula01.*;
import java.util.Scanner;

/**
 * Exericicio01 [Classe]
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n1, n2;
        
        System.out.println("Digite o primeiro numero");
        n1 = entrada.nextInt();
        
        System.out.println("Digite o segundo numero");
        n2 = entrada.nextInt();
        
        if(n1 > n2){
            System.out.println("O maior número é "+n1);
        }else{
            System.out.println("O maior número é "+n2);
        }
        
    }
    
}