public class fizzbuzz {
    public static void main(String[] args) {
        int nombre = Outils.demandeInt("Entrez un nombre N");

        for (int i =1; i <= nombre ; i++){
            if (i % 15 == 0 ){
                System.out.println("fizzBuzz");
            }else if (i % 3 == 0 ){
                System.out.println("Fizz");
            }else if (i % 5 ==0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
