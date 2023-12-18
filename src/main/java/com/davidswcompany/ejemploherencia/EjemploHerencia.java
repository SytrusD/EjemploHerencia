/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.davidswcompany.ejemploherencia;
import java.util.Scanner;
/**
 *
 * @author labctr
 */
public class EjemploHerencia 
{

    public static void main(String[] args) 
    {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        double radio;
        radio=leer.nextDouble();
        //Crear un objeto de la clase Circulo
         Circulo circulo1=new Circulo(radio);
         
        //Imprimir elvalor del área
        System.out.println("El Área del Circulo es: "+ circulo1.CalcularArea());
        
        
        //Triangulo
        System.out.println("Ingrese el valor de la base");
        System.out.println("Ingrese el valor de la Altura");
        double base;
        double altura;
        base=leer.nextDouble();
        altura=leer.nextDouble();
        Triangulo triangulo1=new Triangulo(base, altura);
        System.out.println("El Área del Triangulo  es: "+ triangulo1.CalcularArea());
    }
    
    
}
