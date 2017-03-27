package source.pkg01;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ContaBancaria {
    private String nomeCliente;
    private String cpfCliente;
    private float saldo;
    private HashMap<String, Emprestimo> emprestimos = new HashMap<String, Emprestimo>();
    
    public void registrarEmprestimo(String nomeFiador, Cpf cpfFiador, double valor){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setNomeFiador(nomeFiador);
        emprestimo.setCpfFiador(cpfFiador);
        emprestimo.setValor(valor);

        emprestimos.put(cpfFiador.getValor(), emprestimo);
    }
    
    public void listarEmprestimos(){
        System.out.println("Nome do fiador\tValor\tPago\tDébito");
        for (String chave : emprestimos.keySet()){
            Emprestimo emp = emprestimos.get(chave);

            System.out.println(emp.getNomeFiador() + "\t"+ emp.getValor() + "\t" + 
                    emp.getValorPago() + "\t" + emp.getDebito());
        } 
    }
    
    public void pagarEmprestimo(Cpf cpfFiador,Cpf cpfPagador, Date data, double valor) {  
        Emprestimo emp = emprestimos.get(cpfFiador);
        if (emp != null){
            Pagamento pag = new Pagamento();
            pag.setCpfPagador(cpfPagador);
            pag.setData(data);
            pag.setValor(valor);
            emp.addPagamento(pag);
            
            
        }
    }
        
    public float getSaldo(){
        return saldo;
    }
    
    public void depositar(float valor){
        if (saldo >= 100){
            saldo = saldo - (saldo * 0.02f);
        }
        saldo +=  valor;
    }
    
}
