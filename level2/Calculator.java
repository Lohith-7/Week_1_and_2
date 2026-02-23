package level2;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = input.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = input.nextFloat();

        float sum = num1 + num2;
        float diff = num1 - num2;
        float product = num1 * num2;
        double division = (double) num1 / num2;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + product);
        System.out.println("Division = " + division);
        input.close();
    }
}