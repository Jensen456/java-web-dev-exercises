package exercises;
import java.util.Scanner;

public class MilesGallons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        Integer miles = input.nextInt();
        System.out.println("How many gallons has your car consumed: ");
        Integer gallons = input.nextInt();
        int mpg = miles / gallons;
        System.out.println("Your car is getting " + mpg + " miles per gallon");
    }
}
