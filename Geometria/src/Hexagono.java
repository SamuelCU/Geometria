public class Hexagono extends TrianguloEquilatero{

    public Hexagono(int n, double lados, String nombre) {
        super(n, lados, nombre);
    }

    double areah;

    public double getAreah() {
        return areah;
    }

    public void setAreah(double areah) {
        this.areah = areah;
    }

    public void areahex(){
        areah=areadeltriangulo*6;
        System.out.println("El area del hexgono es: "+areah);
    }
}
