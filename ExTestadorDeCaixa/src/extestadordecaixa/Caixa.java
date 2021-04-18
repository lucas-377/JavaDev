/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extestadordecaixa;

/**
 *
 * @author B4TMAN
 */
public class Caixa {
    private float altura, largura, profundidade;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public void setProfundidade(float profundidade) {
        this.profundidade = profundidade;
    }
    
    public float calculaAreaExt(){
        float area;
        area = 2*( (largura*altura) + (largura*profundidade) + (altura*profundidade) );
        return area;
    }
    
    public float calcularVolume(){
        float volume;
        volume = largura*altura*profundidade;
        return volume;
    }
}
