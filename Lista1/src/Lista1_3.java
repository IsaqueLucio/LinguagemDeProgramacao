import java.util.Scanner;

public class Lista1_3 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o nome do(a) aluno(a): ");
        String nome = entrada.next();

        System.out.println("Insira a 1° nota do(a) aluno(a): ");
        float n1 = entrada.nextFloat();
        System.out.println("Insira a 2° nota do(a) aluno(a): ");
        float n2 = entrada.nextFloat();
        System.out.println("Insira a 3° nota do(a) aluno(a): ");
        float n3 = entrada.nextFloat();

        System.out.println("Insira o peso da 1° nota do(a) aluno(a): ");
        float p1 = entrada.nextFloat();
        System.out.println("Insira o peso da 2° nota do(a) aluno(a): ");
        float p2 = entrada.nextFloat();
        System.out.println("Insira o peso da 3° nota do(a) aluno(a): ");
        float p3 = entrada.nextFloat();

        float mp = ((n1*p1) + (n2*p2) + (n3*p3)) / (p1+p2+p3);

        if (mp >= 7){
            System.out.println("Nome do(a) aluno(a): "+nome+"\nMedia ponderada do(a) aluno(a): "+mp+
                    "\nSituação do(a) aluno(a): Aprovado! \nParabens!!!");
        } else if (mp>=4 && mp<7) {
            float nme = 10 - mp;
            System.out.println("Nome do(a) aluno(a): "+nome+"\nMedia ponderada do(a) aluno(a): "+mp+
                    "\nSituação do(a) aluno(a): Necessario exame! \nNota minima no exame para aprovação: "+nme+"\nBoa sorte!!");
        } else {
            System.out.println("Nome do(a) aluno(a): "+nome+"\nMedia ponderada do(a) aluno(a): "+mp+
                    "\nSituação do(a) aluno(a): Reprovado :( \nEstude mais!");
        }
    }
}
