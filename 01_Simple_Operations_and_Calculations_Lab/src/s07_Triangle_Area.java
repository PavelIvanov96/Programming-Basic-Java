import java.util.Scanner;

public class s07_Triangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double triangleSide = Double.parseDouble(scanner.nextLine());
        double triangleH = Double.parseDouble(scanner.nextLine());

        double area = triangleSide * triangleH / 2;

        System.out.printf("%.2f", area);
    }
}
