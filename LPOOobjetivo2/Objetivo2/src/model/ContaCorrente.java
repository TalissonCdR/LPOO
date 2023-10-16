package model;

public class ContaCorrente extends Conta implements Associado{
    private int qdeCotas;
    private double valorCota;
    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, int qdeCotas, double valorCota) {
        super(saldo);
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
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
        return "\nContaCorrente{" +
                ", saldo=" + getSaldo() +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                ", Lucros=" + lucros(qdeCotas, valorCota) +
                '}';
    }
}
