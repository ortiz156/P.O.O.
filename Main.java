import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Persona> personas = new ArrayList<>();

    static void Mayor() {
        Persona mayor = personas.get(0);
        for (int i = 1; i < personas.size(); i++) {
            Persona personaActual = personas.get(i);
            if (personaActual.calcularEdad() > mayor.calcularEdad()) {
                mayor = personaActual;
            }
        }
        System.out.println(mayor.nombre + " es el mayor con " + mayor.calcularEdad() + " años.");
    }

    static void Menor() {
        Persona menor = personas.get(0);
        for (int i = 1; i < personas.size(); i++) {
            Persona personaActual = personas.get(i);
            if (personaActual.calcularEdad() < menor.calcularEdad()) {
                menor = personaActual;
            }
        }
        System.out.println(menor.nombre + " es el menor con " + menor.calcularEdad() + " años.");
    }

    static void Promedio() {
        float promedio = 0;
        int contador = 0;
        for (int i = 0; i < personas.size(); i++) {
            Persona p1 = personas.get(i);
            contador += p1.calcularEdad();
        }
        promedio = (float) contador / personas.size();
        System.out.println("El promedio de edad es " + promedio);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
            String fechaNacimiento = scanner.nextLine();

            Persona persona = new Persona(nombre, fechaNacimiento);
            personas.add(persona);

            System.out.println(nombre + " nacio " + fechaNacimiento + ".");
        }

        scanner.close();

        Mayor();
        Menor();
        Promedio();
    }
}