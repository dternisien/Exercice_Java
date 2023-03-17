public class Exercice7 {
    public static void main(String[] args) {
        int n = Outils.demandeInt("Chosissez un Nombre N ");
        int result = 0;

        for (int i = 0; i <= n; i++){
            if (i == n ){
                System.out.print(i);
                result += i;
            }else {
                System.out.print(i);
                System.out.print("+");
                result += i;
            }
        }
        System.out.println("="+result);
    }
}
