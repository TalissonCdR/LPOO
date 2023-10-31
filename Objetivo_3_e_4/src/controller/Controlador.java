package controller;

import exceptions.EstoqueInsuficienteException;
import model.*;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Controlador {

    private static void myThrowException() {
        try {
            throw new EstoqueInsuficienteException("Erro, estoque insuficiente.\n");
        } catch (EstoqueInsuficienteException e) {
            e.printStackTrace();
        } finally {
            System.err.println("Finally executado em myThrowException()");
        }
    }

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(274582, "Manoel", "Rua dos Namorados", "Saudade", "79875-758", "Cabo Frio", "RJ", "Guanabara");
        Vendedor v2 = new Vendedor(27483, "Jandira", "Rua Alegria", "Tamoios", "28925-826", "Cabo Frio", "RJ", "Guanabara");

        Fornecedor f1 = new Fornecedor(77777777, "(021)977777777", "Distribuidora Valinhos");

        Produto p1 = new Produto(1422, "Leite Santa Clara", 120, 2.50, f1);
        Produto p2 = new Produto(27892, "Iogurte Batavo", 80, 3.75, f1);

        Item i1 = new Item(1422, 0.75, 10, p1);
        Item i2 = new Item(27892, 1.50, 5, p2);


        if(p1.getQuantidade() >= i1.getQuantidade() && p2.getQuantidade() >= i2.getQuantidade()){

            Pedido pedido1 = new Pedido(1, LocalDateTime.of(2023, 10, 25, 9, 30), i1.getQuantidade() * p1.getPreco() - i1.getDesconto(), Tipo.ATENDIDO, v1, i1.getQuantidade()* p1.getPreco() - i1.getDesconto());
            Pedido pedido2 = new Pedido(2, LocalDateTime.of(2023, 10, 30, 15,45), i2.getQuantidade() * p2.getPreco() - i2.getDesconto(), Tipo.PENDENTE, v2, i2.getQuantidade() * p2.getPreco() - i2.getDesconto());


            pedido1.getItems().add(i1);
            pedido2.getItems().add(i2);

            List<Pedido> pedidoList = new ArrayList<>();
            pedidoList.add(pedido1);
            pedidoList.add(pedido2);

            System.out.println("\n Relatorio de vendas:\n");
            System.out.println(pedidoList);

            int e1, e2;
            e1 = p1.getQuantidade() - i2.getQuantidade();
            e2 = p2.getQuantidade() - i2.getQuantidade();
            System.out.println("\nEstoque após baixa");
            System.out.println("Produto:" + p1.getNome() + "\nQuantidade: " + e1);
            System.out.println("Produto:" + p2.getNome() + "\nQuantidade: " + e2);

        }else myThrowException();

        p1.setQuantidade(p1.getQuantidade() + 50);
        p2.setQuantidade(p2.getQuantidade() + 25);

        Fornecimento forne1 = new Fornecimento(LocalDateTime.of(2023,10,31, 8,00), p1.getPreco() * 50, f1, p1);
        Fornecimento forne2 = new Fornecimento(LocalDateTime.of(2023, 10, 31, 8, 30), p2.getPreco() * 25, f1, p2);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(forne1);
        fornecimentos.add(forne2);
        System.out.println("\nRelatorio fornecimentos: " + fornecimentos);
        System.out.println("Custo total dos fornecimentos: " + NumberFormat.getCurrencyInstance().format(fornecimentos.stream().mapToDouble(f-> f.getTotal()).sum()));


    }
}
