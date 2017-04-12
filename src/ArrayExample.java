
import java.util.Arrays;
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
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner for user input
        Scanner input = new Scanner(System.in);
        
        // create a list of 5 numbers
        double[] marks = new double[5];
        
        // scan in some marks
        System.out.println("Please enter in 5 marks");
//        // THIS IS A BAD WAY TO DO THIS....
//        // put a number in the first position
//        marks[0] = input.nextDouble();
//        // put a number in the second position
//        marks[1] = input.nextDouble();
//        // so on and so forth....
//        marks[2] = input.nextDouble();
//        marks[3] = input.nextDouble();
//        marks[4] = input.nextDouble();
        
        // BETTER WAY TO DO THIS - FOR LOOPS!
        for(int i = 0; i < marks.length; i++){
            marks[i] = input.nextDouble();
        }
        
        System.out.println("The numbers in your list are");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        
        // EXTRA - enhanced for loop
        for(double num:marks){
            System.out.println(num);
        }
        
        
        // use a for loop to determine the sum
        // start with an accumulator
        double sum = 0;
        // for loop to go through each number
        for(int i = 0; i < marks.length; i++){
            // add whatever number I'm on to sum
            sum = sum + marks[i];
        }
        System.out.println("");
        System.out.println("The sum is " + sum);
        
        // calculate average
        double avg = sum/marks.length;
        System.out.println("The average is " + avg);
    }
    
}
