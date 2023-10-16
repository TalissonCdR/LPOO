package model;

public class Cliente implements Associado{
    public String nome;
    private int qdeCotas;
    private double valorCota;

    public Cliente() {
    }

    public Cliente(String nome, int qdeCotas, double valorCota) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getQdeCotas() {
        return qdeCotas;
    }

    @Override
    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public double getValorCota() {
        return valorCota;
    }

    @Override
    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        double lucro = qdeCotas * valorCota;
        return lucro;
    }


    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                ", Lucros=" + lucros(qdeCotas,valorCota) +
                '}';
    }
}
