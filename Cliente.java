public class Cliente {
    public static void main(String[] args) {
        
        IFabricaOvoDePascoa nestle = new FacbricaNestle();
        nestle.criarOvoDePascoa("alpino");

        OvoDePascoa alpino = new Alpino("Alpino", 337, "Ovo de chocolate com recheio sabor trufado de amêndoas", 49.90f, "https://www.nestle.com.br/site/ovos/alpino.png");
        alpino.exibirInformacoes();

    }
}
