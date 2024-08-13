public class OperadoresLogicos {
    public static void main(String[] args) {
        /*
         operadores logicos

         || ou
         && E 
         */

         boolean condicao1 = true;
         boolean condicao2 = false;

         if(condicao1 && condicao2){
               System.out.println("Condição as duas são verdadeiras");
         }
         if(condicao1 || condicao2){
               System.out.println("uma das condições são verdadeiras");
         }
    }
}
