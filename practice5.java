import java.io.*;

public class practice5 {

    public static void main(String[] args) throws Exception{

        int i;
        boolean ciclo=true;
        
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        
        while(ciclo){

        try {

        System.out.println("introduzca un numero de 5 digitos");
        String cadenanumero = number.readLine();

        if(cadenanumero.length() == 5 && cadenanumero.matches("\\d+")){//valida si la variable es de 5 digitos

            for(i=0; i<=5; i++){

                System.out.println(cadenanumero.substring(0, i));
                }
                
            ciclo=false;
        }

        else{

            System.out.println("el numero ingresado no es valido\n");
            }

        } catch (Exception e) {

            System.out.println("No a ingresado un numero, porfabor intente denuevo\n");
            }

        }
    }    
}

