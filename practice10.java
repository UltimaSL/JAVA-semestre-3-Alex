import java.io.*;

public class practice10 {

    public static void main(String[] args) throws Exception{

        boolean ciclo=true;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (ciclo) {

            System.out.println("introdusca la palabra secreta");
            String word = reader.readLine();
            //palabra secreta: salir

            if (word.equals("salir")){
                ciclo=false;
            }
            else{
                System.out.println("no es la palabra secreta");
            }
            
        }//fin de ciclo
        
    }
}
