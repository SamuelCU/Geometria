public class Cubo extends Figuras3D{
    double lado;
    public Cubo(int n, double lados, String nombre) {
        super(n, lados, nombre);
    }

    public Cubo(int n, double lados, String nombre, double lado) {
        super(n, lados, nombre);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void areaCubo(){
        System.out.println("El lado del cubo es: " + this.getLado());
        System.out.println("El area del cubo es: " + Math.pow(this.getLado(),2)*6);
    }
    public void volumenCubo(){
        System.out.println("El volumen del cubo es: " + Math.pow(this.getLados(),3));
    }
    public void diagonalCubo(){
        System.out.println("La diagonal del cubo es: " + ((this.getLados())*Math.sqrt(3)));
    }
}
