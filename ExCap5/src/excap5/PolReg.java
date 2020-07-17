/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excap5;

/**
 *
 * @author B4TMAN
 */
public class PolReg {
    // Atributos
    private int numLados = 0;
    private int tamanhoLado = 0;
    
    // Construtor
    public PolReg(int numLados, int tamanhoLado) {
        this.numLados = numLados;
        this.tamanhoLado = tamanhoLado;
    }
    
    // Métodos
    public void calcPerimetro() {
        int resultado = this.numLados * this.tamanhoLado;
        System.out.println("O perímetro é de: " + resultado);;
    }
    
    public void calcAngulo() {
        int resultado = (this.numLados - 2) * 180;
        System.out.println("A soma dos ângulos internos é de: " 
                + resultado + "º");
    }
    
    public void calcArea() {
        System.out.println("Não é possível calcular área de um "
                + "polígono regular genérico!");
    }
}
