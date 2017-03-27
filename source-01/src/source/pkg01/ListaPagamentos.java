package source.pkg01;

import java.util.ArrayList;


public class ListaPagamentos extends ArrayList<Pagamento>{
     
    
    public ArrayList<Pagamento> pagamentosDe(String cpfPagador){
        ArrayList<Pagamento> listaFiltrada = new ArrayList<Pagamento>();
        for (Pagamento pag: this){
            if (pag.getCpfPagador().equals(cpfPagador))
                listaFiltrada.add(pag);
        }
        
        return listaFiltrada;
    }
    
    public ArrayList<Pagamento> pagamentosMaioresQue(double valor){
        ArrayList<Pagamento> listaFiltrada = new ArrayList<Pagamento>();
        for (Pagamento pag: this){
            if (pag.getValor() > valor)
                listaFiltrada.add(pag);
        }
        
        return listaFiltrada;
    }
    
    public ArrayList<Pagamento> pagamentosMenoresQue(double valor){
        ArrayList<Pagamento> listaFiltrada = new ArrayList<Pagamento>();
        for (Pagamento pag: this){
            if (pag.getValor() < valor)
                listaFiltrada.add(pag);
        }
        
        return listaFiltrada;
    }
    
    public void registrarPagamento(Pagamento pag){
        this.add(pag);
    }
    
    
    public double getValorPago(){
        //code percorrer a lista e somar todos os pagmaentos
        return 0;
    }
}
