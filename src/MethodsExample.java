
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class MethodsExample {

    /**
     * Says hello to the user
     */
    public static void sayHello(){
        System.out.println("Hello!");
    }
    
    /**
     * Say hello to a specified user
     * @param name the name of the user
     */
    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    
    /**
     * Calculates the volume of a cylinder
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     * @return the volume of the cylinder with given radius and height
     */
    public static double 
        volumeOfCylinder(double radius, double height){
        // calculate the volume
        double rSquared = Math.pow(radius, 2);
        double volume = Math.PI*rSquared*height; 
        
        return volume; // sends back the answer
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // calling the sayHello method
        String n = "Fred";
        
        sayHello();
        sayHello("Bob");
        sayHello(n);
        
        // radius = 10, height = 15
        double answer = volumeOfCylinder(10,15);
        System.out.println(answer);
        
        
    }
    
}
