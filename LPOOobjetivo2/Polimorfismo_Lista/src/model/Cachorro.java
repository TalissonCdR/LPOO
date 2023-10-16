package model;

public class Cachorro extends Animal{

    public Cachorro() {
        super();
    }

    public Cachorro(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Cachorro desenhado!");
    }

    @Override
    public String toString() {
        return "\nCachorro{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
