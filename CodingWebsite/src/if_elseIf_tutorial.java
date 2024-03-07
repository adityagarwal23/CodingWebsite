import java.util.Scanner;

public class if_elseIf_tutorial {
    public static void main(String[] args) {
        //This file will focus mainly on how you are able to incorporate if-else, else if, and else statements
        /** 
            Remember when writing your program to use JavaDocs! In this tutorial, I will be taking user input of integers and comparing those
            values.
        **/
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the first number?");
        int firstNumber = userInput.nextInt();
        System.out.println("What is the second number?");
        int secondNumber = userInput.nextInt();
        if(firstNumber>secondNumber)
        {
            System.out.println("First is bigger then the second!");
        }
        else if(secondNumber>firstNumber)
        {
            System.out.println("Second is bigger then the first");
        }
        else
        {
            System.out.println("They are equal to each other!");
        }

    }
}
