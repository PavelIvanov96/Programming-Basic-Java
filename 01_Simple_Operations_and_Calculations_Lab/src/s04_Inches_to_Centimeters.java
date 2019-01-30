import java.util.Scanner;

public class s04_Inches_to_Centimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());
        double centimeteres = inches * 2.54;

        System.out.printf("%.2f", centimeteres);
    }
}
