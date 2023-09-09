import java.util.Scanner;
import java.util.ArrayList;
public class Mediana {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese números ordenados (ingrese '.' para terminar):");

        while (true) {
            String entrada = scanner.next();
            if (entrada.equals(".")) {
                break;
            } else {
                try {
                    int numero = Integer.parseInt(entrada);
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Ingrese números enteros o '.' para terminar.");
                }
            }
        }
        int cantidadNumeros = numeros.size();
        if (cantidadNumeros % 2 == 1) {
            int mediana = numeros.get(cantidadNumeros / 2);
            System.out.println("La mediana es: " + mediana);
        } else {
            int numero1 = numeros.get((cantidadNumeros - 1) / 2);
            int numero2 = numeros.get(cantidadNumeros / 2);
            double promedio = (numero1 + numero2) / 2.0;
            System.out.println("La mediana es: " + promedio);
        }
    }
}
