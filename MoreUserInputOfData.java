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
public class MoreUserInputOfData {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String fname,lname,login;
        int grade,id;
        double gpa;
        System.out.println("Please enter the following information so i can sell it for a profit ");
        System.out.print("First name: ");
        fname=input.nextLine();
        
        System.out.print("Last Name: ");
        lname=input.nextLine();
        
        System.out.print("Grade (9-12): ");
        grade=input.nextInt();
        
        System.out.print("Student ID: ");
        id=input.nextInt();
        
        System.out.print("Login: ");
        login=input.next();
        
        System.out.print("GPA(0.0-4.0): ");
        gpa=input.nextDouble();
        
        System.out.println("Your information");
        System.out.printf("\tLogin: "+ login+"\n");
        System.out.printf("\tID: "+id+"\n");
        System.out.printf("\tName: "+lname+", "+fname+"\n");
        System.out.printf("\tGPA: "+gpa+"\n");
        System.out.printf("\tGrade: "+grade+"\n");
    }
    
}
