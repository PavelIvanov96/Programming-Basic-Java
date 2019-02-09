import java.util.Scanner;

public class S08_World_Swimming_Record {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double range = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double ivanSwim = range * time;
        double addMoreSec = Math.floor((range / 15)) * 12.5;
        double sumTime = ivanSwim + addMoreSec;

        if (sumTime >= record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", sumTime - record);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", sumTime);
        }

    }
}
