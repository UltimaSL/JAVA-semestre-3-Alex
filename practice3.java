import java.io.*;

public class practice3 {

    public static void main(String[] args) throws IOException{

        //declaracion variables 

        float lado1;
        float lado2;
        float lado3;
        float perimetro;
        double area;
        
        boolean ciclo= true;

        BufferedReader lados = new BufferedReader(new InputStreamReader(System.in));

        while(ciclo){

            try {
            
                    System.out.println("Introduzca el primer cateto");
                    lado1=Float.parseFloat(lados.readLine());
                    System.out.println("Introduzca el segundo cateto");
                    lado2=Float.parseFloat(lados.readLine());
                    System.out.println("Introduzca el tercer cateto");
                    lado3=Float.parseFloat(lados.readLine());

                    perimetro= lado1+lado2+lado3;
                    
                    area = Math.sqrt((perimetro/2)*((perimetro/2)-lado1)*((perimetro/2)-lado2)*((perimetro/2)-lado3));
                    
                    System.out.println("El perimetro del triangulo es: "+perimetro +"\nEl area del traingulo es: "+area);
                
                
                ciclo=false;
    
            } catch (Exception e) {
                System.out.println("Error 203 numero invalido.");
            }

        }//fin ciclo

    }
}
