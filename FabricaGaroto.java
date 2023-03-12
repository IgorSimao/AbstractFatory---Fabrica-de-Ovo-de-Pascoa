public class FabricaGaroto implements IFabricaOvoDePascoa{

    @Override
    public OvoDePascoa criarOvoDePascoa(String tipo) {
        if(tipo == "Talento" || tipo == "talento"){
            new Talento("Talento", 337, "Ovo de chocolate com recheio sabor trufado de amêndoas", 49.90f, "https://www.garoto.com.br/site/ovos/talento.png");
        }else if(tipo == "Crocante" || tipo == "crocante" ){
            new Crocante("Crocante", 350, "Ovo de chocolate com recheio sabor trufado de amêndoas", 60.90f, "https://www.garoto.com.br/site/ovos/crocante.png");
        }else if(tipo == "Baton" || tipo == "baton" ){
            new Baton("Baton", 350, "Ovo de chocolate com recheio sabor trufado de amêndoas", 55.90f, "https://www.garoto.com.br/site/ovos/baton.png");
        }
        return null;
    }
    
}
