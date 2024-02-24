import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public static ArrayList<Estudiante> readestudiante() {
        String continuar = "si";
        Estudiante estudiante = new Estudiante();
        do {
            System.out.println("Ingrese la informacion del estudiante");
            System.out.print("Identificacion: ");
            estudiante.setIdentificacion(input.next());

            System.out.print("Nombre: ");
            estudiante.setNombre(input.next());

            System.out.print("Email: ");
            estudiante.setEmail(input.next());

            estudiantes.add(estudiante);

            System.out.print("¿Desea agregar otro estudiante? (si/no): ");
            continuar = input.next();
        } while (continuar.equals("si"));

        return estudiantes;
    }

    public static void getestudiantes(ArrayList<Estudiante> estudiantes) {
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Estudiante " + (i + 1));
            System.out.println(estudiantes.get(i).getIdentificacion());
            System.out.println(estudiantes.get(i).getNombre());
            System.out.println(estudiantes.get(i).getEmail());
        }
    }

    public static void getEstudianteById(String id, ArrayList<Estudiante> estudiantes) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getIdentificacion().equals(id)) {
                System.out.println(
                        "Se encontro al estudiante con identificacion: " + estudiantes.get(i).getIdentificacion());
                System.out.println("Nombre: " + estudiantes.get(i).getNombre());
                System.out.println("Correo: " + estudiantes.get(i).getEmail());
            }
        }
    }

    public static void updateEstudiante(String id, ArrayList<Estudiante> estudiantes) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getIdentificacion().equals(id)) {
                System.out.print("Nuevo Nombre: ");
                estudiantes.get(i).setNombre(input.next());

                System.out.print("Nuevo Email: ");
                estudiantes.get(i).setEmail(input.next());

                System.out.println("Estudiante actualizado!");
            }
        }
    }

    public static void main(String[] args) {
        // ArrayList<Estudiante> arrayList = new ArrayList<>();
        int option = 0;
        do {
            System.out.println("1. Ingresar estudiantes: ");
            System.out.println("2. Mostrar los estudiantes: ");
            System.out.println("3. Buscar un estudiante: ");
            System.out.println("4. Actualizar un estudiante: ");
            System.out.println("0. Salir: ");
            System.out.print("Elija una opcion (1-4): ");
            option = input.nextInt();
            if (option == 1) {
                estudiantes = readestudiante();
            } else if (option == 2) {
                getestudiantes(estudiantes);
            } else if (option == 3) {
                System.out.print("Ingrese la identificacion del estudiante: ");
                getEstudianteById(input.next(), estudiantes);
            } else if (option == 4) {
                System.out.print("Ingrese la identificacion del estudiante: ");
                String id = input.next();
                updateEstudiante(id, estudiantes);
            } else {
                System.out.println("Hasta luego!");
            }

        } while (option != 0);

    }

}
