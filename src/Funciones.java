import java.util.Scanner;

public class Funciones {
    Scanner obx = new Scanner(System.in);
    int consola = obx.nextInt();

    public void mostrarMenu(){
        System.out.println("Muestro menu:\n1.Cuadrado\n2.Triangulo\n3.Cicunferencia");
    }

    public int introducirOpcion(){
        //pide opcion al usuario
        consola = obx.nextInt();
        return consola;
    }

    public int areaCuadrado()
}
