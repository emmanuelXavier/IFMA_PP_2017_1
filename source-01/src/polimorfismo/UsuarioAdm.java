package polimorfismo;

/**
 *
 * @author xavier
 */
public class UsuarioAdm extends Usuario implements Autenticacao{
    
    private double comissao;
    
    public boolean autenticar(){
        //code 02
        return true;
    }
    
}
