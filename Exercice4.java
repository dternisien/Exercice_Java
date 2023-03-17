public class Exercice4 {
    public static void main(String[] args) {
        int nbr1 = Outils.demandeInt("Entrez la première valeur");
        int nbr2 = Outils.demandeInt("Entrez la seconde valeur");
        int nbr3 = Outils.demandeInt("Entrez la troisième valeur ");

        if (nbr1 > nbr2 && nbr1 > nbr3 ){
            System.out.println("["+nbr1+","+nbr2+","+nbr3+"]"+"-->"+nbr1);
        }else if (nbr2 > nbr1 && nbr2 > nbr3){
            System.out.println("["+nbr1+","+nbr2+","+nbr3+"]"+"-->"+nbr2);
        }else {
            System.out.println("["+nbr1+","+nbr2+","+nbr3+"]"+"-->"+nbr3);
        }
    }
}
