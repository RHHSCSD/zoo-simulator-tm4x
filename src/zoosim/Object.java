/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 *
 * @author tangm
 */
public abstract class Object {
    
    double degrees;
    int x;
    int y;
    Image image;
    
    //changes the degrees of an object and simplifies it
    void turn(double d){
        degrees += d;
        degrees = degrees % 360;
    }
    
    public void place(int x1, int y1){
        x = x1;
        y = y1;
    }
}
