package br.com.etechas.models;

public class Dvd extends Produto
{
    private String diretor;
    private String duracao;
    private String censura;

    //metodo get

    public String getDiretor() {
        return diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getCensura() {
        return censura;
    }


    // metodo set


    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }

    public void listarproduto()
    {
        System.out.println(
                "Nome: " + getDescricao() +
                        ", Gênero: " + getGenero() +
                        ", Estoque: " + getEstoqueDisponivel() +
                        ", Preço de Custo: R$ " + getPrecoCusto() +
                        ", Preço de Venda: R$ " + getPrecoVenda()  +
                        ", Diretor: " + diretor +
                        ", Duração: " + duracao + "Horas,"+
                        ", Classificação: " + censura
        );

    }

    public void calcularPrecoVenda(double cotacaoDolar)
    {
        double venda = getPrecoCusto()*cotacaoDolar;
        setPrecoVenda(venda);

    }
}
