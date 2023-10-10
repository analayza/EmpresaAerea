package TipoDeVooInternacional;

import Interfaces.CalculoFactory;
import Interfaces.TaxaDeBagagem;
import Interfaces.TaxaDeEmbarque;

public class VooInternacionalCalculoFactory implements CalculoFactory {
    @Override
    public TaxaDeBagagem criarTaxaDeBagagem() {
        return new VooInternacionalTaxaDeBagagem();
    }

    @Override
    public TaxaDeEmbarque criarTaxaDeEmbarque() {
        return new VooInternacionalTaxaDeEmbarque();
    }
}
