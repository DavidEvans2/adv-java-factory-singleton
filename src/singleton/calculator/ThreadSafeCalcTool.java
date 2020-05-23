package singleton.calculator;

public class ThreadSafeCalcTool extends Thread {
    private static int totalBMI = 0;
    private static int numberCalculations = 0;

    public static double BMICalculator(double weight, double height, MeasurementSystem measurementSystem){
        double BMI = weight/Math.pow(height, 2);
        if(measurementSystem == MeasurementSystem.ENGLISH){
            BMI *= 703;
        }
        totalBMI += BMI;
        numberCalculations ++;
        return BMI;
    }
    public void bmiAverage(){
        start();
    }
    @Override
    public void start(){
        EnumCalcTool enumCalc = EnumCalcTool.Instance;
        double averageBMI = (totalBMI/numberCalculations);
        System.out.println(averageBMI);
    }
}
