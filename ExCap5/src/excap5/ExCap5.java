/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excap5;

import java.util.Scanner;

/**
 *
 * @author B4TMAN
 */
public class ExCap5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lados, tamanho;
        
        Scanner teclado = new Scanner(System.in);
        
        PolReg poligonoRegular; //Apelida a classe
        
        // Capta dados do usuário
        System.out.print("Digite o numero de lados: ");
        lados = teclado.nextInt();
        System.out.print("Digite o tamanho do lado: ");
        tamanho = teclado.nextInt();
        
        // Instancia objeto via construtor
        poligonoRegular = new PolReg(lados, tamanho);
        
        // Efetua os cálculos
        poligonoRegular.calcPerimetro();
        poligonoRegular.calcAngulo();
        poligonoRegular.calcArea();
    }
    
}
