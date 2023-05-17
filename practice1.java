import java.io.*;

public class practice1 {

    public static void main(String[] args) throws IOException{


        float gradosC=0;
        float gradosF=0;
        boolean ciclo= true;

        BufferedReader grados = new BufferedReader(new InputStreamReader(System.in));

        while(ciclo){

            try {
            
                System.out.println("Introduzca los grados a convertir");
                gradosC=Float.parseFloat(grados.readLine());
    
                gradosF=(gradosC*9/5)+32;
    
                System.out.println("Los grados en Fahrenheint "+ gradosF +"F°");

                ciclo=false;
    
            } catch (Exception e) {
                System.out.println("Error 203 numero invalido.");
            }

        }

    }
}
