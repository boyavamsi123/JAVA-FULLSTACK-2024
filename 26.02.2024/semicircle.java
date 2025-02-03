import java.util.Scanner;

public class semicircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the semi-circle: ");
        double radius = scanner.nextDouble();
        double area = (Math.PI * radius * radius) / 2;
        System.out.println("The area of the semi-circle is: " + area);
        scanner.close();
    }
}
