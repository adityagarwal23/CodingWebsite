import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Learning Object Oriented Programming!");
        Scanner input = new Scanner(System.in);
        System.out.println("In this tutorial, we are gaining User input to print out their name with a have a good day message. What is your name?");
        String UserName = input.nextLine();
        System.out.println("Hello " + UserName + ", Have a good day!");
        input.close();
    }
}