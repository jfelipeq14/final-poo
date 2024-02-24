import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<Student> readstudent() {
        String keep = "si";
        do {
            Student student = new Student();

            System.out.println("Ingrese la informacion del estudiante");

            System.out.print("Identificacion: ");
            student.setIdentity(input.next());

            System.out.print("Nombre: ");
            student.setName(input.next());

            System.out.print("Correo: ");
            student.setEmail(input.next());

            students.add(student);

            System.out.print("¿Desea agregar otro estudiante? (si/no): ");
            keep = input.next();
        } while (keep.equals("si"));

        return students;
    }

    public static void getstudents(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("__________");
            System.out.println("Estudiante " + (i + 1));
            System.out.println(students.get(i).getIdentity());
            System.out.println(students.get(i).getName());
            System.out.println(students.get(i).getEmail());
        }
    }

    public static void getStudentById(String id, ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getIdentity().equals(id)) {
                System.out.println(
                        "Se encontro al estudiante con identificacion: " + students.get(i).getIdentity());
                System.out.println("Nombre: " + students.get(i).getName());
                System.out.println("Correo: " + students.get(i).getEmail());
            }
        }
    }

    public static void updateStudent(String id, ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getIdentity().equals(id)) {
                System.out.print("Nuevo nombre: ");
                students.get(i).setName(input.next());

                System.out.print("Nuevo correo: ");
                students.get(i).setEmail(input.next());

                System.out.println("Estudiante actualizado!");
            }
        }
    }

    public static void main(String[] args) {
        int option = 0;
        do {
            System.out.println("1. Ingresar estudiante: ");
            System.out.println("2. Mostrar los estudiantes: ");
            System.out.println("3. Buscar un estudiante: ");
            System.out.println("4. Actualizar un estudiante: ");
            System.out.println("0. Salir: ");
            System.out.print("Elija una opcion (1-4): ");
            option = input.nextInt();
            if (option == 1) {
                students = readstudent();
            } else if (option == 2) {
                getstudents(students);
            } else if (option == 3) {
                System.out.print("Ingrese la identificacion del estudiante: ");
                getStudentById(input.next(), students);
            } else if (option == 4) {
                System.out.print("Ingrese la identificacion del estudiante: ");
                String id = input.next();
                updateStudent(id, students);
            } else {
                System.out.println("Hasta luego!");
            }

        } while (option != 0);

    }

}
