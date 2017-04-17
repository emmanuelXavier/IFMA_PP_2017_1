/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source.pkg01;

import javax.swing.JOptionPane;

/**
 *
 * @author xavier
 */
public class Cnpj implements Documento{
    
    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public boolean validar(){
        JOptionPane.showMessageDialog(null, "Validando CNPJ");
        return true;
    }
    
    
    
    
    
    
    
    
}
