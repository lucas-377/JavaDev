/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extestadordecaixa;

import java.util.Scanner;

/**
 *
 * @author B4TMAN
 */
public class ExTestadorDeCaixa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cria o Scanner para captação de entrada de dados.
        Scanner teclado = new Scanner(System.in);
        
        //Instancia objetos Caixa.
        Caixa c1, c2; // Referencia o "apelido" do objeto.
        c1 = new Caixa();
        c2 = new Caixa();
        
        //Adquire dados do usuário e os define no objeto.
        System.out.print("Digite a altura da caixa 1: ");
        c1.setAltura(teclado.nextFloat());
        System.out.print("Digite a largura da caixa 1: ");
        c1.setLargura(teclado.nextFloat());
        System.out.print("Digite a profundidade da caixa 1: ");
        c1.setProfundidade(teclado.nextFloat());
        
        System.out.print("Digite a altura da caixa 2: ");
        c2.setAltura(teclado.nextFloat());
        System.out.print("Digite a largura da caixa 2: ");
        c2.setLargura(teclado.nextFloat());
        System.out.print("Digite a profundidade da caixa 2: ");
        c2.setProfundidade(teclado.nextFloat());
        
        //Efetua os cálculos de area externa e volume e exibe o resultado.
        System.out.println("Area externa da caixa 1: " + c1.calculaAreaExt());
        System.out.println("Volume da caixa 1: " + c1.calcularVolume());
        
        System.out.println("Area externa da caixa 2: " + c2.calculaAreaExt());
        System.out.println("Volume da caixa 2: " + c2.calcularVolume());
    }
    
}
