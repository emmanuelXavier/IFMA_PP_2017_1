/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source.pkg01;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        
        
       
        
        
       
        
        
        
        
               
    }
    
}
