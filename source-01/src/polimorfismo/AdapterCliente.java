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
public class AdapterCliente implements Autenticacao{
    
    private Cliente cliente = new Cliente();

    
    public boolean autenticar() {
       return cliente.autenticacao();
    }
    
    
    
}
