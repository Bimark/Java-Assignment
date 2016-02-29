import java.util.Scanner;
//import java.lang.Math;
public class BMICalc {
    public static void main(String[]args){
        double heightm,heighti,heighti2,heightf,result1,result2,result3;
        int weight1,pound,pounds;
        Scanner input=new Scanner(System.in);
        System.out.print("Your height in meters(m): ");
        heightm=input.nextDouble();
        
        System.out.print("Your weight in kilogram(kg): ");
        weight1=input.nextInt();
        
        double keep=heightm*heightm;
        result1=weight1/keep;
        
        System.out.println("Your BMI is "+result1);
        
        
        System.out.print("Your height in inches: ");
        heighti=input.nextDouble();
        
        System.out.print("Your weight in pounds: ");
        pound=input.nextInt();
         
        double conv1,conv2,rem;
        conv1=heighti*0.0254;
        conv2=pound*0.453592;
        rem=conv1*conv1;
        result2=conv2/rem;
        System.out.println("Your BMI is "+result2);
        
        
        System.out.print("Your height (feet only): ");
        heightf=input.nextDouble();
        
        System.out.print("Your height (inches): ");
        heighti2=input.nextDouble();
        
        System.out.print("Your weight in pounds: ");
        pounds=input.nextInt();
        double inc,feet,pd;
        feet=heightf*0.3048;
        inc=heighti2*0.0254;
        double fb=feet+inc;
        double ans=fb*fb;
        pd=pounds*0.453592;
        result3=pd/ans;
        System.out.println("Your BMI is "+result3);
    }
    
}
