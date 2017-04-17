
package source.pkg01;

import javax.swing.JOptionPane;


public class Cpf implements Documento{
    private String valor;
    
    

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
        this.validar();
    }
    
    public boolean validar(){
        JOptionPane.showMessageDialog(null, "Validando cpf");
        return true;
    }
    
  
    
}
