import java.util.Scanner;

public class S05_Time_Plus_15_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int timeInMinutes = hours * 60 + minutes;

        int finalHour = (timeInMinutes + 15) / 60;
        int finalMinutes = (timeInMinutes + 15) % 60;
        if (finalHour == 24)
        {
            finalHour -= 24;
        }

        System.out.printf("%d:%02d", finalHour, finalMinutes);
    }
}
