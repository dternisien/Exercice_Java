public class Exercice10 {
    public static void main(String[] args) {
        int nombre = Outils.demandeInt("Choisissez un nombre entier ");

            for (int i = 0; i <= nombre; i++) {
                System.out.println();
                for (int k=0; k < nombre-i ; k++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
            }
        }
}
