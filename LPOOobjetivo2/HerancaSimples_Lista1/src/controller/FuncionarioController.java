package controller;

import model.Desenvolvedor;
import model.DesenvolvedorJunior;
import model.DesenvolvedorPleno;
import model.DesenvolvedorSenior;
import model.Funcionario;
import model.Gerente;
import model.GerenteDesenvolvimento;
import model.GerenteGeral;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

// Acabei fazendo diretamente a questão 2 por abordar mais diretamente//
//As respostas da questão 1 seriam que não da pra criar as instancias porque a classe Funcionario é abstrata. Na questão 2 devem ser inseridas nas classes Gerente e Desenvolvedor pois é onde o problema está sendo modelado, fora que no controller é preferivel evitar de  colocar regras como estas.//
public class FuncionarioController {

    public static void main(String[] args) {

        Gerente g1 = new GerenteGeral("Roberto", 6500.00);
        Gerente g2 = new GerenteDesenvolvimento("Tamires", 4500.00);

        Desenvolvedor d1 = new DesenvolvedorSenior("Claudio", 3500.00);
        Desenvolvedor d2 = new DesenvolvedorSenior("Arnaldo", 3500.00);
        Desenvolvedor d3 = new DesenvolvedorSenior("Paola", 3500.00);
        Desenvolvedor d4 = new DesenvolvedorSenior("José", 3500.00);
        Desenvolvedor d5 = new DesenvolvedorSenior("Fernanda", 3500.00);
        Desenvolvedor d6 = new DesenvolvedorSenior("Marcia", 3500.00);
        Desenvolvedor d7 = new DesenvolvedorPleno("Jeniffer", 2500.00);
        Desenvolvedor d8 = new DesenvolvedorPleno("Astolfo", 2500.00);
        Desenvolvedor d9 = new DesenvolvedorPleno("Levi", 2500.00);
        Desenvolvedor d10 = new DesenvolvedorPleno("Emily", 2500.00);
        Desenvolvedor d11 = new DesenvolvedorPleno("Jorge", 2500.00);
        Desenvolvedor d12 = new DesenvolvedorPleno("Marcelo", 2500.00);
        Desenvolvedor d13 = new DesenvolvedorJunior("Breno", 1800.00);
        Desenvolvedor d14 = new DesenvolvedorJunior("Bruna", 1800.00);
        Desenvolvedor d15 = new DesenvolvedorJunior("Gilberto", 1800.00);
        Desenvolvedor d16 = new DesenvolvedorJunior("Ronaldo", 1800.00);
        Desenvolvedor d17 = new DesenvolvedorJunior("Valeria", 1800.00);
        Desenvolvedor d18 = new DesenvolvedorJunior("Catarina", 1800.00);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(d1);
        funcionarios.add(d2);
        funcionarios.add(d3);
        funcionarios.add(d4);
        funcionarios.add(d5);
        funcionarios.add(d6);
        funcionarios.add(d7);
        funcionarios.add(d8);
        funcionarios.add(d9);
        funcionarios.add(d10);
        funcionarios.add(d11);
        funcionarios.add(d12);
        funcionarios.add(d13);
        funcionarios.add(d14);
        funcionarios.add(d15);
        funcionarios.add(d16);
        funcionarios.add(d17);
        funcionarios.add(d18);


        double totalBonus = 0.0;
        for (Funcionario funcionario : funcionarios) {
            totalBonus += funcionario.getSalario() + funcionario.getBonus();
        }
            System.out.println("\nTotal da Folha Salarial com bonus:");
            System.out.println(NumberFormat.getCurrencyInstance().format(totalBonus));

        double total_sem_Bonus = 0.0;
        for (Funcionario funcionario : funcionarios) {
            total_sem_Bonus += funcionario.getSalario();
        }
            System.out.println("\nTotal da Folha Salarial sem bonus:");
            System.out.println(NumberFormat.getCurrencyInstance().format(total_sem_Bonus));

        System.out.println("\n*****************************");
        System.out.println("Cada funcionario com seu cargo, salario bonus e salario bruto");
            funcionarios.forEach(f->{double salBruto= f.getSalario() + f.getBonus();
          System.out.println("\nFuncionario:" + f.getNome());
          System.out.println("Cargo: " + f.getClass().getSimpleName());
          System.out.println("Salario: " + NumberFormat.getCurrencyInstance().format(f.getSalario()));
          System.out.println("Bonus: " + NumberFormat.getCurrencyInstance().format(f.getBonus()));
          System.out.println("Salario Bruto: " + NumberFormat.getCurrencyInstance().format(salBruto));

      });

            double folhaBonus = 0.0;
            for (Funcionario funcionario : funcionarios){
                funcionario.setSalario(funcionario.getSalario() + (funcionario.getSalario() * 0.05));
                folhaBonus += funcionario.getSalario() + funcionario.getBonus();
            }
        System.out.println("\nTotal da folha com reajuste:");
        System.out.println(NumberFormat.getCurrencyInstance().format(folhaBonus));

    }
}