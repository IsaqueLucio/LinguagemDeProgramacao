import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){

        int n, i, div;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero inteiro e positivo desejado: ");
        n = sc.nextInt();
        div = 0;
        for (i=1; i<=n; i++){
            if(n % i == 0){
                div++;
            }
        }
        if(div == 2){
            System.out.println("O numero informado é um numero primo.");
        } else{
            System.out.println("O numero informado não é um numero primo.");
        }
    }
}
