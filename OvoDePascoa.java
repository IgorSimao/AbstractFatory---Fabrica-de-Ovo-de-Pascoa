
public abstract class OvoDePascoa {
    protected String nome;
    protected int peso;
    protected String descricao;
    protected float preco;
    protected String imagem;



    public OvoDePascoa(String nome, int peso, String descricao, float preco, String imagem) {
        this.nome = nome;
        this.peso = peso;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return this.imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }


    public abstract void exibirInformacoes();

}
