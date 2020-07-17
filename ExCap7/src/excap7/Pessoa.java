/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excap7;

/**
 *
 * @author B4TMAN
 */
public class Pessoa {
    // Atributos
    private String nome;
    private int diaNasc, mesNasc, anoNasc, idade;
    
    // Associa Universidade
    private Universidade universidade;
    
    public void setUniversidade(Universidade univ){
        universidade = univ;
    }
    
    public String getUniversidade(){
        return this.universidade.getNome();
    }
    
    // Construtora
    public Pessoa(String nome, int diaNasc, int mesNasc, int anoNasc) {
        this.nome = nome;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.idade = -1;
    }
    
    //Métodos
    public void calculaIdade(){
        this.idade = 2020 - this.anoNasc;
        System.out.println("A idade de " + this.nome + " seria " + idade + " anos");
    }
}
