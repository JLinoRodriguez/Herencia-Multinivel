package misClases;

public class PrismaRectangular extends Rectangulo {
    private double altura;
    
    public PrismaRectangular(){
        this(3);
    }

    public PrismaRectangular(double altura) {
        this.altura = altura;
    }

    public PrismaRectangular(double altura, double largo, double ancho) {
        super(largo, ancho);
        this.altura = altura;
    }

    public PrismaRectangular(double altura, double largo, double ancho, String color, boolean relleno) {
        super(largo, ancho, color, relleno);
        this.altura = altura;
    }
    
}
