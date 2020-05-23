package singleton.calculator;

public enum EnumCalcTool {
    Instance;
    private static int totalBMI = 0;
    private static int numberCalculations = 0;
    EnumCalcTool(){
        try{
            Thread.currentThread().sleep(2000);
        }catch (InterruptedException ie){
        }
    }
    public static double BMICalculator (double weight, double height, MeasurementSystem measurementSystem){
        double BMI = weight/Math.pow(height, 2);
        if (measurementSystem == MeasurementSystem.ENGLISH){
            BMI *= 703;
        }
        totalBMI += BMI;
        numberCalculations++;
        return BMI;
    }
    public static double bmiAverage(){
        return totalBMI/numberCalculations;
    }
}
