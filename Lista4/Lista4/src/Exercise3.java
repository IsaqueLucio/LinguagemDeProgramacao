import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numbers[] = new int[8];
        int i, biggest, lowest, bigpo, lowpo;

        for (i = 0; i < 8; i++) {
            System.out.println("Input the " + (i + 1) + "° number: ");
            numbers[i] = input.nextInt();
        }

        biggest = numbers[0];
        lowest = numbers[0];
        lowpo = 0;
        bigpo = 0;

        for (i = 1; i < 8; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
                bigpo = i;
            } else if (numbers[i] < lowest) {
                lowest = numbers[i];
                lowpo = i;
            }
        }
        System.out.println("The biggest valour is: " + biggest +
                "\nPosition in the array: " + bigpo + "\nThe lowest valour is: " + lowest +
                "\nPosition in the array: " + lowpo);
    }
}
