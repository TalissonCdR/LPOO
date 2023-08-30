package controller;

import model.Marca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarcaController {
    public static void main(String[] args) {
        Marca marca1 = new Marca();
        Marca marca2 = new Marca(2, "marca bastante utilizada no mercado");
        System.out.println(marca1);
        System.out.println(marca2);

        marca1.setId(1);
        marca1.setDescricao("descricao automatizada");
        System.out.println();
        System.out.println(marca1.getId());
        System.out.println(marca1.getDescricao());
        marca2.setDescricao("totalmente famosa no mercado");
        System.out.println();
        System.out.println(marca2.getId());
        System.out.println(marca2.getDescricao());

        Marca marca3 = new Marca(3, "Totalmente padrão");
        Marca marca4 = new Marca(4, "O mais puro luxo");
        Marca marca5 = new Marca(4, "O mais puro luxo");

        List<Marca> marcaList = new ArrayList<>();
        marcaList.add(marca1);
        marcaList.add(marca2);
        marcaList.add(marca3);
        marcaList.add(marca4);
        marcaList.add(marca5);
        System.out.println();
        System.out.println(marcaList);

        Marca marcaFind = marcaList.stream().filter(m -> m.getId() == 3).findAny().orElse(null);
        System.out.println();
        System.out.println(marcaFind);

        marcaList.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println();
        System.out.println(marcaList);

        Map<Integer, Marca> marcaMap = new HashMap<>();
        marcaMap.put(marca1.getId(), marca1);
        marcaMap.put(marca2.getId(), marca2);
        marcaMap.put(marca3.getId(), marca3);
        marcaMap.put(marca4.getId(), marca4);
        marcaMap.put(marca5.getId(), marca5);
        System.out.println();
        System.out.println(marcaMap);

        System.out.println();
        System.out.println(marcaMap.get(3));

    }

}
