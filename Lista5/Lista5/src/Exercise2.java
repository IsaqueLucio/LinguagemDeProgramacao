import java.util.Scanner;

public class Exercise2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int mat[][] = new int[3][3];
        int soma = 0;
        for(int i=0;i<mat.length;i++){
            System.out.println("Input the valour of the "+(i+1)+"° line: ");
            for(int j=0;j<mat[i].length;j++){
                System.out.println("Input the valour of the "+(j+1)+"° column: ");
                mat[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<mat.length;i++){
            soma = 0;
            for(int j=0;j<mat[i].length;j++) {
                soma = soma + mat[i][j];
            }
            System.out.println("The result of sum in the "+(i+1)+"° line is "+soma);
        }

    }
}
