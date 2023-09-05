import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int postivo = 0, negativo = 0,numero;
        System.out.println("Ingrese números enteros y termine con cero.");
        do {
            numero = lector.nextInt();
            if (numero <= -1)
                negativo++;
            else
                postivo++;
        }while (numero != 0);
        System.out.print("Positivos: ");
        for (int i = 0; i < postivo; i++){
            System.out.print("*");
        }
        System.out.print("\nNegativos: ");
        for (int j = 0; j < negativo; j++){
            System.out.print("*");
        }
    }
}