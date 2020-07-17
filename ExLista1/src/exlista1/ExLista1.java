/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exlista1;

import java.util.Scanner;

/**
 *
 * @author B4TMAN
 */
public class ExLista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int horaEntrada, horaSaida, minutosEntrada, minutosSaida;
        
        // Scanner para captar dados do usuário
        Scanner teclado = new Scanner(System.in);
        
        // Capta hora de entrada
        System.out.print("Digite a hora de entrada: ");
        horaEntrada = teclado.nextInt();
        System.out.print("Digite os minutos de entrada: ");
        minutosEntrada = teclado.nextInt();
        
        // Capta hora de saida
        System.out.print("Digite a hora de saida: ");
        horaSaida = teclado.nextInt();
        System.out.print("Digite os minutos de saida: ");
        minutosSaida = teclado.nextInt();
        
        // Instancia objetos da classe horario
        Horario h1 = new Horario(horaEntrada, minutosEntrada);
        Horario h2 = new Horario(horaSaida, minutosSaida);
        
        // Imprime status da hora digitada
        System.out.println("Horario de entrada: " + h1.getHora() +
                ":" + h1.getMin());
        
        System.out.println("Horario de saida: " + h2.getHora() +
                ":" + h2.getMin());
        
        // Calcula tempo passado
        h1.calcularIntervalo(h2);
    }
    
}
