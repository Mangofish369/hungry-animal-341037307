

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
    SimpleTimer animTimer = new SimpleTimer();
    GreenfootImage[] idle = new GreenfootImage[8];

    public Elephant(){
        
	for (int i = 0; i < idle.length; i++)
	{
	    idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
	}
	setImage(idle[0]);
	animTimer.mark();
    }
    

    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 

    {
        GreenfootSound elephantSound = new GreenfootSound("sounds/elephantcub.mp3");
        elephantSound.play();
	GreenfootSound a = new GreenfootSound("sounds/elephantcub.mp3");
        a.play();
	GreenfootSound b= new GreenfootSound("sounds/elephantcub.mp3");
        b.play();
	GreenfootSound c= new GreenfootSound("sounds/elephantcub.mp3");
        c.play();
	GreenfootSound d= new GreenfootSound("sounds/elephantcub.mp3");
        d.play();
        // Add your action code here.
        if (Greenfoot.isKeyDown("d")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("a")) {
            move(-5);
        }
        
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
        
        eat();
	animate();
    }    

    /* 
     * Animates its default animation
     */

    int i = 0;
    public void animate()
    {
	// function here
	
        if (animTimer.millisElapsed() > 200)
        {
	    setImage(idle[i]);
	    i = (i + 1) % idle.length;
	    animTimer.mark();
	}
    }

    /* 
     * Elephant eats apple when it makes contact
     */
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
