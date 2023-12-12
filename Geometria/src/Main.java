import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona una figura:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo Equilátero");
        System.out.println("3. Hexágono");
        System.out.println("4. Pentágono");
        System.out.println("5. Cubo");
        System.out.println("6. Tetraedro");

        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                System.out.print("Ingresa el lado del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();

                Cuadrado cuadrado = new Cuadrado(4, ladoCuadrado, "Cuadrado");
                cuadrado.mostrarInformacion();
                break;

            case 2:
                System.out.print("Ingresa el lado del triángulo equilátero: ");
                double ladoTriangulo = scanner.nextDouble();

                TrianguloEquilatero triangulo = new TrianguloEquilatero(3, ladoTriangulo, "Triángulo Equilátero");
                triangulo.areat();
                break;

            case 3:
                System.out.print("Ingresa el lado del hexágono: ");
                double ladoHexagono = scanner.nextDouble();

                Hexagono hexagono = new Hexagono(6, ladoHexagono, "Hexágono");
                hexagono.areat();
                break;

            case 4:
                System.out.print("Ingresa el lado del pentágono: ");
                double ladoPentagono = scanner.nextDouble();

                Pentagono pentagono = new Pentagono(5, ladoPentagono, "Pentágono");
                pentagono.areat();
                break;

            case 5:
                System.out.print("Ingresa el lado del cubo: ");
                double ladoCubo = scanner.nextDouble();

                Cubo cubo = new Cubo(6, ladoCubo, "Cubo", ladoCubo);
                cubo.areaCubo();
                cubo.volumenCubo();
                break;

            case 6:
                System.out.print("Ingresa el lado del tetraedro: ");
                double ladoTetraedro = scanner.nextDouble();

                Tetraedro tetraedro = new Tetraedro(4, ladoTetraedro, "Tetraedro", ladoTetraedro);
                tetraedro.perimetroTetraedro();
                tetraedro.areaTetraedro();
                tetraedro.volumenTetraedro();
                break;

            default:
                System.out.println("Elección no válida");
                break;
        }

        scanner.close();
    }
}
