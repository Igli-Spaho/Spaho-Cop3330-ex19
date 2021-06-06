//UCF COP3330 Summer 2021 Assignment 19 Solution
// *  Copyright 2021 Igli Spaho

//You’ll often need to see if one value is within a certain range and alter the flow of a program as a result.
//
//Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds. The program should prompt the user for weight and height.
//
//Calculate the BMI by using the following formula:
//
//bmi = (weight / (height × height)) * 703
//If the BMI is between 18.5 and 25, display that the person is at a normal weight. If they are out of that range, tell them if they are underweight or overweight and tell them to consult their doctor.
//
//Example Output
//Your BMI is 19.5.
//You are within the ideal weight range.
//or
//
//Your BMI is 32.5.
//You are overweight. You should see your doctor.
//Constraint
//Ensure your program takes only numeric data. Don’t let the user continue unless the data is valid.




import java.util.Scanner;

public class App {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("What is your height?");
        double height = in.nextDouble();

        System.out.print("What is your weight?");
        double weight = in.nextDouble();

        Double BMI = (weight/(height*height))* 703;

        System.out.println(String.format("%.1f",BMI));

        if(BMI <18.5){
            System.out.print("You are underweight.You should see a doctor.");
        }else if (BMI<25){
            System.out.print("You are the idea weight.");
        }else if (BMI<30){
            System.out.print("You are overweight.You should see a doctor ");
        }else{
            System.out.print("You are overweight.Go see a doctor ");
        }


    }
}
