
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamon
 */
public class InputOutputExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // asking the user to type in their name
        System.out.println("Please enter your name");
        // scanning in their name into a variable
        String name2 = input.nextLine();
        //String name = "Mr. Lamont";

        // saying hello to the user
        System.out.println("Hello " + name2);

        // ask the user what year they were born
        // use this to calculate their age
        System.out.println("What year were your born?");
        int year = input.nextInt();
        // determine their age
        int age = 2017 - year;
        if (age > 0) {
            System.out.println("You are " + age + " years old!");
        }else{
            System.out.println("I think you are lying....");
        }
        
        int quotient = 5/2;
        int remainder = 5%2;

    }

}
