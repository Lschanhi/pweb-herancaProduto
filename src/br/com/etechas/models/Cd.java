package br.com.etechas.models;

public class Cd  extends Produto
{
    private String artista;
    private String gravadora;
    private String paisOrigem;

    // metodo get

    public String getArtista() {
        return artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }


    //metodo set


    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public void listarProduto()
    {
        System.out.println(
                "Nome: " + getDescricao() +
                        ", Gênero: " + getGenero() +
                        ", Estoque: " + getEstoqueDisponivel() +
                        ", Preço de Custo: R$ " + getPrecoCusto() +
                        ", Preço de Venda: R$ " + getPrecoVenda() +
                        ", Artista: " + artista +
                        ", Gravadora: " + gravadora +
                        ", País: " + paisOrigem
        );
    }

    @Override
    public void calcularPrecoVenda()
    {
        double venda = getPrecoCusto() + (getPrecoCusto()*0.15);
        setPrecoVenda(venda);
    }


}
