/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author 20241070130004
 */

import java.util.Scanner;
public class Mavenproject1 {
    
    public static void main(String[] args) {
       int contador = 1 ; 
       Scanner input = new Scanner(System.in); 
       while (true){
           int nota1;
           int nota2;
           int media;
          
           System.out.println("digite a nota que deseja : ");
           nota1 = input.nextInt();
           
           System.out.println("digite a nota que deseja : ");
           nota2= input.nextInt();
           
           media = (nota1 + nota2)  / 2 ;
           
           System.out.println("A media e : \n " + media);
          
          
           
            contador +=1 ;
           System.out.println("Deseja que o programa continue ?  (digite 0 para sim e 1 para nao ) ");
           int retorno = input.nextInt();
           if (retorno == 1 ){
               break;
           }
               
                
       }
    }
}
