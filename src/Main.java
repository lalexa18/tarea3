import java.util.Scanner;

public class Edificio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n      ¡Bienvenido al edificio!\nPOR FAVOR RESPONDA A LAS SIGUIENTES PREGUNTAS");

        System.out.print("Ingrese el ID del visitante: ");
        String visitorId = scanner.nextLine();

        System.out.print("Ingrese el número de apartamento: ");
        short apartmentNumber = Short.parseShort(scanner.nextLine());

        System.out.print("Ingrese el número de teléfono: ");
        String phoneNumber = scanner.nextLine();
        phoneNumber = phoneNumber.replaceAll("-", "");

        System.out.print("Ingrese el género (M/F): ");
        char gender = scanner.nextLine().toUpperCase().charAt(0);

        System.out.print("Es residente? (S/N): ");
        boolean isResident = scanner.nextLine().toUpperCase().charAt(0) == 'S';

        // Imprimir los datos ingresados
        System.out.println("\nDatos ingresados:");
        System.out.println("ID del visitante: " + visitorId);
        System.out.println("Número de apartamento: " + apartmentNumber);
        System.out.println("Número de teléfono: " + phoneNumber);
        System.out.println("Género: " + gender);
        System.out.println("Es residente: " + isResident);
    }
}
