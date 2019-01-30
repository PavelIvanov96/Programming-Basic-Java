import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class s04_Tailoring_Workshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int table = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double areaCovers = table * (length + 2 * 0.30) * (width + 2 * 0.30);
        double areaSquares = table * (length / 2 ) * (length / 2);

        double priceUsd = areaCovers * 7 + areaSquares * 9;
        double priceBgn = priceUsd * 1.85;

        System.out.printf("%.2f USD%n", priceUsd);
        System.out.printf("%.2f BGN", priceBgn);
    }
}
