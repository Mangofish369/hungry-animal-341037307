

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("sounds/elephantcub.mp3");

    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 

    {
        GreenfootSound elephantSound = new GreenfootSound("sounds/elephantcub.mp3");
        elephantSound.play();
        // Add your action code here.
        if (Greenfoot.isKeyDown("d")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("a")) {
            move(-5);
        }
        eat();
        if (Greenfoot.isKeyDown("z")) {
            setLocation(100, getY());
            
            
        }
        else if (Greenfoot.isKeyDown("x")) {
            setLocation(200, getY());
        }
        else if (Greenfoot.isKeyDown("c")) {
            setLocation(300, getY());
        }
        else if (Greenfoot.isKeyDown("v")) {
            setLocation(400, getY());
        }
        else
        {
            //setLocation(600, getY());
        }
        //
        
        
    }    

    public void eat()
    {
        if (isTouching(Apple.class)){
            removeTouching(Apple.class);
            
            MyWorld world = (MyWorld) getWorld();
            world.spawnApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
