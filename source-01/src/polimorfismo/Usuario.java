package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author xavier
 */
public abstract class Usuario {
    
    private String nome;
    private String login;
    private String senha;
    
 
    public abstract void excluir();
  
    
    public boolean save(){
        JOptionPane.showMessageDialog(null, "Salvar da ancestral");
        return true;
    }
}
