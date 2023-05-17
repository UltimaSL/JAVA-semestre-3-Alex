import java.io.*;

public class practice2 {

    public static void main(String[] args) throws IOException{


        float lado1=0;
        float lado2=0;
        double lado3=0;
        int opcion;
        boolean ciclo= true;

        BufferedReader lados = new BufferedReader(new InputStreamReader(System.in));

        while(ciclo){

            try {
                System.out.println("Que desea calcular?\nPresione 1 si va a calcular la hipotenusa\nPresione 2 si va a calcular un cateto");
                opcion=Integer.parseInt(lados.readLine());

                if(opcion == 1){
                    System.out.println("Introduzca el primer cateto");
                    lado1=Float.parseFloat(lados.readLine());
                    System.out.println("Introduzca el segundo cateto");
                    lado2=Float.parseFloat(lados.readLine());

                    lado3 = Math.sqrt(lado1*lado1 + lado2 * lado2);
                    System.out.println("La hipotenusa es "+lado3);
                }else{
                    System.out.println("Introduzca el primer cateto");
                    lado1=Float.parseFloat(lados.readLine());
                    System.out.println("Introduzca la hipotenusa");
                    lado2=Float.parseFloat(lados.readLine());

                    lado3 = Math.sqrt((lado2*lado2) - (lado1*lado1));
                    System.out.println("El cateto faltante es "+lado3);
                }
                
               
                ciclo=false;
    
            } catch (Exception e) {
                System.out.println("Error 203 numero invalido.");
            }

        }

    }
}
