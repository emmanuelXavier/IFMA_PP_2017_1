package source.pkg01;

import java.util.HashMap;

public class ContaBancaria {
    
    private float saldo;
    private HashMap<String, Emprestimo> emprestimos = new HashMap<String, Emprestimo>();
    
    public void registrarEmprestimo(String nomeFiador, String cpfFiador, double valor){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setNomeFiador(nomeFiador);
        emprestimo.setCpfFiador(cpfFiador);
        emprestimo.setValor(valor);

        emprestimos.put(cpfFiador, emprestimo);
    }
    
    public void listarEmprestimos(){
        System.out.println("Nome do fiador\tValor\tPago\tDébito");
        for (String chave : emprestimos.keySet()){
            Emprestimo emp = emprestimos.get(chave);

            System.out.println(emp.getNomeFiador() + "\t"+ emp.getValor() + "\t" + 
                    emp.getValorPago() + "\t" + emp.getDebito());
        } 
    }
    
    public void pagarEmprestimo(String cpfFiador, double valor) throws IllegalArgumentException{
        
        Emprestimo emp = emprestimos.get(cpfFiador);
        if (emp != null)
          emp.pagar(valor);         
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
