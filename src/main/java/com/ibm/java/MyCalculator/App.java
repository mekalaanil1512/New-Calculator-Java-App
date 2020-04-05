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
        		 
        int sum = num1 + num2 ; 
        System.out.println("The Sum of two numbers is : " +sum);
        
        int prod = num1*num2;
        System.out.println("The Product of two numbers is :" +prod);
        
        int div = num1/num2;
        System.out.println("The Divison of two numbers is:" +div);
        
        
    }
}
