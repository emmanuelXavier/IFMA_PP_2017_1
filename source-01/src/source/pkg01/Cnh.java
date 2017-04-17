/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source.pkg01;

/**
 *
 * @author xavier
 */
public class Cnh implements Documento{
    
    private String valor;
    

    public void setValor(String valor) {
       this.valor = valor;
    }

    
    public String getValor() {
        return valor;
    }

    
    public boolean validar() {
        return true;
    }
    
}
