package TipoDeVooInternacional;

import Interfaces.TaxaDeEmbarque;

public class VooInternacionalTaxaDeEmbarque implements TaxaDeEmbarque {
    @Override
    public double getEmbarque() {
        return 0.1;
    }
}
