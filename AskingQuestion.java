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
public class AskingQuestion {
      public static void main(String []args)
    {
        Scanner input= new Scanner(System.in);
        int age,feet,inches;
        double weight;
    
        System.out.print("How old are you? ");
        age = input.nextInt();
        
        System.out.print("How feet tall are you? ");
        feet = input.nextInt();
        
        System.out.print("And how many inches ");
        inches=input.nextInt();
        
        System.out.print("How much do you weigh?  ");
        weight = input.nextDouble();
        
        System.out.print("So you're " + age +" old, "+ feet+"'"+inches+ "''" + "tall and " + weight +" heavy " );
    }
}