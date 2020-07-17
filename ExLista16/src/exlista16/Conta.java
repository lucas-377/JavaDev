/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exlista16;

/**
 *
 * @author B4TMAN
 */
public class Conta {
    // Atributos
    private int numero;
    private double saldo;
    
    // Construtora
    public Conta(int numero) {
        this.numero = numero;
        saldo = 0;
    }
    
    // Métodos
    public void sacar(float valor){
        if (this.getSaldo() == 0 || this.getSaldo() < 0 || valor > this.getSaldo())
            System.out.println("Saldo insuficiente");
        else
            this.saldo -= valor;
    }
    
    public void depositar(float valor){
        this.saldo += valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getNumero(){
        return this.numero;
    }
}
