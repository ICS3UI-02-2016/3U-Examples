
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author lamon
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city called kitchener
        City kitchener = new City();
        
        // creating a robot
        Robot karel = new Robot(kitchener, 3, 2, Direction.EAST);
        
        
        new Thing(kitchener,3,3);
        new Wall(kitchener,3,3,Direction.EAST);
    }
    
}
