public class Exercice3 {
    public static void main(String[] args) {
        double prixVente = Outils.demandeDouble("Entrez le prix de vente ");
        double prixFabrication = Outils.demandeDouble("Entrez le prix de Fabrication");

        if (prixVente > prixFabrication){
            double benefice = prixVente - prixFabrication;
            System.out.println("Profit de " + benefice + " Euros ");
        }else{
            double deficite = prixFabrication - prixVente;
            System.out.println("Perte de " + deficite +" Euros ");
        }
    }
}
