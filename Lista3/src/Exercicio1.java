import java.util.Scanner;

public class Exercicio1 {

         public static void main(String[] args){
            int i, n, t;
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe o numero desejado para saber a sua tabuada: ");
            i = sc.nextInt();

            for (n = 1; n<=10; n++){
                System.out.println(i + " X " + n + " = " + i*n);
            }
        }
    }

