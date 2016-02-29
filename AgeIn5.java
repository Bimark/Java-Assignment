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
public class AgeIn5 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Hello. What is your name? ");
        name=input.nextLine();
        
        System.out.print("Hi, "+name+"! How old are you? ");
        age=input.nextInt();
        
        System.out.println("Did you know that in five years you will be "+(age+5)+" years old\n"
                + "And five years ago you were "+(age-5)+"! Imagine that!");
        
    }
    
}
