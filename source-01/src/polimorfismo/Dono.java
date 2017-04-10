/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author xavier
 */
public class Dono {
        
    private Autenticacao user = new UsuarioAdm();
    
    public void autenticar(){
        user.autenticar();
    }
   
    
}
