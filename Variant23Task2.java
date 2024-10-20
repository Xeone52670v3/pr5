import java.util.Scanner;
public class Variant23Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        double f_x = Math.pow(a, 2) - Math.pow(b, 2) + 2 * a * b;
        System.out.println("Calculated f(x): " + f_x);
        scanner.close();
    }
}
