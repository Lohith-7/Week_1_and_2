package level2;
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base length of the triangle: ");
        float base = input.nextFloat();
        System.out.println("Enter height of the triangle: ");
        float height = input.nextFloat();
        float areainsqcm = 0.5f * base * height;
        float areainsqin = 0.3937f * areainsqcm;
        System.out.println("The area of the triange in sq in is " + areainsqin + " and sq cm is " + areainsqcm);
        input.close();
    }
}
