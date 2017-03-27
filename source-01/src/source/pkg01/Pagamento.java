
package source.pkg01;

import java.util.Date;


public class Pagamento {
    private Cpf cpfPagador = new Cpf("");
    private Date data;
    private double valor;

    public Cpf getCpfPagador() {
        return cpfPagador;
    }

    public void setCpfPagador(Cpf cpfPagador) {
        this.cpfPagador = cpfPagador;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
