package TipoDeVooNacional;

import Interfaces.CalculoFactory;
import Interfaces.TaxaDeBagagem;
import Interfaces.TaxaDeEmbarque;

public class VooNacionalCalculoFactory implements CalculoFactory {
    @Override
    public TaxaDeBagagem criarTaxaDeBagagem() {
        return new VooNacionalTaxaDeBagagem();
    }

    @Override
    public TaxaDeEmbarque criarTaxaDeEmbarque() {
        return new VooNacionalTaxaDeEmbarque();
    }
}
