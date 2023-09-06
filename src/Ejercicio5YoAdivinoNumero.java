import java.util.Scanner;
import java.util.Random;
public class Ejercicio5YoAdivinoNumero {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        int NumeroJugador, contador = 1, intentos = 0;
        int NumeroOculto = random.nextInt(100) + 1;
        System.out.println("Adivina el número");
        do {
            intentos++;
            System.out.println("Intento: " + intentos);
            NumeroJugador = lector.nextInt();
            if (NumeroJugador > NumeroOculto) {
                System.out.println("El número es menor que " + NumeroJugador);
            } else if (NumeroJugador < NumeroOculto) {
                System.out.println("El número es mayor que " + NumeroJugador);
            }
        } while (NumeroOculto != NumeroJugador);
        System.out.println("Bien adivinaste el número en " + intentos + " intentos.");

    }
}
