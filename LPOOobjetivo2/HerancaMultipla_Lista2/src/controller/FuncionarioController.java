package controller;

import model.Cliente;
import model.Desenvolvedor;
import model.Funcionario;
import model.Gerente;
import model.Investidor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {

        Desenvolvedor d1 = new Desenvolvedor("Marcio", 2000.00);
        Desenvolvedor d2 = new Desenvolvedor("Rafaela", 2000.00);
        Desenvolvedor d3 = new Desenvolvedor("Jonas", 2000.00);
        Desenvolvedor d4 = new Desenvolvedor("Ruan", 2000.00);
        Desenvolvedor d5 = new Desenvolvedor("Felipe", 2000.00);
        Desenvolvedor d6 = new Desenvolvedor("Valentina", 2000.00);
        System.out.println("\nDesenvolvedores:");
        System.out.println(d1 +"  " + d2 + d3 + d4 + d5 + d6);

        Gerente g1 = new Gerente("Ricardo", 3800.00, "TAUS10", 300);
        Gerente g2 = new Gerente("Manoela", 4000.00, "TAUS10", 500);
        Gerente g3 = new Gerente("João", 4500.00, "TAUS10", 1200);
        Gerente g4 = new Gerente("Joana", 3400.00, "TAUS10", 450);
        Gerente g5 = new Gerente("Elisa", 7000.00, "TAUS10", 2000);
        Gerente g6 = new Gerente("Marcos", 5200.00, "TAUS10", 1500);
        System.out.println("\nGerentes:");
        System.out.println(g1 + "  " + g2 + g3 + g4 + g5 + g6);

        Cliente c1 = new Cliente("Lucas", "Miranda", "TAUS10", 800);
        Cliente c2 = new Cliente("Jonathan", "Santos", "TAUS10", 950);
        Cliente c3 = new Cliente("Luana", "Mendonça", "TAUS10", 1500);
        Cliente c4 = new Cliente("Joilson", "Menezes", "TAUS10", 2500);
        Cliente c5 = new Cliente("Marcela", "Fagundes", "TAUS10", 1200);
        Cliente c6 = new Cliente("Cleber", "Pereira", "TAUS10", 450);
        System.out.println("\nClientes:");
        System.out.println(c1 + "  " + c2 + c3 + c4 + c5 + c6);


        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(g3);
        funcionarios.add(g4);
        funcionarios.add(g5);
        funcionarios.add(g6);
        funcionarios.add(d1);
        funcionarios.add(d2);
        funcionarios.add(d3);
        funcionarios.add(d4);
        funcionarios.add(d5);
        funcionarios.add(d6);
        System.out.println("\nColeção de Funcionarios: " + funcionarios);

        List<Investidor> investidores = new ArrayList<>();
        investidores.add(g1);
        investidores.add(g2);
        investidores.add(g3);
        investidores.add(g4);
        investidores.add(g5);
        investidores.add(g6);
        investidores.add(c1);
        investidores.add(c2);
        investidores.add(c3);
        investidores.add(c4);
        investidores.add(c5);
        investidores.add(c6);
        System.out.println("\nColeção de Investidores: " + investidores);

        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println("\nFuncionarios da empresa: " + funcionarios);


        System.out.println("\nClientes da empresa: ");
        investidores.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        investidores.forEach(in ->{
            if (in instanceof Cliente){
                System.out.print(in);
            }
        });

        System.out.println("\n\nInvestidores da empresa: " + investidores);

        System.out.println("\nFuncionario com maior salario: ");
        Funcionario funMaiorSal = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
        funcionarios.forEach(fun -> {
            if(fun.getSalario() >= funMaiorSal.getSalario()){
                System.out.print(fun);
            }
        });

        System.out.println("\n\nInvestidor com maior quantidade: ");
        Investidor invQuantidade = Collections.max(investidores, Comparator.comparing(Investidor::getQuantidade));
        investidores.forEach(inv->{
            if(inv.getQuantidade() >= invQuantidade.getQuantidade()){
                System.out.print(inv);
            }
        });
    }
}
