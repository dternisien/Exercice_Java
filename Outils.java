import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Outils {
    public static void afficher(String message) {
        System.out.println(message);
    }

    public static void afficher(int valeur) {
        System.out.println(valeur);
    }

    public static void afficher(double valeur) {
        System.out.println(valeur);
    }

    public static void afficher(boolean valeur) {
        System.out.println(valeur);
    }

    public static String demande() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String demande(String message) {
        System.out.println(message);
        return demande();
    }

    public static int demandeInt(String s) {
        System.out.println(s);
        return Integer.parseInt(demande());
    }

    public static double demandeDouble(String message) {
        System.out.println(message);
        return Double.parseDouble(demande());
    }

    public static boolean demandeBoolean(String message) {
        System.out.println(message);
        String input = demande();
        input = input.toLowerCase();
        if (Objects.equals(input, "true") || Objects.equals(input, "vrai" )) {
            return true;
        } else if (Objects.equals(input, "false") || Objects.equals(input, "faux")) {
            return false;
        }
        else {
            System.out.println("Tu dois entrer vrai ou faux");
            return demandeBoolean(demande());
        }
    }

    public static int randInt(int maximum){
        return new Random().nextInt(maximum);
    }

    public static int randInt(int min, int max){
        return new Random().nextInt(min,max);
    }

    public static void main(String[] args) {
//        String nom = demande("Qu'elle est votre nom ?");
//        afficher("Bonjour "+ nom);
//        int age = demandeInt("Qu'elle age avec vous ?");
//        afficher("Vous avez "+ age + " ans");
//        double taille = demandeDouble("Qu'elle taille fais tu");
//        afficher(taille);

//        for (int i = 0; i < 4 ; i++) {
//            System.out.println(randInt(100));
//
//        }
    }
}