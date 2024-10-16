/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio001;

/**
 *
 * @author 20241070130004
 */
/*Os motoristas se preocupam com a quilometragem obtida
por seus automóveis. Um motorista monitorou vários
tanques cheios de gasolina registrando a quilometragem
dirigida e a quantidade de combustível em litros utilizados
para cada tanque cheio. Desenvolva um aplicativo Java que
receba como entrada os quilômetros dirigidos e os litros de
gasolina consumidos (ambos como inteiros) para cada
tanque cheio. O programa deve calcular e exibir o consumo
em quilômetros/litro para cada tanque cheio e imprimir a
quilometragem combinada e a soma total de litros de
combustível consumidos até esse ponto. Todos os cálculos
de média devem produzir resultados de ponto flutuante.
Utilize a classe Scanner e repetição controlada por sentinela
para obter os dados do usuário.*/


import java.util.Scanner;
public class Exercicio001 {

    public static void main(String[] args) {
        int quilometragem;
        int gasolinaConsumida ;
       /*peço ao usuario que digite a quilometragem e a quantidade de gasolina consumida */
        int mediaTanqueCheio;
        int quilometragemcombinada; 
        int gasolinaTotal;
        /*defino variaveis utilizadas mais a frente */
        int somaTotalLitros = 0;
        int quilometro = 0; 
        /*defino "contadores" para a quantidade tanto de litros percorridos quanto de gasolina a cada iteração */
        Scanner input = new Scanner(System.in);
        while (true){
            
            System.out.println("Digite a quilometragem percorrida:   "  );
            quilometragem = input.nextInt();
            
            System.out.println("Digite a quantidade de litros de gasolina consumidos ");
            gasolinaConsumida = input.nextInt();
            
            
            mediaTanqueCheio =  quilometragem / gasolinaConsumida;
            quilometragemcombinada = quilometro ;
            gasolinaTotal = somaTotalLitros;
            
            quilometro += quilometragem;
            somaTotalLitros += gasolinaConsumida;
           
            System.out.println("a quantidade de quilometros por tanque cheio e de :  ");
            System.out.println(mediaTanqueCheio);
            
           
            
           
            
            
            
            System.out.println("deseja continuar ? digite 1 para sim e 0 para não");
            int retorno = input.nextInt();
            
            if (retorno == 0 ){
                 break;
        }
                
        }
        System.out.println("a quilometragem conbinada e de : ");
        System.out.println(quilometragemcombinada); 
        
        System.out.println("o total de litros consumidos e de : ");
        System.out.println(somaTotalLitros);
    } 
}
