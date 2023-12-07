public class TrianguloEquilatero extends Regulares {
    public TrianguloEquilatero(int n, double lados, String nombre) {
        super(n, lados, nombre);
    }
    double areadeltriangulo;

    public double getAreadeltriangulo() {
        return areadeltriangulo;
    }

    public void setAreadeltriangulo(double areadeltriangulo) {
        this.areadeltriangulo = areadeltriangulo;
    }

    public void areat(){
        System.out.println("El area es: "+(this.getLados()*this.getLados()*Math.sqrt(3)/4));
    }
}
