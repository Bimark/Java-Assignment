/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimark
 */
import java.util.Scanner;
public class DumbCalculator {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double num1,num2,num3,result;
        System.out.print("What is your first number? ");
        num1=input.nextDouble();
        
        System.out.print("What is your second number? ");
        num2=input.nextDouble();
        
        System.out.print("What your third number? ");
        num3=input.nextDouble();
        result=(num1+num2+num3)/2;
        System.out.println("( "+num1+" + "+num2+" + "+num3+" ) "+"/2 "+" is.... "+result);
    }
    
}
