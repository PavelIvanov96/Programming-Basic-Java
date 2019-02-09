import java.util.Scanner;

public class S07_Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfSteps = Double.parseDouble(scanner.nextLine());
        double dancers = Double.parseDouble(scanner.nextLine());
        double daysForLearning = Double.parseDouble(scanner.nextLine());

        double procantageOfSteps = Math.ceil(((numberOfSteps / daysForLearning) / numberOfSteps) * 100);
        double procentageForDancer = (procantageOfSteps / dancers);

        if (procantageOfSteps < 13){
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", procentageForDancer);
        } else {
            System.out.printf("No, they will not succeed in that goal! Required %.2f%% steps to be learned per day.", procentageForDancer);
        }

    }
}
