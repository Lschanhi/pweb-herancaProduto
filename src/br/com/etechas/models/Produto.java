package br.com.etechas.models;

public class Produto
{
    private String descricao;
    private String genero;
    private int estoqueDisponivel;
    private double precoCusto;
    private double precoVenda;

    // metodo get
    public String getDescricao() {
        return descricao;
    }

    public String getGenero() {
        return genero;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    // metodo Set


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void comprar(int qtde)
    {
        estoqueDisponivel += qtde;
    }

    public void vender (int qtde)
    {
        if (qtde <= estoqueDisponivel)
        {
            double valor = precoVenda * qtde;
            estoqueDisponivel -= qtde; // reduz estoque
            System.out.println("Valor da Venda é de R$ " + valor );
        } else {
            System.out.println("Estoque insuficiente para a venda!");
        }

    }

    public void calcularPrecoVenda()
    {
        precoVenda = precoCusto + (precoCusto * 0.1);

    }
}
