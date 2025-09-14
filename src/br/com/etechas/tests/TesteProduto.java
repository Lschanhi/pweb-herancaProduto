package br.com.etechas.tests;

import br.com.etechas.models.Cd;
import br.com.etechas.models.Dvd;
import br.com.etechas.models.Livro;
import br.com.etechas.models.Produto;

import java.util.SortedMap;

public class TesteProduto
{
    public static void main(String[] args)
    {
        Produto produto1 = new Produto();
        produto1.setDescricao("Joias");
        produto1.setGenero("Roupas");
        produto1.setPrecoCusto(50);

        produto1.comprar(5);
        produto1.calcularPrecoVenda();
        System.out.println("------------------------Produto Geral--------------------------------");
        System.out.println("Estoque " + produto1.getEstoqueDisponivel());
        System.out.println("Preço de Venda R$ " + produto1.getPrecoVenda());

        produto1.vender(2);


        Livro livro1 = new Livro();
        livro1.setDescricao("Hobbit");
        livro1.setGenero("Fantasia/ Aventura");
        livro1.setPrecoCusto(200);
        livro1.setAutor("Tolkien");
        livro1.setEditora("Universal");
        livro1.setEdicao("1");

        livro1.comprar(6);
        System.out.println("------------------Livro---------------------------------------------");
        livro1.calcularPrecoVenda();
        livro1.listarProduto();

        System.out.println("Estoque "+ livro1.getEstoqueDisponivel());
        System.out.println("Preço de Venda R$ " + livro1.getPrecoVenda());
        livro1.vender(3);

        Cd cd = new Cd();
        cd.setDescricao("ThunderBolt");
        cd.setGenero("Rock");
        cd.setPrecoCusto(50);
        cd.setArtista("AC/DC");
        cd.setGravadora("EtecHAS");
        cd.setPaisOrigem("Brasil");

// adicionar estoque
        cd.comprar(8);  // estoque = 8

// calcular preço
        cd.calcularPrecoVenda(); // precoVenda = 57.5

// vender 3 unidades
        System.out.println("------------------------------------");
        cd.listarProduto();
        cd.vender(3);
        System.out.println("Estoque restante: " + cd.getEstoqueDisponivel());


        Dvd dvd1 = new Dvd();
        dvd1.setDescricao("Senhor dos Aneis");
        dvd1.setGenero("Aventura");
        dvd1.setPrecoCusto(30);
        dvd1.setDiretor("Peter Jackson");
        dvd1.setDuracao("3:20");
        dvd1.setCensura("16 Anos");

        dvd1.comprar(10);

        System.out.println("------------------------------------");
        dvd1.calcularPrecoVenda(6);
        dvd1.listarproduto();
        dvd1.vender(5);
        System.out.println("Estoque Atualizado apos a Venda " + dvd1.getEstoqueDisponivel());


    }
}
