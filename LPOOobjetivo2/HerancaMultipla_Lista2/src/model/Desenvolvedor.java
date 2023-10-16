package model;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor() {
        super();
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{"+
                "Nome='" + getNome() + '\'' +
                ", Salario=" + getSalario() +
                ", Bonus=" + getBonus() +
                '}';
    }

}
