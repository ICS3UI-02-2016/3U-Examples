
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
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();
        // Create a Robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        
        // put up a wall
        new Wall(kw, 1, 5, Direction.EAST);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        
       new Thing(kw, 0, 1);
        
       // ask the robot if the front is clear
        while(karel.frontIsClear()){
            // move and turn left
            karel.move();
            karel.turnLeft();
            // if there is something to pick up
            while(karel.canPickThing()){
                // pick up everything
                karel.pickThing();
            }
        }
        
        
        
    }
    
}
