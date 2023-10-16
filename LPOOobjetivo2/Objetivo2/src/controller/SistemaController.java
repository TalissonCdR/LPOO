package controller;

import model.Associado;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SistemaController {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(1000.00, 20, 30.00);
        ContaCorrente cc2 = new ContaCorrente(1500.00, 45, 30.00);
        ContaCorrente cc3 = new ContaCorrente(1800.00, 50, 30.00);
        System.out.println("\nConta Corrente:");
        System.out.println(cc1 +"  " + cc2 + cc3);

        ContaPoupanca cp1 = new ContaPoupanca(2000.00);
        ContaPoupanca cp2 = new ContaPoupanca(2800.00);
        ContaPoupanca cp3 = new ContaPoupanca(3000.00);
        System.out.println("\nConta Poupanca:");
        System.out.println(cp1 +"  " + cp2 + cp3);

        Cliente c1 = new Cliente("Antonio", 180, 30.00);
        Cliente c2 = new Cliente("Roberta", 150, 30.00);
        Cliente c3 = new Cliente("Joana", 100, 30.00);
        System.out.println("\nCliente:");
        System.out.println(c1 +"  " + c2 + c3);

        System.out.println("\nCriação das coleções: ");
        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        System.out.println("\nColeção de Contas: " + contas);

        List<Associado> associados = new ArrayList<>();
        associados.add(c1);
        associados.add(c2);
        associados.add(c3);
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);
        System.out.println("\nColeção de Associados: " + associados);

        System.out.println("\nMovimentação conta poupança");
        cp1.deposita(1000.00);
        System.out.println(cp1);
        cp1.atualiza(5);
        System.out.println(cp1);
        cp1.saca(50);
        System.out.println(cp1);

        System.out.println("\nMovimentação conta corrente");
        cc1.deposita(500);
        System.out.println(cc1);
        cc1.saca(400);
        System.out.println(cc1);

        c1.setQdeCotas(100);
        c2.setQdeCotas(400);
        c3.setQdeCotas(600);
        cc1.setQdeCotas(300);
        cc2.setQdeCotas(600);
        cc3.setQdeCotas(600);
        System.out.println("\nAssociados com novas cotas: " + associados);

        System.out.println("\nAssociados em ordem decrescente pelo numero de cotas e também os associados com maior numero de cotas: ");
        associados.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
        System.out.println("Todos Associados em ordem decrescente: " + associados);
        Associado assCota = Collections.max(associados, Comparator.comparing(Associado::getQdeCotas));
        associados.forEach(ass->{
            if (ass.getQdeCotas() >= assCota.getQdeCotas()){
                System.out.print(ass);
            }
        });

        System.out.println("\nQuestão g");
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("Contas ordenadas por ordem decrescente: " + contas);
        Conta maiorSaldo = Collections.max(contas, Comparator.comparing(Conta::getSaldo));
        contas.forEach(con->{
            if (con.getSaldo() >= maiorSaldo.getSaldo()){
                System.out.print(con);
            }
        });
    }
}
