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

    public void areape(){
        areap=areadeltriangulo*5;
        System.out.println("El area del pentagono es : "+areap);
    }
}
