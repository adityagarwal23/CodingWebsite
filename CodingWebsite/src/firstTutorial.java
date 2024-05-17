import java.util.Scanner;

public class firstTutorial {
    public static void main(String[] args) {
        //For every file we have we will make sure that they are well commented to make sure
        //they are well understood.
        System.out.println("Welcome to Learning Object Oriented Programming!");
        //This input variable of type Scanner will be the variable that takes in user input.
        Scanner input = new Scanner(System.in);
        //When running the program, we will have to print out a message which is the line below. 
        System.out.println("In this tutorial, we are gaining User input to print out their name with a sweet message. What is your name?");
        //The next Variable of type String will go to the next line for the input. 
        String UserName = input.nextLine();
        //Once this has been initialized, it will print out "Hello + Variable + you are the coolest person."
        System.out.println("Hello " + UserName + ", You are the coolest person!");
        //Java does not know when you want to stop taking in variables, so here we would call the variable input with the method close. 
        input.close();
    }
}