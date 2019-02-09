import java.util.Scanner;

public class S06_Three_Brothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstBrother = Double.parseDouble(scanner.nextLine());
        double secondBrother = Double.parseDouble(scanner.nextLine());
        double thirdBrother = Double.parseDouble(scanner.nextLine());
        double fatherTime = Double.parseDouble(scanner.nextLine());

        double sumOfTime = (1 / (1 / firstBrother + 1 / secondBrother + 1 / thirdBrother)) * 1.15;
        double leftTime = Math.floor(fatherTime - sumOfTime);

        System.out.printf("Cleaning time: %.2f\r\n", sumOfTime);
        if (leftTime >= 0){
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", leftTime);
        } else{
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.abs(leftTime));
        }

    }
}
