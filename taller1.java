import java.io.*;

/*Thread.sleep(5000);
System.out.print("\033[H\033[2J");
System.out.flush();*/

public class taller1{

    public static void main(String[] args) throws IOException{
        
        int var1=0;
        int var2=0;
        int x=0;

        BufferedReader libro = new BufferedReader(new InputStreamReader(System.in));

        while(x==0){

            try{

                System.out.println("Ingrese el primer numero");
                var1= Integer.parseInt(libro.readLine());
    
                System.out.println("Ingrese el segundo numero");
                var2= Integer.parseInt(libro.readLine());
    
                int resultado = var1+var2;
                System.out.println("La suma es: "+resultado);
                x=1;
    
            } catch(Exception e){
    
                System.out.println("***********Error 1***********\n\nIngrese un valor en numeros no en letras\n\n");
                x=0;
            
            }

        }
        
    }

}