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
public class HowOldAreYou {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        int age;
        String name;
        System.out.print("Hey, what's your name? ");
        name=input.nextLine();
        
        System.out.print("Ok, "+name+", how old are you? ");
        age=input.nextInt();
        
         if (age<16)
         {
           System.out.println("You can't drive "+name);
         }
         if (age<18)
         {
             System.out.println("You can't vote "+name);
         }
         if (age<25){
             System.out.println("You can't rent a car "+name);
         }
         if (age>25){
             System.out.println("You can do anything that's legal "+name);
         }
    }
    
}
