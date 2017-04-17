
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
    

    public boolean save(){
        //computacao antes
        JOptionPane.showMessageDialog(null, "Salvar do descendente");
        //usa metodo herdado
        //super.save();
        //computacao depois
        
        return false;
    }
    
    public boolean save(int i){
        //computacao antes
        JOptionPane.showMessageDialog(null, "Salvar do descendente");
        //usa metodo herdado
        //super.save();
        //computacao depois
        
        return false;
    }
    
     public void excluir(){
        
    }
    
    
        
    
}
