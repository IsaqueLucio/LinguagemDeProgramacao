import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numbers[] = new int[15];
        int i;
        int num = 0;
        boolean search = false;

        for (i=0;i<15;i++){
            System.out.println("Input the number "+(i+1)+"/15: ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Input a random number: ");
        num = input.nextInt();

         for(i=0;i<15;i++){
             if(num == numbers[i]){
                 System.out.println("Number found in the position "+i);
                 search = true;
             }
             if(search == false){
                 System.out.println("Number not founded.");
             }
         }
    }
}
