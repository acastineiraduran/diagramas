import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int CUADRADO = 1;
        final int TRIANGULO = 2;
        final int CIRCULO = 3;

        Funciones misFunciones = new Funciones();
        int lado, area, base, radio;
        int consola = misFunciones.inroducirOpcion();


        switch (consola) {
            case CUADRADO:
                lado = misFunciones.introducirOpcion();
                area =
                mostrarArea(area)
            case TRIANGULO:
                altura = misFunciones.introducirOpcion();
                base = misFunciones.introducirOpcion();
                area = calcularAreaTriangulo(base, altura)
                mostrarArea(area)
            case CIRCULO:
                radio = introducirNumero()
                area = calcularAreaCircunferencia(lado)
                mostrarArea(area)
        default:
            mostrarMensaje()

    }
}