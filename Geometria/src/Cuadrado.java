public class Cuadrado extends Figuras2D{
    public Cuadrado(int n, double lado, String nombre) {
        super(n, lado, nombre);
    }

    public void areaCuadrado() {
        System.out.println("El área del cuadrado es: " + Math.pow(getLados(), 2));
    }

    public void perimetroCuadrado() {
        System.out.println("El perímetro del cuadrado es: " + (4 * getLados()));
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Número de lados: " + getN());
        System.out.println("Longitud de los lados: " + getLados());
        areaCuadrado();

        
    }
}
