import java.util.Random;

public class dowhile {

   private static int numeroTentativas=0;
    public static void main(String[] args) {
        System.out.println("Discando..."); 
        do { 
            System.out.println("telefone tocando");
        }while(tocando());
                System.out.println(" alo !!");
    }
    private static boolean tocando() {        boolean atendeu = new Random().nextInt(5)==1;
                            numeroTentativas++;
                            if(numeroTentativas>5)
                            numeroTentativas=0;
                System.out.println("Atendeu? " + atendeu);
               if(numeroTentativas>=5)
               return false;
            else
            return !atendeu;    
               
        }
          
            }


