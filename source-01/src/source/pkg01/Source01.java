/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source.pkg01;

import com.sun.media.sound.AuFileReader;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import polimorfismo.Autenticacao;
import polimorfismo.Cliente;
import polimorfismo.Dono;
import polimorfismo.Usuario;
import polimorfismo.UsuarioAdm;
import polimorfismo.UsuarioComum;
import sun.util.resources.CalendarData;

/**
 *
 * @author xavier
 */
public class Source01 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        conta.registrarEmprestimo("Emmanuel Xavier", new Cpf("123.123.123-10"), 1000);
        conta.registrarEmprestimo("Suzane Xavier", new Cpf("123.123.123-11"), 2000);
        conta.registrarEmprestimo("André Xavier", new Cpf("123.123.123-12"), 3000);
        conta.registrarEmprestimo("Enzo Xavier", new Cpf("123.123.123-13"), 4000);
        
        
        conta.pagarEmprestimo(new Cpf("123.123.123-10"), new Cpf("123123"),new Date(),100);
        conta.listarEmprestimos();
        
        
        Dono obj = new Dono();
      
        obj.autenticar();
        
        
        //controllerAutenticacao(fabrica("Dono"));
              
    }
    
    private static Autenticacao fabrica(String classe){
        try {
            try {
                return (Autenticacao) Class.forName("polimorfismo."+classe).newInstance();
            } catch (InstantiationException ex) {
                JOptionPane.showMessageDialog(null, "Erro de instanciação");
            } catch (IllegalAccessException ex) {
                JOptionPane.showMessageDialog(null, "sem acesso");
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "classe inexistente");
        }
        
        return null;
    }
    
    private static void controllerAutenticacao(Autenticacao obj){
        if (obj.autenticar())
            JOptionPane.showMessageDialog(null, "Acesso ao sistema");
        else
            JOptionPane.showMessageDialog(null, "Falha de autenticação");
    }
    
   
    
}
