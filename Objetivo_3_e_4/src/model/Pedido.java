package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private LocalDateTime data;
    private double valor;
    private Tipo tipo;
    private List<Item> items = new ArrayList<>();
    private Vendedor vendedor;
    private double valorTotalitem;

    public Pedido() {
    }

    public Pedido(int numero, LocalDateTime data, double valor, Tipo tipo, Vendedor vendedor, double valorTotalitem) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.vendedor = vendedor;
        this.valorTotalitem = valorTotalitem;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getValorTotalitem() {
        return valorTotalitem;
    }

    public void setValorTotalitem(double valorTotalitem) {
        this.valorTotalitem = valorTotalitem;
    }


    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", tipo=" + tipo +
                ", items=" + items +
                ", vendedor=" + vendedor +
                ", valorTotalitem=" + valorTotalitem +
                '}';
    }
}
