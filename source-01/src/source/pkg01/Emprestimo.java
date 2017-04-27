
package source.pkg01;

import java.util.ArrayList;
import java.util.Date;


public class Emprestimo {
    private String nomeFiador;
    private Cpf cpfFiador = new Cpf();
    private double valor;

    private ListaPagamentos pagamentos = new ListaPagamentos();

   
    

    public String getCpfFiador() {
        return cpfFiador.getValor();
    }

    public void setCpfFiador(Cpf cpfFiador) {
        this.cpfFiador = cpfFiador;
    }

    public void addPagamento(Pagamento pag){ 
        pag.documentoEhValido();   
        pagamentos.registrarPagamento(pag);
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

    public double getDebito(){
        return  this.valor - pagamentos.getValorPago();
    }
    
    
    public double getValorPago(){
        return pagamentos.getValorPago();
    }
    
    
    
      
}
