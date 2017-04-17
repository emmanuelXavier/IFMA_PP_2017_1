
package source.pkg01;

import java.util.Date;


public class Pagamento {
    private Documento doc;
    private Date data;
    private double valor;

    public Documento getDoc() {
        return doc;
    }

    public void setDocumento(Documento doc) {
        this.doc = doc ;
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
    
    
    public boolean documentoEhValido(){
        return this.doc.validar();
    }
    
    
}
