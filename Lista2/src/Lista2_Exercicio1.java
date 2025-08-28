import java.util.Scanner;

public class Lista2_Exercicio1 {

    public static void main (String[] args){

        float tv = 0.0f;
        int qc = 0;
        float vc = 0.0f;

        while (vc >= 0){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o valor da compra (negativo para encerrar): ");
            vc = entrada.nextFloat();

            if(vc >= 0){
                tv = tv+vc;
                qc = qc+1;
            } else{
                System.out.println("Programa encerrado.");
            }
        }
        if(qc > 0) {
            float vm = tv / qc;
            System.out.println("Total de clientes: " + qc + "\nTotal de vendas: R$ " + tv + "\nMedia de valor gasto por cliente: R$ " + vm);
        }
    }
}
