import java.util.Arrays;

public class RollerCoster {
    public static void main(String[] args) {
        int nombre_place = 5;
        int nombre_tour = 3;
        int [] place = new int [] {2,3,5,4};
        int [] etat_file = place.clone();
        int taille = place.length;

        for (int i =0; i < nombre_tour; i++){
                boolean result = etat_file [0] + etat_file [1] <= nombre_place;
                int [] etat_file2 = new int[taille];
                if (result && i==0){
                    for (int j=0; j < taille - 2;j++){
                        etat_file[j] = place[j + 2];
                        for (int k=2; k < taille;k++){
                            etat_file[k] = place[j];
                            etat_file[taille-2] = place[0];
                        }
                    }
                    System.out.println("Tour "+i+" : Groupe 1 rentre ,Groupe 2 rentre "+ Arrays.toString(etat_file));
                }else if (i == 0 ){
                    for (int j=0; j < taille -1;j++){
                        etat_file[j] = place[j+1];
                        etat_file[taille-2] = place[0];
                    }
                    System.out.println("Tour "+i+" : Groupe 1 rentre" + Arrays.toString(etat_file));
                }
                else if (result ){
                    for (int j=0; j < taille - 2;j++){
                        etat_file2[j] = etat_file[j + 2];
                        for (int k=2; k < taille;k++){
                            etat_file2[k] = etat_file[j];
                            etat_file2[taille-2] = etat_file[0];
                        }
                    }
                    System.out.println("Tour "+ i +" : Groupe 1 rentre ,Groupe 2 rentre "+ Arrays.toString(etat_file2));
                }else {
                    for (int j=0; j < taille -1;j++){
                        etat_file2[j] = etat_file[j+1];
                        etat_file2[taille-2] = etat_file[0];
                    }
                    System.out.println("Tour "+ i +" : Groupe 1 rentre" + Arrays.toString(etat_file2));
                }
        }
    }

    public void rollercoster(){
        
    }

}
