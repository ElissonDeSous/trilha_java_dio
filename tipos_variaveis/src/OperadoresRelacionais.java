
import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        /*
          == igual
          > maior
          < menor
          >= maior ou igual
          <= menor ou igual
          != diferente
         */

         String nome = "Elisson";
         String nome2 = "Eliss";

         if (nome.equals(nome2)) {
            System.out.println("Nomes iguais");
         }else{
            System.out.println("Nomes diferentes");
         }

        Scanner dados = new Scanner(System.in);

       
        System.out.print("Digite um numero: ");
        int numero1 = dados.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2= dados.nextInt();

        boolean simNao = numero1 == numero2;

        System.out.println("os numeros digitados são iguais? " + simNao);

        dados.close();
    }
}
