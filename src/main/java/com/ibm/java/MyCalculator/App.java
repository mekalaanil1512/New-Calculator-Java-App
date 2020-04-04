package com.ibm.java.MyCalculator;

import java.util.Scanner;

/**
 * Java Calculator App
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num1 = var1.nextInt();
        
        Scanner var2 = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num2 = var2.nextInt();
        		
         
        int result = num1 + num2 ; 
        System.out.println("The Sum of two numbers is : " + result);
        
    }
}
