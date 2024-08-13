
import java.util.Scanner;

public class Metodos {
    public static void main(String[] args){
        SmartTV();
    }

    public static void SmartTV(){
        Scanner entrada = new Scanner(System.in);  


        boolean ligado = true;
        boolean desligado = false;

        if(ligado){
            System.out.println("Tv ligou");
        }else if (desligado) {
            System.out.println("tv desligou");
        }

        System.out.print("pressione o numero do canal : ");
           int canal = entrada.nextInt();

           System.out.println("você trocou de canal " + canal);

        

         
               for(int i = 0; i < 100; i++) {
               
                System.out.print("pressione a tecla 1 para aumentar o volume e a tecla 2 para diminuir o volume:  ");
                int volumedatv = entrada.nextInt();
               if (volumedatv == 1) {
                 System.out.println("Volume da tv aumentou: " + i);
               }else{
                    System.out.println("Ocorreu um erro"); 
               }
            }
             for(int i = 100; i < 100;i--) {
                System.out.print("pressione a tecla 2 para diminuir  ");
                int volumedatv = entrada.nextInt();

                    if(volumedatv == 2){
                        System.out.println("Volume da tv diminuiu " + i);
                    }else{
                        System.out.println("Ocorreu um erro");
                    }
            }
           }

        

        


    }

