import java.io.*;
import java.text.DecimalFormat;
//en repositorio de github
public class taller2menu {
    public static void main(String[] args) throws Exception, ArithmeticException{
        
        boolean ciclo1=true;
        double perimetro;
        double area;
        
        DecimalFormat format1=new DecimalFormat("#.00");
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

            try {//ciclo para controlar el menu
                while(ciclo1){
                    //variables en en ciclo
                    boolean ciclo2=true;
                    float lado1=0;
                    float lado2=0;
                    float lado3=0;

                    System.out.println("que figura va a calcular?\n1.Triangulo\n2.Ciculo\n3.cuadrado\n4.Salir del programa");
                    int option=Integer.parseInt(leer.readLine());
                    if (option==1) {//Calculos del p y a del triangulo

                        while(ciclo2){//ciclo para triangulo
                            try {
                                //lectura de los lados
                                if (lado1==0 && lado2==0 && lado3==0) {
                                System.out.println("Introduzca el primer lado");
                                lado1=Float.parseFloat(leer.readLine());
                                System.out.println("Introduzca el segundo lado");
                                lado2=Float.parseFloat(leer.readLine());
                                System.out.println("Introduzca el tercer lado");
                                lado3=Float.parseFloat(leer.readLine());
                                }
                                else if (lado1!=0 && lado2==0 && lado3==0) {
                                System.out.println("Introduzca el segundo lado");
                                lado2=Float.parseFloat(leer.readLine());
                                System.out.println("Introduzca el tercer lado");
                                lado3=Float.parseFloat(leer.readLine());
                                }
                                else if (lado1!=0 && lado2!=0 && lado3==0) {
                                System.out.println("Introduzca el tercer lado");
                                lado3=Float.parseFloat(leer.readLine());
                                }
                                //fin de lectura 

                                perimetro=lado1+lado2+lado3;    
                                area = Math.sqrt((perimetro/2)*((perimetro/2)-lado1)*((perimetro/2)-lado2)*((perimetro/2)-lado3));   
                                
                                System.out.println("El perimetro es:"+format1.format(perimetro)+"\nEl area es:"+format1.format(area)+"\n\n");
                                ciclo2=false; 
                            
                                 
                                } catch (Exception e ) {//recoger los posibles errores(solo se atmiten numeros enteros)
        
                                    if(lado1==0){
                                        System.out.println("***Error no se a ingresado un numero o el valor ingresado fue cero en el lado 1***");
                                    }
                                    else if(lado2==0){
                                        System.out.println("***Error no se a ingresado un numero o el valor ingresado fue cero en el lado 2***");
                                    }
                                    else if(lado3==0){
                                        System.out.println("***Error no se a ingresado un numero o el valor ingresado fue cero en el lado 3***");
                                    }
                                    
                                    // TODO: handle exception

                                }
                                
                            
                        }//finish loop triangles
                        
                    }//finish if opcion1(triangulo)

                    else if(option==2){//Calculos del p y a del circulo
                        while (ciclo2) {
                            try {
                                System.out.println("Introduzca el radio");
                                lado1=Float.parseFloat(leer.readLine());
                                perimetro=(2*lado1)*Math.PI;
                                area=Math.PI*(lado1*lado1);

                                System.out.println("El perimetro es:"+format1.format(perimetro)+"\nEl area es:"+format1.format(area));
                                ciclo2=false;
                                
                            } catch (Exception e) {
                                // TODO: handle exception
                            }
                            
                        }
                        
                    }
                    else if(option==3){//Calculos del p y a del cuadrado
                        System.out.println("Introduzca la base");
                        lado1=Float.parseFloat(leer.readLine());
                        System.out.println("Introduzca la altura");
                        lado2=Float.parseFloat(leer.readLine());
                        perimetro=lado1*2+lado2*2;
                        area=lado1*lado2;

                        System.out.println("El perimetro es:"+format1.format(perimetro)+"\nEl area es:"+format1.format(area));
                        ciclo2=false;
                    }
                    else if (option==4) {
                        System.out.println("Si desea salir del programa?\nIntroduzca EXIT\nCaso contrario pulse cualquier tecla");
                        String option2=leer.readLine();
                        if(option2.equals("EXIT"))//salir del programa
                        ciclo1=false;  
                    }
                    
                }

                
            } catch (Exception e) {
                // TODO: handle exception
            }
        
    }
    
}