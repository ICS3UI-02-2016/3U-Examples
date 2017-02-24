
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class CountedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city
        City kw = new City();
        // create a robot
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);
        
        // make a counter
        int counter = 0;
        // move 5 times using a condition
        while(counter < 5){
            // move
            karel.move();
            // increase the counter!
            counter = counter+1;
            //counter++; <- shortcut to add 1
            //counter += 1; <- another shortcut
        }
        
        karel.turnAround();
        
        // using a for loop to count
        // for(define a variable; condition to loop; change variable)
        for(int i = 0; i < 5; i++){
            karel.move();
        }
        
        
        // COMPOUND CONDITIONS
        //  &&  <- AND statement - both must be true
        //  ||  <- OR statement - one of them must be true
        if(karel.frontIsClear()){
            if(karel.countThingsInBackpack() == 5){
               // do something 
            }
        }
        
        if(karel.frontIsClear() && karel.countThingsInBackpack() == 5){
                // do something
        }
        
        
        if(karel.frontIsClear()){
            // do something
        }else if(karel.countThingsInBackpack() == 5){
            // do same thing as above if statement
        }
        
        if(karel.frontIsClear() || karel.countThingsInBackpack() == 5){
            // do something
        }
        
    }
    
}
