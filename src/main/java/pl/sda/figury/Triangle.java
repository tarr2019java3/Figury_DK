package pl.sda.figury;

public class Triangle implements Figure {

    private int sideA;
    private int sideB;


    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public double getPerimeter(int sideA, int sideB){   // Obwód
        double sideC;
        sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return (double) sideA + sideB + sideC;
    }

    public double getArea(int sideA, int sideB) {   // Pole
        return (double) sideA * sideB / 2;
    }

}
