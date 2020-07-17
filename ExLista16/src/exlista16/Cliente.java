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
public class Cliente {
    // Atributos
    private String nome;
    private String cpf;
    
    // Associa conta
    private Conta [] contas;
    
    // Link de Cliente e Conta
    public boolean setConta(Conta conta, int indice){
        if (indice >= 3)
            return false;
        contas[indice] = conta;
        return true;
    }

    // Construtora
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        contas = new Conta[3];
    }
    
    // Métodos
    public String gerarRelatorio(){
        String relatorio = "";
        relatorio += "\nNome: " + this.nome;
        relatorio += "\nCPF: " + this.cpf;
        relatorio += "\nCarteira de aplicações: ";
        
        for (int i = 0; i < 3; i++){
            if (contas[i] != null){
                relatorio += "\nConta " + contas[i].getNumero() + ", saldo " 
                        + contas[i].getSaldo();
            }
        }
        return relatorio;
    }
    
    public boolean aplicarRecursos(double rec){
        // Verifica quantas contas Cliente tem
        int nContas = 0;
        
        for (int i = 0; i < 3; i++){
            if (contas[i] != null)
                nContas++;
        }
        
        if (nContas == 0)
            return false;
        
        double valorPorConta = rec / nContas;
        
        for (int i = 0; i < 3; i++){
            if (contas[i] != null)
                contas[i].depositar((float) valorPorConta);
        }
        
        return true;
    }
}
