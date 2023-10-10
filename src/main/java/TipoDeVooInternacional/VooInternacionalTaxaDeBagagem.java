package TipoDeVooInternacional;

import Interfaces.TaxaDeBagagem;

public class VooInternacionalTaxaDeBagagem implements TaxaDeBagagem {
    @Override
    public double getBagagem() {
        return 0.05;
    }
}
