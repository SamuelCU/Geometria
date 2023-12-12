public class Pentagono extends TrianguloEquilatero{
    public Pentagono(int n, double lados, String nombre) {
        super(n, lados, nombre);
    }
    double areap;

    public double getAreap() {
        return areap;
    }

    public void setAreap(double areap) {
        this.areap = areap;
    }

    @Override
    public void areat(){
        System.out.println("El area es: "+(5*(this.getLados()*this.getLados()*Math.sqrt(3)/4)));
    }
}
