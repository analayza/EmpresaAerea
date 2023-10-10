import Interfaces.CalculoFactory;
import Interfaces.TaxaDeBagagem;
import Interfaces.TaxaDeEmbarque;

import lombok.Data;

@Data
public class TipoDeVoo {
    private double Valor;
    private TaxaDeEmbarque TaxaDeEmbarque;
    private TaxaDeBagagem TaxaDeBagagem;

    public TipoDeVoo(double valor, CalculoFactory calculoFactory) {
        Valor = valor;
        TaxaDeEmbarque = calculoFactory.criarTaxaDeEmbarque();
        TaxaDeBagagem = calculoFactory.criarTaxaDeBagagem();
    }

    public double TaxaDeEmbarque(){
        return this.Valor * this.TaxaDeEmbarque.getEmbarque();
    }

    public double TaxadeBagagem(){
        return  this.Valor * this.getTaxaDeBagagem().getBagagem();
    }
}
