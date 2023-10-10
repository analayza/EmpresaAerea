package TipoDeVooNacional;

import Interfaces.TaxaDeEmbarque;

public class VooNacionalTaxaDeEmbarque implements TaxaDeEmbarque {
    @Override
    public double getEmbarque() {
        return 0.05;
    }
}
