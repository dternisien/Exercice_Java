public class Exercice8 {
    public static void main(String[] args) {
        int nombre = Outils.demandeInt("Choisissez un nombre entier ");

        for (int i =0; i <= nombre; i++){
            System.out.println();
            for (int j = 0; i > j ;j++) {
                System.out.print("*");
            }
        }
    }
}
