import java.util.Scanner;

public class s05_Trapeziod_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = Double.parseDouble(scanner.nextLine());
        double sideB = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = (sideA + sideB) * h / 2;

        System.out.printf("%.2f", area);
    }
}
