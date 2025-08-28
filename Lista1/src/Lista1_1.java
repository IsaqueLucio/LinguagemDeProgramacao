import java.util.Scanner;

public class Lista1_1 {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o nome do(a) paciente: ");
        String paciente = entrada.next();
        System.out.println("Insira o peso em KiloGrams da(a) paciente:");
        float peso = entrada.nextFloat();
        System.out.println("Insira a altura do(a) paciente: ");
        float altura = entrada.nextFloat();

        float IMC = peso/(altura*altura);

        if(IMC < 18.5){
            System.out.println("Paciente "+ paciente +" tem IMC = "+ IMC +"  e está classificado como abaixo do peso.");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("Paciente " + paciente + " tem IMC = " + IMC + "  e está classificado como peso normal.");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("Paciente "+ paciente +" tem IMC = "+ IMC +"  e está classificado como sobrepeso.");
        } else {
            System.out.println("Paciente "+ paciente +" tem IMC = "+ IMC +"  e está classificado como obeso.");
        }
    }
}

