
package source.pkg01;

import java.util.ArrayList;


public class Emprestimo {
    private String nomeFiador;
    private Cpf cpfFiador = new Cpf("");
    private double valor;
    private double valorPago;
    private ListaPagamentos pagamentos = new ListaPagamentos();

    public Cpf getCpfFiador() {
        return cpfFiador;
    }

    public void setCpfFiador(Cpf cpfFiador) {
        this.cpfFiador = cpfFiador;
    }

    public void addPagamento(Pagamento pag){
        pagamentos.add(pag);
    }
   
   
    
    public String getNomeFiador() {
        return nomeFiador;
    }

    public void setNomeFiador(String nomeFiador) {
        this.nomeFiador = nomeFiador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorPago() {
        return valorPago;
    }
    
    private void pagar(double valor){
        if (valor < 0)
            throw new IllegalArgumentException("O pagamento não pode ser negativo");
        
        if (valorPago < valor)
            valorPago += valor;
    }
    
    
    public double getDebito(){
        return  this.valor - this.valorPago;
    }
    
    
      
}
