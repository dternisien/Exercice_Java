public class justePrix {
    public static void main(String[] args) {
        int compteur = 10;
        int nombre_attendu = 25;
        while (compteur > 0){
            double nombre = Outils.demandeDouble("Choississez un nombre");
            if (nombre_attendu == nombre){
                System.out.println("Vous avez trouvé le nombre qui étais : "+nombre_attendu);
                compteur = 0;
            }else if(nombre < nombre_attendu){
                System.out.println("C'est plus ");
                compteur -= 1;
            }else if (nombre > nombre_attendu){
                System.out.println("C'est moin");
                compteur -= 1;
            }else {
                System.out.println("Nombre entré invalide !");
            }
            System.out.println("Il vous reste "+compteur +" chance ");
        }
    }
}
