/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasica;

/**
 *
 * @author BOHRKWAQ9CR
 */
import java.util.Scanner;
public class CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vali=1;

        int Num1;
        int Num2;
        int Suma;
        int Resta;
        int Multiplicación;
        int División;
        int Modulo;
        Scanner teclado= new Scanner(System.in);
       
       while(vali==1){
        System.out.println("Ingresa el Primer Número Entero;");
        Num1=teclado.nextInt();
        System.out.println("Ingrese el Segundo Número Entero");
        Num2=teclado.nextInt();
        Suma=Num1+Num2;
        Resta=Num1-Num2;
        Multiplicación=Num1*Num2;
        División=Num1/Num2;
        Modulo=Num1%Num2;
        System.out.println("El resultado de la suma es: " + Suma);
        System.out.println("El resultado de la resta es:" + Resta);
        System.out.println("El resultado de la multiplicación es:"+ Multiplicación);
        System.out.println("El resultado de la división es : "+División);
        System.out.println("El resultado del modulo es: " + Modulo);
        System.out.println("Si desea realizar otro calculo escriba ´1´de lo contrario escriba ´0´");
        vali = teclado.nextInt();

        
        
       }
    }
    
}
