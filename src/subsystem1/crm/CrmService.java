package subsystem1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(String nome, String cep, String estado, String cidade) {
        System.out.println("Cliente salvo no sistema de CRM:");
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
    }
}
