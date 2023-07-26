package andreas;


import java.util.Scanner;

public class ScannerVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creation des variables
        int age = 18;
        double moyenne = 18.5;
        String prenom;
        String s1 = "Chaine 1";
        String s2 = new String("Chaine 2");

        System.out.print("Quel age avez-vous ? -: ");
        age = scanner.nextInt();

        // Scanner de controle
        scanner.nextLine();

        System.out.print("Quel est votre prenom ? -: ");
        prenom = scanner.nextLine();

        System.out.println(" Bonjour "+ prenom +" Vous avez "+ age +" ans");


    }
}
