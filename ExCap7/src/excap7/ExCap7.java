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
public class ExCap7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Apelido dos objetos
        Pessoa Einstein, Newton, Lucas; 
        Universidade Princeton, Cambridge, UTFPR;
        
        // Instancia objetos da classe Pessoa
        Einstein = new Pessoa("Albert Einstein", 14, 03, 1879);
        Newton = new Pessoa("Isaac Newton", 04, 01, 1643);
        Lucas = new Pessoa("Lucas Santana", 01, 11, 1992);
        
        // Instancia objetos da classe Universidade
        Princeton = new Universidade("Universidade de Princeton");
        Cambridge = new Universidade("Universidade de Cambridge");
        UTFPR = new Universidade("Universidade Tecnológica Federal do Paraná");
        
        // Associa objeto Pessoa a Universidade
        Einstein.setUniversidade(Princeton);
        Newton.setUniversidade(Cambridge);
        Lucas.setUniversidade(UTFPR);
        
        // Imprime no log o status da pessoa
        Einstein.calculaIdade();
        Newton.calculaIdade();
        Lucas.calculaIdade();
        
        // Imprime universidade associada a pessoa
        System.out.println("Einstein trabalhou em " + Einstein.getUniversidade());
        System.out.println("Newton trabalhou em " + Newton.getUniversidade());
        System.out.println("Lucas estuda em " + Lucas.getUniversidade());
    }
    
}
