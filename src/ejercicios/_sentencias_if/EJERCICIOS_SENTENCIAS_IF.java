/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios._sentencias_if;

import java.util.Scanner;

/**
 *
 * @author FELIX LARRAGA
 */
public class EJERCICIOS_SENTENCIAS_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //1.- Lea dos números e indique cuál es el mayor de ambos
        System.out.println("JERCICIO1");
   int num1=40, num2=20;
        if (num1>num2) {
            System.out.println("1.El numero mayor es: "+num1);
        }
        if (num2>num1) {
            System.out.println("1.El numero mayor es: "+num2);
            
            
        }

        
        //2.- Lea dos números e indique cuál es el mayor y cuál es el menor de ambos.
        //EJERCICIO2
        System.out.println("EJERCICIO2");
         int nume1=500, nume2=100;
          if (nume1<nume2) {
              System.out.println("2.El numero mayor es: "+nume2);
              System.out.println("2.El numero menor es: "+nume1);
          }else{
                      System.out.println("2.El numero mayor es: "+nume1);
                      System.out.println("2.El numero menor es: "+nume2);
                      }
          
          
          
          
          //3.- Lea dos números e indique cuál es el mayor, cuál es el menor y en su caso decir si son iguales.
          //EJERCICIO3
          System.out.println("EJERCICIO3");
       int numero1=500, numero2=500;
        if ( numero1<numero2 && numero1 != numero2 ) {
              System.out.println("3.El numero mayor es: "+numero2);
              System.out.println("3.El numero menor es: "+numero1);
          }
        if (numero1>numero2 && numero1!= numero2) {
            System.out.println("3.El numero mayor es: "+numero1);
                      System.out.println("3.El numero menor es: "+numero2);
        }
        if (numero1==numero2) {
            System.out.println("3.Los numeros son iguales");
        }
        
        
        
       // 4.- Escriba un programa que con base al año actual y lea un año cualquiera y que escriba cuántos años han pasado desde ese año o cuántos años faltan para llegar a ese año
       //EJERCICIO4
        System.out.println("EJERCICIO4");
                int añoact=2021;
        int añoant=1899;
        int resta;
        resta=añoact-añoant;

        System.out.println("4.Desde "+añoant + " hasta "+añoact+" han pasado "+resta+" año");
       
       
    
        
        
        //5.- En este reto deberás programar un código que solicite al usuario que introduzca un número, lo asigne a una variable, compruebe si el número es positivo (mayor o igual que cero) en cuyo caso imprimirá por la consola el mensaje "Es positivo", en caso contrario imprimirá el mensaje "Es negativo".
        //EJERCICIO5
        System.out.println("EJERCICIO5");
        Scanner teclado = new Scanner (System.in);
        int numero;
        System.out.println("5.Ingrese un numero:");
        numero=teclado.nextInt();
        if (numero>0 && numero!=0) {
            System.out.println("5.El numero es positivo");
        }
        if (numero<0 && numero!=0) {
            System.out.println("5.El numero es negativo");
        }
        if (numero==0) {
            System.out.println("5.El numero es cero");
        }
        
        
        //6.- Compruebe si el número  tecleado tiene dos cifras (números comprendidos entre 10 y 99) en cuyo caso imprimirá por la consola el mensaje "Tiene dos cifras", en caso contrario imprimirá el mensaje "Distinto de dos cifras". 
        //EJERCICIO6
          System.out.println("EJERCICIO6");
        int numer;
        System.out.println("6.Ingrese un numero: ");
        numer=teclado.nextInt();
        if (numer<10 && numer>0) {
            System.out.println("6.El numero es distinto de dos cifra");
        }
        if (numer<=99 && numer>=10) {
            System.out.println("6.El numero tiene dos cifras");
        }
    }
        
        
    }


    
    

    



