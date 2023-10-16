package controller;

import model.Automovel;
import model.Bicicleta;
import model.Caminhao;
import model.Carro;
import model.Veiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {

        Bicicleta b1 = new Bicicleta(2, "humana", "BMX", "Street", 2019, 24, "1adam12");
        System.out.println(b1);

        Carro c1 = new Carro(2, "gasolina", "Renault", "Kwid", 2022, 80, "128756", "A5D7F8111", "ASD8534");
        System.out.println(c1);

        Caminhao cm1 = new Caminhao(4, "diesel", "Volkswagen", "AAAAAA", 2018, 1800, "123456", "EWASD852DAS", "CIA7853");
        System.out.println(cm1);

        Bicicleta b2 = new Bicicleta(2, "humana", "BMX", "Street", 2008, 24, "1adam12");
        Bicicleta b3= new Bicicleta(2, "humana", "BMX", "Street", 2022, 24, "1adam12");
        Bicicleta b4 = new Bicicleta(2, "humana", "BMX", "Street", 2018, 24, "1adam12");
        Bicicleta b5 = new Bicicleta(2, "humana", "BMX", "Street", 2017, 24, "1adam12");

        Carro c2 = new Carro(2, "gasolina", "Renault", "Kwid", 2022, 80, "128756", "A5D7F8111", "IBD2734");
        Carro c3 = new Carro(2, "gasolina", "Renault", "Kwid", 2022, 80, "128756", "A5D7F8111", "ASD8534");
        Carro c4 = new Carro(2, "gasolina", "Renault", "Logan", 2019, 80, "128756", "DAS9D79AS", "iFT8534");
        Carro c5 = new Carro(2, "gasolina", "Renault", "Kwid", 2022, 80, "128756", "A5D7F8111", "ASD8534");

        Caminhao cm2 = new Caminhao(4, "diesel", "Volkswagen", "AAAAAA", 2018, 1800, "123456", "D45AS4D8ASD", "ISQ7853");
        Caminhao cm3 = new Caminhao(4, "diesel", "Volkswagen", "AAAAAA", 2018, 1800, "123456", "EWASD852DAS", "CIA7853");
        Caminhao cm4 = new Caminhao(5, "diesel", "Scania", "IIIIII", 2021, 1800, "123456", "SAD48AS4D8D", "IJN7533");
        Caminhao cm5 = new Caminhao(6, "diesel", "Volkswagen", "BBBBBB", 2007, 1800, "123456", "EEW874E8SAD", "iLQ9832");

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(b1);
        veiculos.add(b2);
        veiculos.add(b3);
        veiculos.add(b4);
        veiculos.add(b5);
        veiculos.add(c1);
        veiculos.add(c2);
        veiculos.add(c3);
        veiculos.add(c4);
        veiculos.add(c5);
        veiculos.add(cm1);
        veiculos.add(cm2);
        veiculos.add(cm3);
        veiculos.add(cm4);
        veiculos.add(cm5);

        veiculos.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println("\nVeiculos por ano de fabricação: " + veiculos);

        System.out.println("\nAutomoveis por ano de fabricação: ");
        veiculos.forEach(vei->{
            if (vei instanceof Automovel){
                System.out.println(vei);
            }
        });

        System.out.println("\nBicicletas por ano de fabricação: ");
        veiculos.forEach(vei->{
            if (vei instanceof Bicicleta){
                System.out.println(vei);
            }
        });

        System.out.println("\nVeiculos com placa I ou i de inicio: ");
        veiculos.forEach(vei->{
            if (vei instanceof Automovel){
                if(((Automovel)vei).getPlaca().startsWith("I") || ((Automovel)vei).getPlaca().startsWith("i")){
                    System.out.println(vei);
                }
            }
        });


    }
}
