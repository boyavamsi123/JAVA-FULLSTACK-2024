import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of first diagonal: ");
        double d1 = scanner.nextDouble();
        System.out.print("Enter the length of second diagonal: ");
        double d2 = scanner.nextDouble();
        double area = (d1 * d2) / 2;
        System.out.println("The area of the rhombus is: " + area);
        scanner.close();
    }
}
