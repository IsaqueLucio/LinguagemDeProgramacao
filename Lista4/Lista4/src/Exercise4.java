import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float studants[] = new float[10];
        int i;
        float total = 0;
        float avarege = 0f;
        int position =0;

        for(i=0;i<10;i++){
            System.out.println("Input the grade of the "+(i+1)+"° studant: ");
            studants[i] = input.nextFloat();
            total=total+studants[i];
        }
        avarege = total/10;
            System.out.println("\nThe avarege grade of the class is: "+avarege+"\n");
        for (i=0;i<10;i++){
            position = i;
            if (studants[i]>avarege){
                System.out.println("Student in the position "+position+" are above avarege grade.");
            }
        }
    }
}
