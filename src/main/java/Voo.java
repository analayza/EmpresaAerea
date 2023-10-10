import Interfaces.CalculoFactory;

public class Voo {
    public  TipoDeVoo gerarVoo(double Valor, CalculoFactory calculofactory){
        var TipoDeVoo = new TipoDeVoo(Valor, calculofactory);
        System.out.println("Valor da Passagem: " + Valor);
        System.out.println("Valor da Bagagem: "  + TipoDeVoo.TaxadeBagagem());
        System.out.println("Valor do Embarque: " + TipoDeVoo.TaxaDeEmbarque());
        return null;
    }
}
