package subsystem2.cep;

import dio.gof.singleton.EagerSingleton;

public class CEPApi {

    private static CEPApi instance = new CEPApi();

    private CEPApi() {
        super();
    }

    public static CEPApi getInstance() {
        return instance;
    }

    public String resetCity(String cep) {
        return "São Paulo";
    }

    public String resetState(String cep) {
        return "SP";
    }
}
