package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {

        Passaro pa1 = new Passaro(1.0, 2.0, 3.0);
        Passaro pa2 = new Passaro(2.0, 3.0, 5.0);
        Passaro pa3 = new Passaro(5.0, 4.0, 3.0);
        Cachorro c1 = new Cachorro(2.0, 4.0);
        Cachorro c2 = new Cachorro(8.0, 9.0);
        Cachorro c3 = new Cachorro(3.0, 1.0);
        Peixe px1 = new Peixe(9.0, 7.0, 6.0);
        Peixe px2 = new Peixe(8.5, 10.0, 3.0);
        Peixe px3 = new Peixe(7.0, 5.0, 2.0);

        List<Animal> animais = new ArrayList<>();
        animais.add(pa1);
        animais.add(pa2);
        animais.add(pa3);
        animais.add(c1);
        animais.add(c2);
        animais.add(c3);
        animais.add(px1);
        animais.add(px2);
        animais.add(px3);
        System.out.println("\nLista de animais: " + animais);

        System.out.println("\nAnimais movidos para (2,2)\n");
        animais.forEach(an ->{
            an.mover(2.0, 2.0);
            an.desenhar();
            System.out.println(an);
        });

        System.out.println("\nCachorros movidos para (8,8)\n");
        animais.forEach(an->{
            if (an instanceof Cachorro){
                an.mover(8.0,8.0);
                an.desenhar();
                System.out.println(an);
            }
        });

        System.out.println("\nPeixes e Passaros reposicionados para (5,5,5)\n");
        animais.forEach(an ->{
            if (an instanceof Peixe){
                ((Peixe) an).mover(5.0, 5.0, 5.0);
                an.desenhar();
                System.out.println(an);
            } else if (an instanceof Passaro) {
                if (an instanceof Passaro){
                ((Passaro) an).mover(5.0,5.0,5.0);
                an.desenhar();
                System.out.println(an);
                }
                
            }
        });
    }
}
