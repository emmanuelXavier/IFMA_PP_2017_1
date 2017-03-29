
package source.pkg01;

import javax.swing.JOptionPane;


public class Cpf {
    private String valor;
    
    
    public Cpf(String valor){
        this.valor = valor;
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
        this.validar();
    }
    
    protected boolean validar(){
        JOptionPane.showMessageDialog(null, "Validando cpf");
        return true;
    }
    
  
    
}
