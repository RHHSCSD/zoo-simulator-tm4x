/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author tangm
 */
public class BirdAnim extends Animal implements IFlyable{
    
    //Not all bird animals will have to ability to fly, (penguins)
    boolean canFly = true;
    //State that represents if this animals is flying or on the ground
    boolean flying = false; 

    public BirdAnim(String a, String b, char c, int d, int e, int f) {
        super(a, b, c, d, e, f);
    }
    
    public void makeSound(){
        System.out.println("*caw caw*");
    }
    
    public void swim(){
        move();
        if(flying = true){
            System.out.println(this.getName() + "flys to (" + x + "," + y + ")");
        } else {
            System.out.println(this.getName() + "moves to (" + x + "," + y + ")");
        }
    }
    
    public void fly(){
        flying = true;
    }
    
    public void land(){
        flying = false;
    }
    
    public boolean isFlying(){
        return flying;
    }
    
     public String toString(){
        return this.toString() + "Bird Animal";
    }
    
}
