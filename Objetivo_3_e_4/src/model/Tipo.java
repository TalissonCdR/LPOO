package model;

public enum Tipo {
    ATENDIDO("Atendido"),
    PENDENTE("Pendente"),
    CANCELADO("Cancelado");

    private String tipo;

    Tipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
