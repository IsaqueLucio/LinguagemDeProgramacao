import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o nome do(a) funcionario? ");
        String funcionario = entrada.next();
        System.out.println("Quantas horas o(a) "+ funcionario +" trabalhou? ");
        float horas = entrada.nextFloat();
        System.out.println("Quanto é a hora trabalhada do(a) "+ funcionario +"?");
        float vht = entrada.nextFloat();

        float salario = vht*horas;
        System.out.println("O(a) funcionario "+ funcionario + "trabalhou por "
                + horas +" ,portanto o seu salario foi de R$ "+ salario);
    }


}
