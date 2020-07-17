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
public class ExLista16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instancia Cliente
        Cliente cli1 = new Cliente("Lucas Santana", "12345678971");
        
        // Instancia Contas
        Conta c1 = new Conta(123);
        Conta c2 = new Conta(456);
        
        // Associa Cliente e Contas
        cli1.setConta(c1, 0);
        cli1.setConta(c2, 1);
        
        // Executa o sistema
        c1.depositar(35000);
        cli1.aplicarRecursos(10000);
        c2.sacar(1200);
        
        String res = cli1.gerarRelatorio();
        System.out.println(res);
    }
    
}
