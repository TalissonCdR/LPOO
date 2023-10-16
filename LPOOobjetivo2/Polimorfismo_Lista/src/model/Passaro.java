package model;

public class Passaro extends Animal {
    private double z = 0.0;

    public Passaro() {
        super();
    }

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Passaro desenhado!");
    }

    public void mover(double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nPassaro{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
