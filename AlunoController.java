package controller;

import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {
        //criando as 6 instancias e imprimindo com tostring
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(3, 33333333, "João", "Silva", "joãosilva@gmail.com");
        Aluno aluno4 = new Aluno(4, 44444444, "Maria", "Joaquina", "mariajoaquina123@gmail.com");
        Aluno aluno5 = new Aluno(5,55555555);
        Aluno aluno6 = new Aluno(6,66666666);
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
        System.out.println(aluno6);

        //modificando os estados das duas instancias criadas com construtor padrao atraves dos setters e imprimindo com getter
        aluno1.setId(1);
        aluno1.setCpf(11111111);
        aluno1.setNome("Mario");
        aluno1.setSobrenome("Balotelli");
        aluno1.setEmail("mariozinhoblli@hotmail.com");

        aluno2.setId(2);
        aluno2.setCpf(22222222);
        aluno2.setNome("Enner");
        aluno2.setSobrenome("Valencia");
        aluno2.setEmail("ennergoatzinho@gmail.com");

        System.out.println();
        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());
        System.out.println();
        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());

        //criacao da list e adicionando todos objetos e realizando o que foi proposto sobre list
        List<Aluno> alunoList = new ArrayList<>();
        alunoList.add(aluno1);
        alunoList.add(aluno2);
        alunoList.add(aluno3);
        alunoList.add(aluno4);
        alunoList.add(aluno5);
        alunoList.add(aluno6);
        alunoList.sort(Comparator.comparing(Aluno::getId));
        System.out.println();
        System.out.println("Lista ordenada crescente");
        System.out.println(alunoList);

        Aluno alunoFind = alunoList.stream().filter(a -> a.getId().equals(5)).findAny().orElse(null);
        System.out.println();
        System.out.print("Localizando id 5");
        System.out.println(alunoFind);

        alunoList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println();
        System.out.println("Lista ordenada descrescente");
        System.out.println(alunoList);

        //criacao de colecao por map
        Map<Integer, Aluno> alunoMap = new HashMap<>();
        alunoMap.put(aluno1.getId(), aluno1);
        alunoMap.put(aluno2.getId(), aluno2);
        alunoMap.put(aluno3.getId(), aluno3);
        alunoMap.put(aluno4.getId(), aluno4);
        alunoMap.put(aluno5.getId(), aluno5);
        alunoMap.put(aluno6.getId(), aluno6);
        System.out.println();
        System.out.println("Imprimindo a colecao por map");
        System.out.println(alunoMap);

        System.out.println();
        System.out.print("Localizando atraves do id 5 por map");
        System.out.println(alunoMap.get(5));

    }

}
