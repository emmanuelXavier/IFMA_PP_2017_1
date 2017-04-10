
package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author xavier
 */
public  class UsuarioComum extends Usuario implements Autenticacao{
    
    private String departamento;
    
    public boolean autenticar(){
        //code 01
        JOptionPane.showMessageDialog(null, "COmum");
        return true;
    }
    
    public void teste(){
        
    }
        
    
}
