import java.util.Scanner;

public class Exercise1 {
     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int digit;
        int i = 0;
        int numbers[] = new int[10];
         System.out.println("Input 10 numbers of your choice.");

        for (i = 0; i<10; i++){
            System.out.println("Input the "+(i+1)+"º number: ");
            numbers[i] = input.nextInt();
        }
         for (i = 0; i<10; i++) {
             System.out.println((i+1)+"° Number: "+numbers[i]);
         }

    }
}
