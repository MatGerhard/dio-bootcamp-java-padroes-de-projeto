package dio.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.CEPApi;

public class Facade {

    public void migrateClient(String nome, String cep) {
        String estado = CEPApi.getInstance().resetState(cep);
        String cidade = CEPApi.getInstance().resetCity(cep);

        CrmService.saveClient(nome, cep, estado, cidade);
    }
}
