/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash.examen;

/**
 *
 * @author Shelly Pam
 */
public class Analisis {
    
     private Tokens hash;
    private String valor;

    public Tokens getTipo() {
        return hash;
    }

    public void setTipo(Tokens tipo) {
        this.hash = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
