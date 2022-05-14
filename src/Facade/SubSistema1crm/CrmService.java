package Facade.SubSistema1crm;

public class CrmService 
{

    
    private CrmService() 
    {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado)
    {
       System.out.println("Cliente salvo no sistema de crm!!");
       System.out.println(nome);
       System.out.println(cep);
       System.out.println(estado);
       System.out.println(cidade);
    }
    
}
