package Facade;

import Facade.SubSistema1crm.CrmService;
import Facade.SubSistema2crm.CepApi;

public class Facade 
{
    public void migrarCliente (String nome,String cep)
    {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);


        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
    
}
