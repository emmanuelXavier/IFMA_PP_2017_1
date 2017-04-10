
package polimorfismo;

import source.pkg01.Emprestimo;

public class Cliente extends Emprestimo implements Autenticacao{
    
    private String cpf;
    private String nome;
    private String senha;
    
 
    
    
    public boolean autenticar(){
        //code 01
        return true;
    }
    
}
