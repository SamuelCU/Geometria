public class Figuras2D extends Figuras{
    public Figuras2D(int n, double lados, String nombre) {
        super(n, lados, nombre);
    }
    public void perimetro (){
        double peri = 0;
        for (int i = 1; i<=getN(); i++){
            peri += getLados();
        }
        System.out.println("El perímetro es:" + peri);
    }
}
