public class ExerciceTemperature {
    public static void main(String[] args) {
            double [] data = new double[]{2,6,7,2,9,-15,-5,5};
            double[] result = data.clone();
            boolean trier = false;

            while (!trier) {
                trier = true;
                for (int i = 0; i < data.length; i++) {
                    if (result[i - 1] > result[i]) {
                        trier = false;
                        double temps = result[i];
                        result[i] = result[i - 1];
                        result[i-1] = temps;
                    }
                }
            }
    }
}
