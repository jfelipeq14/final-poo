import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void readStudent() {
        int i, n;
        Estudiante estudiante = new Estudiante();
        do {
            System.out.print("Número de coches? ");
            n = input.nextInt();
        } while (n < 0);
        input.nextLine();
        for (i = 1; i < n; i++) {
            System.out.println("Estudiante #" + i);

        }
    }
}
