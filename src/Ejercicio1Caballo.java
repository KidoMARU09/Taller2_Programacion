import java.util.Scanner;

public class Ejercicio1Caballo {
    static char[][] tablero = new char[8][8];

    public static void main(String[] args) {
        char[] VectorDeLetras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        int fila = 0, columna = 0;
        String C;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la posición del caballo.");
        System.out.print("Fila: ");
        fila = lector.nextInt();
        System.out.print("Columna: ");
        columna = lector.nextInt();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[fila][columna] = 'C';
            }
        }
        for (int i = 0; i < VectorDeLetras.length; i++) {
            System.out.print("|" + VectorDeLetras[i] + "|");
        }
        System.out.println();
        ImprimirTablero(tablero);
        System.out.println("Hola");
        setTablero(tablero);
    }

    public static void ImprimirTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("|" + tablero[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void setTablero(char[][] tablero) {
        Ejercicio1Caballo.tablero = tablero;
        int [][] PosicionDeSalto = {{2,1,-1,-2,-2,-1,1,2},{1,2,2,1,-1,-2,-2,-1}};
        for (int i = 0; i < PosicionDeSalto.length; i++) {
            for (int j = 0; j < PosicionDeSalto[i].length; j++) {
                System.out.print("| " + PosicionDeSalto[i][j] + " |");
            }
            System.out.println();
        }


    }
}
