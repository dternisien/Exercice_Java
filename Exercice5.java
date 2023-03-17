public class Exercice5 {
    public static void main(String[] args) {
        double note = Outils.demandeDouble("Note de l'élève");

        if ( note <= 4){
            System.out.println(note + " Catastrophique, il faut tout revoir");
        }else if (note >=5 && note <= 10){
            System.out.println(note + " Insuffisant");
        }else if (note >= 11 && note <= 14 ){
            System.out.println(note+" Peut mieux faire");
        }else if (note >= 15 && note <= 17){
            System.out.println(note+" Bien");
        }else if (note >= 18){
            System.out.println("Excellent, bon travail");
        }
    }
}
