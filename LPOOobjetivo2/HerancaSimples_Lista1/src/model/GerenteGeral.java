package model;

import java.text.NumberFormat;

public class GerenteGeral extends Gerente{
    public GerenteGeral(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.4;
    }

    @Override
    public String toString() {
        return "\nGerenteGeral{Bonus= "
                + NumberFormat.getCurrencyInstance().format(getBonus()) + ", Nome= " + getNome() +", Salario= " + NumberFormat.getCurrencyInstance().format(getSalario()) + "}";
    }
}