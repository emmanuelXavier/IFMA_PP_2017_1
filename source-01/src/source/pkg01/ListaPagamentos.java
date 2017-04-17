package source.pkg01;

import java.util.ArrayList;
import java.util.List;


public class ListaPagamentos {
        
    private List<Pagamento> pagamentos = new ArrayList<Pagamento>();
    
    
    public ArrayList<Pagamento> pagamentosMaioresQue(double valor){
        ArrayList<Pagamento> listaFiltrada = new ArrayList<Pagamento>();
        for (Pagamento pag: pagamentos){
            if (pag.getValor() > valor)
                listaFiltrada.add(pag);
        }
        
        return listaFiltrada;
    }
    
    public ArrayList<Pagamento> pagamentosMenoresQue(double valor){
        ArrayList<Pagamento> listaFiltrada = new ArrayList<Pagamento>();
        for (Pagamento pag: pagamentos){
            if (pag.getValor() < valor)
                listaFiltrada.add(pag);
        }
        
        return listaFiltrada;
    }
    
    public void registrarPagamento(Pagamento pag){
        pagamentos.add(pag);
    }
    
    
    public void removerPagamento(Pagamento pag){
        pagamentos.remove(pag);
    }
    
    
    public double getValorPago(){
        double valorPago = 0;
        for (Pagamento pag : pagamentos)
            valorPago += pag.getValor();
        
        return valorPago;
    }
}
