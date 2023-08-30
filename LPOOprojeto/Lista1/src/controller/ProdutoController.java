package controller;

import model.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto(2, "Arroz", "Arroz parboilizado", 10.00, 150);
        System.out.println(produto1);
        System.out.println(produto2);

        produto1.setId(1);
        produto1.setNome("Feijão");
        produto1.setDescricao("Feijão sem agrotóxicos pesados");
        produto1.setValor(15.25);
        produto1.setEstoque(200);
        produto2.setNome("Ervilha");
        produto2.setDescricao("Ervilhas frescas sem agrotóxicos");
        produto2.setValor(5.99);
        produto2.setEstoque(1000);

        System.out.println();
        System.out.println(produto1.getId());
        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());
        System.out.println();
        System.out.println(produto2.getId());
        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        Produto produto3 = new Produto(3, "Chuveiro Lorenzetti", "Chuveiro elétrico lorenzetti", 150.95, 500);
        Produto produto4 = new Produto(4, "Vinho Sangue de Boi", "Vinho Sangue de Boi o mais consumido do Brasil", 14.45, 250);
        Produto produto5 = new Produto(4, "Vinho Sangue de Boi", "Vinho Sangue de Boi o mais consumido do Brasil", 14.45, 250);

        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);
        produtoList.add(produto4);
        produtoList.add(produto5);
        System.out.println();
        System.out.println(produtoList);

        Produto produtoFind = produtoList.stream().filter(a -> a.getId() == 3).findAny().orElse(null);
        System.out.println();
        System.out.println(produtoFind);

        produtoList.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println();
        System.out.println(produtoList);

        Map<Integer, Produto> produtoMap = new HashMap<>();
        produtoMap.put(produto1.getId(), produto1);
        produtoMap.put(produto2.getId(), produto2);
        produtoMap.put(produto3.getId(), produto3);
        produtoMap.put(produto4.getId(), produto4);
        produtoMap.put(produto5.getId(), produto5);
        System.out.println();
        System.out.println(produtoMap);

        System.out.println();
        System.out.println(produtoMap.get(3));
    }
}
