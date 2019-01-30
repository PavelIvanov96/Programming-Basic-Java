import java.util.Scanner;

public class s02_Radians_to_Degrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //градус = радиан * 180 / π
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;

        System.out.printf("%.0f", degrees);
    }
}
