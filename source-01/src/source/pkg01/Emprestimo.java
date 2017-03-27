
package source.pkg01;


public class Emprestimo {
    private String nomeFiador;
    private String cpfFiador;
    private double valor;
    private double valorPago;

    public String getNomeFiador() {
        return nomeFiador;
    }

    public void setNomeFiador(String nomeFiador) {
        this.nomeFiador = nomeFiador;
    }

    public String getCpfFiador() {
        return cpfFiador;
    }

    public void setCpfFiador(String cpfFiador) {
        this.cpfFiador = cpfFiador;
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
    
    public void pagar(double valor){
        if (valor < 0)
            throw new IllegalArgumentException("O pagamento não pode ser negativo");
        
        if (valorPago < valor)
            valorPago += valor;
    }
    
    
    public double getDebito(){
        return  this.valor - this.valorPago;
    }
    
    
    
}
