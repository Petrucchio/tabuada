package tabuada;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero,tabuada,resultado; 

        System.out.println("Bem vindo ao metodo de TABUADA"); 

        System.out.println("=================================="); 

        System.out.println("por favor indique o numero a ser feito a tabuada"); 

        System.out.println("digite o numero 0 para finalizar"); 

        numero=new Scanner (System.in).nextInt(); 

        while(numero!=0){ 

         

            System.out.println(); 

            for(int contador=1;contador<=10;contador++){ 

                resultado=numero*contador; 

                System.out.println(numero+"x"+contador+"="+resultado); 

             

            } 

            System.out.println("=================================="); 

            System.out.println("por favor indique o numero a ser feito a tabuada"); 

            System.out.println("digite o numero 0 para finalizar"); 

            numero=new Scanner (System.in).nextInt(); 

        } 

        System.out.println("===================================="); 

    System.out.println("programa finalizado"); 

    System.out.println("========================================="); 

    } 
	}


