package exercises;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        Integer length = input.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        Integer width = input.nextInt();
        int area = length * width;
        System.out.println("Your rectangle has an area of: " + area);
    }
}
