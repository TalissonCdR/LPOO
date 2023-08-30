package controller;

import model.Automovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutomovelController {
    public static void main(String[] args) {
        Automovel automovel1 = new Automovel();
        Automovel automovel2 = new Automovel("15", "GZK7777", "PRATA", 4, "gasolina", 0, "15", 250);
        System.out.println(automovel1);
        System.out.println(automovel2);

        automovel1.setRenavan("1111");
        automovel1.setPlaca("LKW5682");
        automovel1.setCor("PRETO");
        automovel1.setNum_rodas(4);
        automovel1.setCombustivel("gasolina");
        automovel1.setQuilometragem(0);
        automovel1.setChassi("1524");
        automovel1.setValor_locacao(150);

        automovel2.setRenavan("2222");
        automovel2.setPlaca("GHF8642");
        automovel2.setCor("VERDE");
        automovel2.setNum_rodas(4);
        automovel2.setCombustivel("gasolina/alcool");
        automovel2.setQuilometragem(15000);
        automovel2.setChassi("2785");
        automovel2.setValor_locacao(95);

        System.out.println();
        System.out.println(automovel1.getRenavan());
        System.out.println(automovel1.getPlaca());
        System.out.println(automovel1.getCor());
        System.out.println(automovel1.getNum_rodas());
        System.out.println(automovel1.getCombustivel());
        System.out.println(automovel1.getQuilometragem());
        System.out.println(automovel1.getChassi());
        System.out.println(automovel1.getValor_locacao());
        System.out.println();
        System.out.println(automovel2.getRenavan());
        System.out.println(automovel2.getPlaca());
        System.out.println(automovel2.getCor());
        System.out.println(automovel2.getNum_rodas());
        System.out.println(automovel2.getCombustivel());
        System.out.println(automovel2.getQuilometragem());
        System.out.println(automovel2.getChassi());
        System.out.println(automovel2.getValor_locacao());

        Automovel automovel3 = new Automovel("3333", "LPW2893", "MARROM", 4, "gasolina", 5000, "9634", 105);
        Automovel automovel4 = new Automovel("4444", "FGK6782", "AMARELO", 4, "gasolina/alcool", 0, "7523", 250);
        Automovel automovel5 = new Automovel("4444", "FGK6782", "AMARELO", 4, "gasolina/alcool", 0, "7523", 250);

        List<Automovel> automovelList = new ArrayList<>();
        automovelList.add(automovel1);
        automovelList.add(automovel2);
        automovelList.add(automovel3);
        automovelList.add(automovel4);
        automovelList.add(automovel5);
        System.out.println();
        System.out.println(automovelList);

        Automovel automovelFind = automovelList.stream().filter(a -> a.getRenavan().equals("3333")).findAny().orElse(null);
        System.out.println(automovelFind);

        automovelList.sort(Comparator.comparing(Automovel::getRenavan).reversed());
        System.out.println();
        System.out.println(automovelList);

        Map<String, Automovel> automovelMap = new HashMap<>();
        automovelMap.put(automovel1.getRenavan(), automovel1);
        automovelMap.put(automovel2.getRenavan(), automovel2);
        automovelMap.put(automovel3.getRenavan(), automovel3);
        automovelMap.put(automovel4.getRenavan(), automovel4);
        automovelMap.put(automovel5.getRenavan(), automovel5);
        System.out.println();
        System.out.println(automovelMap);

        System.out.println();
        System.out.println(automovelMap.get("3333"));
    }
}