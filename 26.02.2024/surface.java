import java.util.Scanner;

public class surface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();
        double surfaceArea = 10 * side * side;
        System.out.println("The surface area of the cube is: " + surfaceArea);
        scanner.close();
    }
}
