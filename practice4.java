import java.io.*;

public class practice4 {

    public static void main(String[] args) throws IOException{

        int numeroCapturado;
        
        boolean ciclo= true;

        BufferedReader numero = new BufferedReader(new InputStreamReader(System.in));

        while(ciclo){

            try {
            
                System.out.println("Introduzca un numero entero");
                numeroCapturado=Integer.parseInt(numero.readLine());

                
                while(numeroCapturado%2==0){
                    
                    numeroCapturado = numeroCapturado/2;
                    System.out.println(numeroCapturado+"/2");
                    
                }
                while(numeroCapturado%3==0){
                    
                    numeroCapturado = numeroCapturado/3;
                    System.out.println(numeroCapturado+"/3");
                }
                while(numeroCapturado%5==0){
                    
                    numeroCapturado = numeroCapturado/5;
                    System.out.println(numeroCapturado+"/5");
                }

                ciclo=false;
    
            } catch (Exception e) {
                System.out.println("Error 203 numero invalido.");
            }

        }

    }
}
