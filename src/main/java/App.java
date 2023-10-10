import TipoDeVooInternacional.VooInternacionalCalculoFactory;
import TipoDeVooNacional.VooNacionalCalculoFactory;

public class App {
    public static void main(String[] args) {
        var Voo = new Voo();
        System.out.println("-------------Nacional--------------");
        Voo.gerarVoo(1000,new VooNacionalCalculoFactory());


        System.out.println("-------------Internacional--------------");
        Voo.gerarVoo(2000, new VooInternacionalCalculoFactory());
    }
}
