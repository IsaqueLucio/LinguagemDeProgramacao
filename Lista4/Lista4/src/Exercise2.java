import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int first[] = new int[5];
        int second[] = new int[5];
        int i;

        for(i=0;i<5;i++){
            System.out.println("Input the number "+(i+1)+"/5:");
            first[i] = input.nextInt();
            second[i]= first[i]*2;
        }
        for(i=0;i<5;i++){
            System.out.println("Number on the first array: "+first[i]+
                    "\nNumber on the second array (double of the first): "+second[i]);
        }
    }
}
