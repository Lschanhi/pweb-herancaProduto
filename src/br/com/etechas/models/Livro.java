package br.com.etechas.models;

public class Livro extends Produto
{
    private String autor;
    private String editora;
    private String edicao;

    // metodo get

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getEdicao() {
        return edicao;
    }


    //metodo set


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public void listarProduto()
    {
        System.out.println(
                "Nome: " + getDescricao() +
                        ", Gênero: " + getGenero() +
                        ", Estoque: " + getEstoqueDisponivel() +
                        ", Preço de Custo: R$ " + getPrecoCusto() +
                        ", Preço de Venda: R$ " + getPrecoVenda() +
                        ", Autor: " + autor +
                        ", Editora: " + editora +
                        ", Edição: " + edicao
        );
    }
}
