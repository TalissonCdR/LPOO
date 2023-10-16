package model;

public interface Associado {
    int getQdeCotas();
    void setQdeCotas(int qdeCotas);
    double getValorCota();
    void setValorCota(double valorCota);
    double lucros(int qdeCotas, double valorCota);

}