public class Tetraedro extends Figuras3D{
    double lado;

    public Tetraedro(int n, double lados, String nombre) {
        super(n, lados, nombre);
    }

    public Tetraedro(int n, double lados, String nombre, double lado) {
        super(n, lados, nombre);
        this.lado = lado;
    }

    public void perimetroTetraedro(){
        System.out.println("El lado del tetraedro es: " + this.getLados());
        System.out.println("El perimetro del tetraedro es: " + ((this.getLados()+3)*4));
    }
    public void areaTetraedro() {
        System.out.println("El area de un tetraedro es: " + ((Math.pow(this.getLados(), 2) * Math.sqrt(3))));
    }
    public void volumenTetraedro(){
        System.out.println("El volumen del tetraedro es: " + ((Math.pow(this.getLados(),3)*Math.sqrt(2)/12)));
    }
    public void alturaTetraedro(){
        System.out.println("La altura del tetraedro es: " + ((this.getLados()*Math.sqrt(6)/3)));
    }
}
