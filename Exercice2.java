public class Exercice2 {

    public static void main(String[] args) {
        double nbr1 = Outils.demandeDouble("Entrez le premier chiffre");
        double nbr2 = Outils.demandeDouble("Entrez le second chiffre");

        double resultat = nbr1 + nbr2;

        System.out.println(nbr1 + "+" + nbr2 + "=" + resultat);
    }

}
