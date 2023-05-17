import java.io.*;

public class practice7 {

    public static void main(String[] args) throws Exception{

        int prom;
        int[] num = new int[3];
        boolean ciclo=true;

        BufferedReader numero = new BufferedReader(new InputStreamReader(System.in));

        while(ciclo){

            System.out.println("Ingrese el primer numero");
            num[0] = Integer.parseInt(numero.readLine());

            System.out.println("Ingrese el segundo numero");
            num[1] = Integer.parseInt(numero.readLine());

            System.out.println("Ingrese el tercer numero");
            num[2] = Integer.parseInt(numero.readLine());
            
            try {

                for (int i = 0; i < num.length - 1; i++) {
                    int indiceMenor = i;
                    for (int j = i + 1; j < num.length; j++) {
                        if (num[j] < num[indiceMenor]) {
                            indiceMenor = j;
                        }
                    }
                    int temp = num[indiceMenor];
                    num[indiceMenor] = num[i];
                    num[i] = temp;
                }

                prom=(num[0]+num[1]+num[2])/num.length;

            System.out.println("El numero mayor es: "+num[2]+"\nEl numero menor es: "+num[0]+"\nEl promedio de los 3 numeros es: "+prom);
            ciclo=false;
            
            } catch (Exception e) {
                System.out.println("***Error 05-10***");
            }
        }
        
    }
    
}
