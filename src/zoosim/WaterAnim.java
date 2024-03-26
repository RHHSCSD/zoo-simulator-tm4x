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
    
    boolean canBreathe = true;
    
    public WaterAnim(String a, String b, char c, int d, int e, int f) {
        super(a, b, c, d, e, f);
    }
}
