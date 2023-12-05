public class Figuras {
    int n;
    double lados;

    String nombre;

    public Figuras(int n, double lados, String nombre) {
        this.n = n;
        this.lados = lados;
        this.nombre = nombre;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    //metodo perimetro

    public double perimetro(int n, double longitud){
        double per = longitud * n;
        return per;
    }
}
