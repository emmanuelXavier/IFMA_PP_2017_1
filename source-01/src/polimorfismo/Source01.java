/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import com.sun.media.sound.AuFileReader;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import polimorfismo.Autenticacao;
import polimorfismo.Cliente;
import polimorfismo.Dono;
import polimorfismo.Usuario;
import polimorfismo.UsuarioAdm;
import polimorfismo.UsuarioComum;
import polimorfismo.UsuarioSupervisor;
import source.pkg01.Cnh;
import source.pkg01.Cnpj;
import source.pkg01.ContaBancaria;
import source.pkg01.Cpf;
import source.pkg01.Emprestimo;
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
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setNomeFiador("EMmaneul");
        emprestimo.setCpfFiador(new Cpf());

        emprestimo.setValor(10);
        
        
        conta.registrarEmprestimo(emprestimo);
       /* conta.registrarEmprestimo("Suzane Xavier", new Cpf(), 2000);
        conta.registrarEmprestimo("André Xavier", new Cpf(), 3000);
        conta.registrarEmprestimo("Enzo Xavier", new Cpf(), 4000);*/
        
        
        conta.pagarEmprestimo(new Cpf(), new Cnh(),new Date(),100);
        conta.listarEmprestimos();
        
        
        //Dono obj = new Dono();
      
        //obj.autenticar();
        
        
        controllerAutenticacao(new AdapterCliente());
              
        Usuario user = new UsuarioSupervisor();
        //user.nome = "Silas";
        user.excluir();
        JFrame janela = new JFrame("Minha janela");
        janela.setBounds(0, 0, 500, 500);
        janela.setVisible(true);
        JOptionPane.showMessageDialog(null, "tyeste");
        JOptionPane.showMessageDialog(janela, "teste", "Silas sistemas", JOptionPane.ERROR_MESSAGE);
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
