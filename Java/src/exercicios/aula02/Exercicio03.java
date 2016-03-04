/*
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */
package exercicios.aula02;

import java.util.Scanner;

/**
 * Exericicio03 [Classe]
 * @author Felipe Muniz, 2016, Nilsoft
 */
public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String sexo;
        
        System.out.println("Digite seu sexo F ou M");
        sexo = entrada.next();
        
        if(sexo.equals("M")){
            System.out.println("Sexo masculino!");
        }else if(sexo.equals("F")){
            System.out.println("Sexo feminino!");
        }else{
            System.out.println("Sexo inválido!");
        }
        
    }
    
}