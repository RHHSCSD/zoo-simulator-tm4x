/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.lang.Math.*;

/**
 *
 * @author tangm
 */
public abstract  class Animal implements IEntity{
    
    private static int animals;
    private int id;
    private String name;
    private char sex; 
    private int age;
    private int x;
    private int y;
    private int size;
    private int speed;
    private double degrees;
    private int hunger;
    private int fatigue; 
    private Image image;
    private String sound;
    
    public void move(){
        System.out.println("movement");
        double rDegrees = Math.toRadians(degrees);
        x += Math.cos(rDegrees)*speed;
        y += Math.sin(rDegrees)*speed;
    }
    
    public void eat(){
        hunger = 100;
    }
    
    public void sleep(){
        fatigue = 100;
    }
    
    public void turn(double d){
        degrees += d;
    }
    
    public void place(int x1, int y1){
        x = x1;
        y = y1;
    }
}
