import java.util.Arrays;

public class Exercice12 {

    public static void main(String[] args) {
        triBulle();
    }
    public static void triBulle(){
        double[] nombres = new double[]{16, 52, 35, 96, 14, 84};
        double[] result = nombres.clone();
        boolean trier = false;
        while (!trier) {
            trier = true;
            for (int i = 1; i < result.length; i++) {
                if (result[i - 1] > result[i]) {
                    trier =false;
                    double temps = result[i];
                    result[i] = result[i - 1];
                    result[i-1] = temps;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
