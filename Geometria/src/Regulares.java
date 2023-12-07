public class Regulares extends Figuras2D {
    public Regulares(int n, double lados, String nombre) {
        super(n, lados, nombre);
    }
    //Area
    int ndiagonales;

    public int getNdiagonales() {
        return ndiagonales;
    }

    public void setNdiagonales(int ndiagonales) {
        this.ndiagonales = ndiagonales;
    }

    public void diagonales(){
        System.out.println("El numero de diagonales de este poligono regular es: "+this.getNdiagonales());
    }
}
