/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exlista1;

/**
 *
 * @author B4TMAN
 */
public class Horario {
    // Atributos
    private int hora;
    private int min;

    public Horario(int hora, int min) {
        this.setHora(hora);
        this.setMin(min);
    }
    
    // Métodos especiais

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        if (hora <= 23 && hora >= 0){
            this.hora = hora;
            return true;
        }
        else
            return false;
    }

    public int getMin() {
        return min;
    }

    public boolean setMin(int min) {
        if (min <= 60 && min >= 0){
            this.min = min;
            return true;
        }
        else
            return false;
    }
    
    // Métodos
    public void calcularIntervalo(Horario h){
        int hIntervalo, mIntervalo;
        
        // Verifica se passou uma hora de intervalo e calcula os minutos
        hIntervalo = h.getHora() - this.getHora();
        
        if (hIntervalo > 0){
            if (this.getMin() > h.getMin())
                mIntervalo = 60 - this.getMin() + h.getMin();
            else
                mIntervalo = 60 - h.getMin() - this.getMin();
        }
        
        else {
            mIntervalo = h.getMin() - this.getMin();
        }
        
        // Calcula o valor a ser pago
        if (hIntervalo < 3){
            System.out.println("Tempo decorrido: " + hIntervalo
            + ":" + mIntervalo);
            System.out.println("Valor a pagar: R$4,50");
        }
        else if (hIntervalo < 12){
            System.out.println("Tempo decorrido: " + hIntervalo
            + ":" + mIntervalo);
            
            double excedente = ((mIntervalo / 15) * 0.75) + 4.5;
            
            System.out.println("Valor a pagar: R$" + excedente);
        }
        else {
            System.out.println("Valor a pagar: R$33,00");
        }
    }
}
