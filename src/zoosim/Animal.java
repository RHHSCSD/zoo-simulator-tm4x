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
public abstract class Animal extends Object implements IEntity{
    
    private static int animals;
    private int id;
    private String name;
    private String species;
    private char sex; 
    private int age;
    private int size;
    private int speed;
    private int hunger;
    private int fatigue; 
    private String sound;
 
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    // name, species, sex, age, speed, weight
    public Animal(String a, String b, char c, int d, int e, int f){
        animals++;
        id = animals;
        name = a;
        species = b;
        sex = c;
        age = d;
        size = e;
        speed = f;
        hunger = 100;
        fatigue = 100;
        
    }
    
    //gets the angle of an animal and changes coordinates accordingly
    public void move(){
        System.out.println("movement");
        double rDegrees = Math.toRadians(degrees);
        x += Math.cos(rDegrees)*speed;
        y += Math.sin(rDegrees)*speed;
        
        fatigue -= size/speed/10;
        hunger -= 5;
    }
    
    //replenishes hunger
    public void eat(){
        hunger = 100;
    }
    
    //replenishes fatigue
    public void sleep(){
        fatigue = 100;
    }
    
    
    
    public void makeID(){
        animals = 
        id = animals;
    }
    
    
    
    
}
