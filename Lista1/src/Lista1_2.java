import java.util.Scanner;

public class Lista1_2 {

    public static void main (String[] args) {
    //Coleta das informações
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o nome do produto: ");
        String produto = entrada.next();
        System.out.println("Insira a quantidade comprada: ");
        int quantidade = entrada.nextInt();
        System.out.println("Insira o preço unitario: ");
        float preco = entrada.nextFloat();
        System.out.println("Qual será a forma de pagamento? \n1-Pix\n2-Cartão\n3-Boleto");
        int fp = entrada.nextInt();
        String sfp;
        float pdsub = 0.0f;
        float sdsub = 0.0f;
        float total = 0.0f;
        float desconto = 0.0f;

        //Descobrir o subtotal
        float subtotal = quantidade*preco;

        //Aplicar desconto
        if (subtotal < 100.0){
            pdsub = subtotal*1;
            desconto = 0.0f;
        } 
        else if (subtotal >= 100.0 && subtotal < 300.0) {
            pdsub = (float) (subtotal - (subtotal*0.05));
            desconto = (float) ((float) subtotal*0.05);
        } else  {
            pdsub = (float) (subtotal - (subtotal*0.1));
            desconto = (float) ((float) subtotal*0.1);
        }

        //Aplicar ajuste
        if (fp == 1){
            total = (float) (pdsub - (pdsub*0.02));
            sdsub = (float) (pdsub*0.02);
            sfp = "Pix";
        }
        else if (fp == 2){
            total = (float) (pdsub + (pdsub*0.015));
            sdsub = (float) (pdsub*0.015);
            sfp = "Cartão";
        }
        else {
            total = (float) (pdsub*1);
            sdsub = (float) 0.0f;
            sfp = "Boleto";
        }
        System.out.println("Foram compradas "+quantidade+" unidades do produto "+produto+" que ficou no subtotal de R$ "+subtotal+" " +
                ",com o \ndesconto aplicado ficou em R$ "+desconto+", mais somado ao ajuste  forma de pagamento escolhida, \nque foi o "+sfp+
                ", dando um ajuste de R$ "+sdsub+", tendo o valor total final de R$ "+total+".");
    }
}
