public class Exercice11 {
    public static void main(String[] args) {
        double nombre = Outils.demandeDouble("Entrez un nombre decimal");
        int billet_500 = 0;
        int billet_200 = 0;
        int billet_20 = 0;
        int billet_10 = 0;
        int billet_5= 0;
        int piece_2 =0;
        int piece_05 =0;
        int piece_002 =0;
        int piece_001=0;
        double compteur = nombre;
        
        while (compteur > 0){

            if (compteur >= 500){
                compteur = compteur - 500;
                billet_500 += 1;
            }else if (compteur >= 200 && compteur <= 500 ){
                compteur = compteur - 200;
                billet_200 += 1;
            }else if (compteur >= 20 && compteur < 200){
                compteur -= 20;
                billet_20 +=1;
            }else if (compteur >= 10 && compteur < 20){
                compteur -= 10;
                billet_10 +=1 ;
            }else if (compteur >= 5 && compteur < 10){
                compteur -= 5;
                billet_5 +=1;
            }else if (compteur >= 2 && compteur < 5){
                compteur -= 2;
                piece_2 +=1;
            }else if (compteur >= 0.5 && compteur < 5){
                compteur -= 0.5;
                piece_05 +=1;
            }else if (compteur >= 0.02 && compteur < 0.5){
                compteur -= 0.02;
                piece_002 +=1;
            }else if (compteur >= 0.01 && compteur < 0.02){
                compteur -= 0.01;
                piece_001 +=1;
            }else {
                compteur = 0;
            }
        }
        System.out.println("Billet de 500 euros = "+billet_500);
        System.out.println("Billet de 200 euros = "+billet_200);
        System.out.println("Billet de 20 euros = "+billet_20);
        System.out.println("Billet de 10 euros = "+billet_10);
        System.out.println("Billet de 5 euros = "+billet_5);
        System.out.println("Pièce de 2 euros = "+piece_2);
        System.out.println("Pièce de 0.50 euros = "+piece_05);
        System.out.println("Pièce de 0.02 euros = "+piece_002);
        System.out.println("Pièce de 0.01 euros = "+piece_001);

    }
}
