/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 *
 * @author tangm
 */
public interface IEntity extends IObject{
    void move();
    void makeSound();
    void eat();
    void sleep();   
}
