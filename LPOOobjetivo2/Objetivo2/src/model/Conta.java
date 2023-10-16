package model;

public abstract class Conta {
    protected double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        saldo += valor;
    }
    public void saca(double valor){
        double saldoAtual = saldo - valor;
        if(saldoAtual >= 0){
            saldo -= valor;
        }else{
            System.out.println("Não foi possivel realizar o saque:");
        }
    }
    public void atualiza(double taxa){
        saldo += saldo * (taxa/100);
    }
}
