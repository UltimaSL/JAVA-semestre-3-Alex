import java.io.*;

public class practice6 {

    public static void main(String[] args) throws Exception{
        
        boolean ciclo=true;

        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));

        while(ciclo){

            try {

            System.out.println("Ingrese un numero");
            int numero = Integer.parseInt(number.readLine());
            System.out.println("Los numeros primos son: ");

            for(int i=1; i<=numero; i++){
                boolean primos = true;

                for(int x=2; x<=i/2; x++){//apartir de aqui puede cambiar la variable "primos" a "false"
                    if(i % x==0){//verifica los números que dividen el numero
                        primos=false;
                        break;
                    }
                }

                if (primos){// si primos sigue siendo cierto:
                    System.out.println(i);
                }
                ciclo=false;

            }//fin for1 loop
                
            } catch (Exception e) {
                System.out.println("***Error 117***\n\n");
            }
            
        }// fin while loop
      
    }  
}
