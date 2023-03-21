public class ExerciceTemperature {
    public static void main(String[] args) {
        int [] temperatures = { 12,25,-7,6,5 };
        int lePlusProche = temperatures[0];

        for (int temperature:temperatures) {
            if (Math.abs(temperature) < Math.abs(lePlusProche)){
                lePlusProche = temperature;
            }else if (Math.abs(temperature) == Math.abs(lePlusProche) && temperature < 0){
                lePlusProche = temperature;
            }
        }
        System.out.println(lePlusProche);
    }
}
