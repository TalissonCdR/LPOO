package model;

public class Peixe extends Animal {
    private double z = 0.0;

    public Peixe() {
        super();
    }

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Peixe desenhado!");
    }

    public void mover(double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nPeixe{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
