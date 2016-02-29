import java.util.Scanner;
public class AgeMessages3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        String name;
        int age;
        System.out.print("Your name: ");
        name=input.nextLine();
        System.out.print("Your age: ");
        age=input.nextInt();
        if (age<16){
            System.out.println("You can't drive, "+name);
        }
        else if(age>=16 && age<=17){
            System.out.println("You can drive but not vote, "+name);
        }
        else if (age>=18 && age<=24){
            System.out.println("You can vote but not rant a car, "+name);
        }
        else if (age>=25){
            System.out.println("You can do pretty much anything, "+name);
        }
    }
    
}
