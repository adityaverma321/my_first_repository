import java.util.Scanner;
class Statistics{
    static double average(double[] values){
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return (double)sum / values.length;
    }
}
class StatisticsTest extends Statistics{
    public static void main(String[] args){
        double[][] values = new double[4][7];
        Scanner input = new Scanner(System.in);
        int k = 1;
        for(int i = 0; i < values.length; i++){
            for(int j = 0; j < values[i].length; j++){
                while(true){
                    System.out.print("Enter minimum temperature for day "+k+": ");
                    values[i][j] = input.nextDouble();
                    if(values[i][j] >= -30 && values[i][j] <= 50){    
                        k++;
                        break;
                    }
                    else{
                        System.out.println("Value of temperature should be between -30 and 50.");
                    }
                }
            }
        }
        input.close();
        System.out.println("Average minimum temperature for each week: ");
        for(int i = 0; i < values.length; i++){
            System.out.println("Week "+(i+1)+": "+average(values[i]));
        }
    }
}