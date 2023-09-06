import java.util.Scanner;
public class Ejercicio4NumeroPalindromo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un número:");
        numero = lector.nextInt();
        String numeroInvertido = String.valueOf(numero);
        String numeroAlReves = new StringBuilder(numeroInvertido).reverse().toString();
        if (numeroInvertido.equals(numeroAlReves)) {
            System.out.println("El número " + numero + " es palíndromo.");
        } else {
            System.out.println("El número " + numero + " no es palíndromo.");
        }
    }
}
