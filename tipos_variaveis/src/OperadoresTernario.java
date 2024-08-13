import java.util.Scanner;

public class OperadoresTernario{
    public static void main(String[] args){
       Scanner entradaNota = new Scanner(System.in);

       System.out.print("Digite a nota do aluno: ");
       double notaAluno = entradaNota.nextDouble();

       double media = 6;

       String resultado = notaAluno < media ? "Aluno reprovou" : "Aluno passou";

       System.out.println(resultado);

       entradaNota.close();
    }
}