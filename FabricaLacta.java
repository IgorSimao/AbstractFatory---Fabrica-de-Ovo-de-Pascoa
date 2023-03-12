public class FabricaLacta implements IFabricaOvoDePascoa{



    @Override
    public OvoDePascoa criarOvoDePascoa(String tipo) {
        if(tipo == "ouro branco" || tipo == "Ouro Branco"){
            return new OutroBranco("Ouro Branco", 359, "Ovo de chocolate com recheio sabor trufado de amêndoas", 58.00f, "https://www.lacta.com.br/site/ovos/ourobranco.png");
        }else if(tipo == "Sonho de Valsa" || tipo == "sonho de valsa"){
            return new SonhoDeValsa("Sonho de Valsa", 359, "Ovo de chocolate com recheio sabor trufado de amêndoas", 58.50f, "https://www.lacta.com.br/site/ovos/sonhodevalsa.png");
        }else if(tipo == "oreo" || tipo == "Oreo"){
            return new Oreo("Oreo", 359, "Ovo de chocolate com recheio sabor trufado de amêndoas", 63.59f, "https://www.lacta.com.br/site/ovos/oreo.png");
        }

        return null;
    }
    
}
