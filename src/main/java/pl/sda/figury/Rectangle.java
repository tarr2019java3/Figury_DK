package pl.sda.figury;

public class Rectangle implements Figure {

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


    public double getPerimeter(int sideA, int sideB){  //Obwód
        return (double) 2 * sideA + 2 * sideB;
    }

    public double getArea(int sideA, int sideB){  //Pole
        return (double) sideA * sideB;
    }


}
