package controller;

import model.Funcionario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario(2,"James", 1380);
        System.out.println(funcionario1);
        System.out.println(funcionario2);

        funcionario1.setId(1);
        funcionario1.setNome("Marcos");
        funcionario1.setSalario(4500);
        funcionario2.setNome("Joilson");
        funcionario2.setSalario(7500);

        System.out.println();
        System.out.println(funcionario1.getId());
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());
        System.out.println();
        System.out.println(funcionario2.getId());
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario2.getSalario());

        Funcionario funcionario3 = new Funcionario(3, "Paula", 5800);
        Funcionario funcionario4 = new Funcionario(4, "Claudete", 6500);
        Funcionario funcionario5 = new Funcionario(4, "Claudete", 6500);

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(funcionario1);
        funcionarioList.add(funcionario2);
        funcionarioList.add(funcionario3);
        funcionarioList.add(funcionario4);
        funcionarioList.add(funcionario5);
        System.out.println();
        System.out.println(funcionarioList);

        Funcionario funcionarioFind = funcionarioList.stream().filter(f -> f.getId() == 3).findAny().orElse(null);
        System.out.println();
        System.out.println(funcionarioFind);

        funcionarioList.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println();
        System.out.println(funcionarioList);

        Map<Integer, Funcionario> funcionarioMap = new HashMap<>();
        funcionarioMap.put(funcionario1.getId(), funcionario1);
        funcionarioMap.put(funcionario2.getId(), funcionario2);
        funcionarioMap.put(funcionario3.getId(), funcionario3);
        funcionarioMap.put(funcionario4.getId(), funcionario4);
        funcionarioMap.put(funcionario5.getId(), funcionario5);
        System.out.println();
        System.out.println(funcionarioMap);

        System.out.println();
        System.out.println(funcionarioMap.get(3));
    }
}
