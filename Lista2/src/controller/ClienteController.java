package controller;

import model.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteController {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente("2222", "Claudia", "Rodrigues", "Rua das Laranjeiras, 252", "92560050", "999236547", "rodriguesclaudia@hotmail.com");
        System.out.println(cliente1);
        System.out.println(cliente2);

        cliente1.setCpf("1111");
        cliente1.setNome("Ronaldo");
        cliente1.setSobrenome("Nazario");
        cliente1.setEndereco("Rua dos Sorrisos, 375");
        cliente1.setCep("98603045");
        cliente1.setTelefone("981056328");
        cliente1.setEmail("sorrisoronaldo@gmail.com");
        cliente2.setNome("Luis");
        cliente2.setSobrenome("Fabiano da Silva");
        cliente2.setEndereco("Rua dos Amores, 458");
        cliente2.setCep("98750835");
        cliente2.setTelefone("991827322");
        cliente2.setEmail("fabulosoluis@hotmail.com");

        System.out.println();
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getEndereco());
        System.out.println(cliente1.getCep());
        System.out.println(cliente1.getTelefone());
        System.out.println(cliente1.getEmail());
        System.out.println();
        System.out.println(cliente2.getCpf());
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getSobrenome());
        System.out.println(cliente2.getEndereco());
        System.out.println(cliente2.getCep());
        System.out.println(cliente2.getTelefone());
        System.out.println(cliente2.getEmail());

        Cliente cliente3 = new Cliente("3333", "Paula", "de Lurdes", "Rua Argentina, 985", "98503142", "999325687", "lurdinhap@gmail.com");
        Cliente cliente4 = new Cliente("4444", "Edson", "Arantes do Nascimento", "Rua de Santos, 1958", "9819581962", "981024785", "edsonpele@email.com");
        Cliente cliente5 = new Cliente("4444", "Edson", "Arantes do Nascimento", "Rua de Santos, 1958", "9819581962", "981024785", "edsonpele@email.com");

        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(cliente1);
        clienteList.add(cliente2);
        clienteList.add(cliente3);
        clienteList.add(cliente4);
        clienteList.add(cliente5);
        System.out.println();
        System.out.println(clienteList);

        Cliente clienteFind = clienteList.stream().filter(c-> c.getCpf().equals("3333")).findAny().orElse(null);
        System.out.println(clienteFind);

        clienteList.sort(Comparator.comparing(Cliente::getCpf).reversed());
        System.out.println();
        System.out.println(clienteList);

        Map<String, Cliente> clienteMap = new HashMap<>();
        clienteMap.put(cliente1.getCpf(), cliente1);
        clienteMap.put(cliente2.getCpf(), cliente2);
        clienteMap.put(cliente3.getCpf(), cliente3);
        clienteMap.put(cliente4.getCpf(), cliente4);
        clienteMap.put(cliente5.getCpf(), cliente5);
        System.out.println();
        System.out.println(clienteMap);

        System.out.println();
        System.out.println(clienteMap.get("3333"));
    }
}
