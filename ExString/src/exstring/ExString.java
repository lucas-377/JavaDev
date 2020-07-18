/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exstring;

import java.util.Scanner;

/**
 *
 * @author B4TMAN
 */
public class ExString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        // Capta o nome digitado pelo usuário
        System.out.print("Digite seu nome completo: ");
        String nome = teclado.nextLine();
        
        // Separa a String onde possui espaço em um vetor de strings
        String [] abreviado = nome.split(" "); 
        
        // Percorre o vetor de strings separadas
        for (String letras : abreviado){
            // Verifica a qtd de letras
            if (letras.length() < 4){
                switch (letras.length()){
                    case 1:
                        // No caso de apenas uma letra digitada
                        System.out.print(letras.substring(0, 1).toUpperCase() + ".");
                        break;
                    case 2:
                        System.out.print(" " + letras.substring(0, 2) + " ");
                        break;
                    case 3:
                        System.out.print(" " + letras.substring(0, 3) + " ");
                }
            }
            
            // Nomes maiores que 3 letras com iniciais maiúsculas
            else
                System.out.print(letras.substring(0, 1).toUpperCase() + ".");
        }
        System.out.println("\n");
    } 
    
}
