package controller;

import model.Modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModeloController {
    public static void main(String[] args) {
        Modelo modelo1 = new Modelo();
        Modelo modelo2 = new Modelo(2, "Picape");
        System.out.println(modelo1);
        System.out.println(modelo2);

        modelo1.setId(1);
        modelo1.setDescricao("Hatch");
        System.out.println();
        System.out.println(modelo1.getId());
        System.out.println(modelo1.getDescricao());
        modelo2.setDescricao("SUV");
        System.out.println();
        System.out.println(modelo2.getId());
        System.out.println(modelo2.getDescricao());

        Modelo modelo3 = new Modelo(3, "Sedan");
        Modelo modelo4 = new Modelo(4, "Esportivo");
        Modelo modelo5 = new Modelo(4, "Esportivo");

        List<Modelo> modeloList = new ArrayList<>();
        modeloList.add(modelo1);
        modeloList.add(modelo2);
        modeloList.add(modelo3);
        modeloList.add(modelo4);
        modeloList.add(modelo5);
        System.out.println();
        System.out.println(modeloList);

        Modelo modeloFind = modeloList.stream().filter(m -> m.getId() == 3).findAny().orElse(null);
        System.out.println();
        System.out.println(modeloFind);

        modeloList.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println();
        System.out.println(modeloList);

        Map<Integer, Modelo> modeloMap = new HashMap<>();
        modeloMap.put(modelo1.getId(), modelo1);
        modeloMap.put(modelo2.getId(), modelo2);
        modeloMap.put(modelo3.getId(), modelo3);
        modeloMap.put(modelo4.getId(), modelo4);
        modeloMap.put(modelo5.getId(), modelo5);
        System.out.println();
        System.out.println(modeloMap);

        System.out.println();
        System.out.println(modeloMap.get(3));

    }

}