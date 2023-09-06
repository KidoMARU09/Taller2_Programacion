import java.util.Scanner;
public class Ejercicio7Rango {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero, contador = 0;
        float PosicionVector, Rango;
        System.out.println("¿Cuantos datos ingresará?");
        System.out.print("Respuesta: ");
        numero = lector.nextInt();
        Float[] VectordeRangos = new Float[numero];
        for (int i = 0; i < numero; i++) {
            contador++;
            System.out.print("Valor " + contador + ": ");
            PosicionVector = lector.nextFloat();
            VectordeRangos[i] = PosicionVector;
        }
        float mayor = VectordeRangos[0];
        float menor = VectordeRangos[0];
        for (int i = 0; i < VectordeRangos.length; i++) {
            if (VectordeRangos[i] > mayor) {
                mayor = VectordeRangos[i];
            }
            if (VectordeRangos[i] < menor) {
                menor = VectordeRangos[i];
            }
        }
        Rango = mayor - menor;
        System.out.println("El rango es de " + Rango);
    }
}
