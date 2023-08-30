package controller;

import model.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarroController {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro(2, "Renault", "Logan", 2021);
        System.out.println(carro1);
        System.out.println(carro2);

        carro1.setId(1);
        carro1.setMarca("Renault");
        carro1.setModelo("Kwid");
        carro1.setAnoFabricacao(2018);
        carro2.setMarca("Fiat");
        carro2.setModelo("Marea");
        carro2.setAnoFabricacao(2002);

        System.out.println();
        System.out.println(carro1.getId());
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAnoFabricacao());
        System.out.println();
        System.out.println(carro2.getId());
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAnoFabricacao());

        Carro carro3 = new Carro(3, "Chevrolet", "Camaro", 2022);
        Carro carro4 = new Carro(4, "Volkswagen", "Fusca", 1975);
        Carro carro5 = new Carro(4, "Volkswagen", "Fusca", 1975);

        List<Carro> carroList = new ArrayList<>();
        carroList.add(carro1);
        carroList.add(carro2);
        carroList.add(carro3);
        carroList.add(carro4);
        carroList.add(carro5);
        System.out.println();
        System.out.println(carroList);

        Carro carroFind = carroList.stream().filter(c ->c.getId() == 3).findAny().orElse(null);
        System.out.println();
        System.out.println(carroFind);

        carroList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println();
        System.out.println(carroList);

        Map<Integer, Carro> carroMap = new HashMap<>();
        carroMap.put(carro1.getId(), carro1);
        carroMap.put(carro2.getId(), carro2);
        carroMap.put(carro3.getId(), carro3);
        carroMap.put(carro4.getId(), carro4);
        carroMap.put(carro5.getId(), carro5);
        System.out.println();
        System.out.println(carroMap);

        System.out.println();
        System.out.println(carroMap.get(3));
    }
}
