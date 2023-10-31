package model;

import java.time.LocalDateTime;


public class Fornecimento {
    private LocalDateTime data;
    private double total;
    private Fornecedor fornecedor;
    private Produto produto;

    public Fornecimento() {
    }

    public Fornecimento(LocalDateTime data, double total, Fornecedor fornecedor, Produto produto) {
        this.data = data;
        this.total = total;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    @Override
    public String toString() {
        return "\nFornecimento{" +
                "data=" + data +
                ", total=" + total +
                ", fornecedor=" + fornecedor +
                ", produto=" + produto +
                '}';
    }

}
