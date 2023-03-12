public class FacbricaNestle implements IFabricaOvoDePascoa{

    @Override
    public OvoDePascoa criarOvoDePascoa(String tipo) {
        if(tipo == "Alpino" || tipo == "alpino"){
            new Alpino("Alpino", 337, "Ovo de chocolate com recheio sabor trufado de amêndoas", 49.90f, "https://www.nestle.com.br/site/ovos/alpino.png");
        }else if(tipo == "Classic" || tipo == "classic"){
            new Classic("Classic", 185, "Ovo de chocolate ao leite", 23.90f, "https://www.nestle.com.br/site/ovos/classic.png");
        }else if(tipo == "KitKat" || tipo == "kitkat"){
            new KitKat("Kit Kat", 227, "Ovo de chocolate ao leite com Kit Kat", 34.90f, "https://www.nestle.com.br/site/ovos/kitkat.png");
        }
        return null;   
    }
    
}
