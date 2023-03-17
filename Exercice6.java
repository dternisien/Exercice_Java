import java.util.Objects;

public class Exercice6 {
    public static void main(String[] args) {
        double nbr1 = Outils.demandeDouble("Entrez le première opérande ");
        String operateur = Outils.demande("Entrez l'opérateur [+,-,/,*]");
        double nbr2 = Outils.demandeDouble("Entrez le seconde opérande");


        if (Objects.equals(operateur, "+")){
            double resultat = nbr1+nbr2;
            System.out.println("["+nbr1+"'+'"+nbr2+"="+resultat);
        }else if (Objects.equals(operateur, "-")){
            double resultat = nbr1-nbr2;
            System.out.println("["+nbr1+"'-'"+nbr2+"="+resultat);
        }else if (Objects.equals(operateur, "/")){
            double resultat = nbr1/nbr2;
            System.out.println("["+nbr1+"'/'"+nbr2+"="+resultat);
        }else if (Objects.equals(operateur, "*")){
            double resultat = nbr1*nbr2;
            System.out.println("["+nbr1+"'*'"+nbr2+"="+resultat);
        }else {
            System.out.println("L'operateur n'est pas reconnu");
        }
    }
}
