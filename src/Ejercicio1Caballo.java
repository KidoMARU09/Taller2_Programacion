import java.util.Scanner;
public class Ejercicio1Caballo {
    static int [][] tablero = new int[8][8];
    public static void main(String[] args) {
        int Fila = 0, Columna = 0;
        Scanner lector = new Scanner(System.in);
        ImprimirTablero(tablero);
        System.out.println("Ingrese la posición del caballo.");
        System.out.print("Fila: ");
        Fila = lector.nextInt();
        System.out.print("Columna: ");
        Columna = lector.nextInt();

    }

    public static void ImprimirTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("|" + tablero[i][j] + "|");
            }
            System.out.println();
        }
    }
}
