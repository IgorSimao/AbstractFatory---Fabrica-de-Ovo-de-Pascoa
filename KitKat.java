
public class KitKat extends OvoDePascoa{


    public KitKat(String nome, int peso, String descricao, float preco, String imagem){
        super(nome, peso, descricao, preco, imagem);
    }


    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Peso: " + super.getPeso());
        System.out.println("Descricao: " + super.getDescricao());
        System.out.println("Preco: " + super.getPreco());
        System.out.println("Imagem: " + super.getImagem());
    }

}
