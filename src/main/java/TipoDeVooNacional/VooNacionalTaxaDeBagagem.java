package TipoDeVooNacional;

import Interfaces.TaxaDeBagagem;

public class VooNacionalTaxaDeBagagem implements TaxaDeBagagem {
    @Override
    public double getBagagem() {
        return 0.03;
    }
}
