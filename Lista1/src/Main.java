import java.util.Scanner;

// todo programa Java começa definindo uma classe
public class Main {
    // definição da função main, executada quando o programa roda
    public static void main(String[] args) {
        // comando de saida - a função println pertence a classe system
        System.out.println("Hello world!");
        System.out.println("Bom dia!");

        // Java é fortemente tipado (float, char, int, double, boolean)
        char letra = 'A';
        float nota = 6.5f;
        int idade = 18;
        boolean resposta = true;
        String nome = "Juvenal";

        // exibe  os dados das variaveis para o usuario
        System.out.println("\nLetra:"+ letra + "\nNota:" + nota +
                "\nIdade:"+ idade + "\nReposta:"+ resposta +
                "\nNome:" + nome);

        // comando de entrada (usuario irá inserir os dados
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Digite outra nota: ");
        float nota2 = entrada.nextFloat();
        System.out.println("Digite o nome do aluno: ");
        String aluno = entrada.next();

        // calcula a soma das notas
        float soma  =  nota1 + nota2;
        float media =  soma/2;

        System.out.println("A media de nota do aluno " + aluno + " foi igual a: " + media);


    }
}