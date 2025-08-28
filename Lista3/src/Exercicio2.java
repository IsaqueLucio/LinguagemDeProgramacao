import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){
        int n, i, par;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero inteiro e positivo desejado: ");
        n = sc.nextInt();
        par = 0;
        for (i=1; i<=n; i++){
            if(i % 2 == 0){
                par = i + par;
            }
        }
        System.out.println("A soma dos numeros pares presentes entre 1 e "+n+" é igual a "+par);
    }
}
