import java.util.Scanner;

public class s09_Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aquariumLength = Integer.parseInt(scanner.nextLine());
        int aquariumWeight = Integer.parseInt(scanner.nextLine());
        int aquariumHight = Integer.parseInt(scanner.nextLine());

        double percent = Double.parseDouble(scanner.nextLine());

        double volumeAquarium = aquariumLength * aquariumWeight * aquariumHight;
        double allLitres = volumeAquarium * 0.001;
        double percentage = percent * 0.01;

        double result = allLitres * (1 - percentage);

        System.out.printf("%.3f", result);
    }
}
