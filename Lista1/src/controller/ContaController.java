package controller;

import model.Conta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContaController {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(2, 1350);
        System.out.println(conta1);
        System.out.println(conta2);

        conta1.setId(1);
        conta1.deposita(3000);
        System.out.println();
        System.out.println(conta1.getId());
        System.out.println(conta1.getSaldo());

        conta2.deposita(1800);
        System.out.println();
        System.out.println(conta2.getId());
        System.out.println(conta2.getSaldo());

        Conta conta3 = new Conta(3, 1950);
        Conta conta4 = new Conta(4, 75000);
        Conta conta5 = new Conta(4, 75000);

        List<Conta> contaList = new ArrayList<>();
        contaList.add(conta1);
        contaList.add(conta2);
        contaList.add(conta3);
        contaList.add(conta4);
        contaList.add(conta5);
        System.out.println();
        System.out.println(contaList);

        Conta contaFind = contaList.stream().filter(b -> b.getId() == 3).findAny().orElse(null);
        System.out.println();
        System.out.println(contaFind);

        contaList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println();
        System.out.println(contaList);

        Map<Integer, Conta> contaMap = new HashMap<>();
        contaMap.put(conta1.getId(), conta1);
        contaMap.put(conta2.getId(), conta2);
        contaMap.put(conta3.getId(), conta3);
        contaMap.put(conta4.getId(), conta4);
        contaMap.put(conta5.getId(), conta5);
        System.out.println();
        System.out.println(contaMap);

        System.out.println();
        System.out.println(contaMap.get(3));
    }
}
