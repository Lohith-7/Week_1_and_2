package level3;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        float celsius = input.nextFloat();
        float fahrenheitResult = (celsius * 9/5) + 32;
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        input.close();
    }
}
