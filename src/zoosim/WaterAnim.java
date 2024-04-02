/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author tangm
 */
public class WaterAnim extends Animal implements ISwimmable{
   
    //Not all water animals can breathe on land
    boolean canBreathe = true;
    //state if they are swimming or not
    boolean swimming = true;
    
    public WaterAnim(String a, String b, char c, int d, int e, int f) {
        super(a, b, c, d, e, f);
    }
    
    public void makeSound(){
        System.out.println("*glug glug*");
    }
    
    public void swim(){
        move();
        if(swimming){
        System.out.println(this.getName() + "swims to (" + x + "," + y + ")");
        } else {
        System.out.println(this.getName() + "moves to (" + x + "," + y + ")");  
        }
    }
    
    //Changes the state of swimming if they can breathe
    public void surface(){
        if(canBreathe = true){
            swimming = !swimming;
        } else {
            System.out.println(this.getName() + "cannot surface");
        }
    }
    
    public boolean canSurface(){
        return canBreathe;
    }
    
    public String toString(){
        return super.toString() + "|| Water Animal";
    }
}
