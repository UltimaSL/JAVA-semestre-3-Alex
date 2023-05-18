import java.io.*;
import java.text.DecimalFormat;

//en repositorio de github
public class aaapruebas {
    public static void main(String[] args) throws Exception {

        boolean ciclo1 = true;
        float lado1;
        float lado2;
        float lado3;
        double perimetro;
        double area;

        DecimalFormat format1 = new DecimalFormat("#.00");
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        while (ciclo1) {
            try {
                System.out.println("que figura va a calcular?\n1.Triangulo\n2.Ciculo\n3.cuadrado\n4.Salir del programa");
                int option=Integer.parseInt(leer.readLine());
                
                if (option == 1){ // Calculos del p y a del triangulo
  
                while (ciclo1) {
                    //lectura de variables2
                    
                    lado1 = valor("Introduzca el lado 1");
                    lado2 = valor("Introduzca el lado 2");
                    lado3 = valor("Introduzca el lado 3");

                    //operaciones arimeticas 
                    perimetro = lado1 + lado2 + lado3;
                    area = Math.sqrt((perimetro / 2) * ((perimetro / 2) - lado1) * ((perimetro / 2) - lado2)* ((perimetro / 2) - lado3));

                    System.out.println("\n\nEl perimetro es: " + format1.format(perimetro) + "\nEl area es: " + format1.format(area)+"\n\n");

                    }
                }

                else if (option == 2) // Calculos del p y a del circulo
                {
                    //lectura de variables
                    lado1 = valor("Introduzca el radio");
                    //operaciones aritmeticas
                    perimetro = (2 * lado1) * Math.PI;
                    area = Math.PI * (lado1 * lado1);

                    System.out.println("\n\nEl perimetro es: " + format1.format(perimetro) + "\nEl area es: " + format1.format(area)+"\n\n");

                } else if (option == 3) // Calculos del p y a del rectangulo
                {
                    //lectura de variables
                    lado1 = valor("Introduzca la base");
                    System.out.println("");
                    lado2 = valor("Introduzca la altura");

                    //operaciones aritmeticas
                    perimetro = lado1 * 2 + lado2 * 2;
                    area = lado1 * lado2;

                    System.out.println("\n\nEl perimetro es: " + format1.format(perimetro) + "\nEl area es: " + format1.format(area)+"\n\n");

                }

                else if (option==4) {//salir del programa
                    System.out.println("\n\nSi desea salir del programa?\nIntroduzca EXIT\nCaso contrario pulse cualquier tecla\n\n");
                    String option2=leer.readLine();
                    if(option2.equals("EXIT")){
                    ciclo1=false;  
                    }
                }
            } catch (Exception e) {
                System.out.println("\nOpcion invalida\n");
            }
                

            } 
        }

    public static float valor(String mensaje) {//funcio para errores, solo se admiten numeros reales

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(mensaje);
            return Float.parseFloat(leer.readLine());
        } catch (Exception e) {
            System.out.println("\nIngrese un valor valido\n");
            return valor(mensaje);
        }
    }
}