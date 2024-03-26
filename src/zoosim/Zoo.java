/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.Scanner;
/**
 *
 * @author tangm
 */
public class Zoo {
    
    Scanner sc = new Scanner(System.in);
    // Add's an animal by asking users 
    
    
    public Animal addAnimal(){
        
        
        System.out.println("What is it's name?");
        String a = sc.nextLine();
        System.out.println("What is it's species?");
        String b = sc.nextLine().toUpperCase();
        System.out.println("What is it's sex? M/F");
        char c = sc.nextLine().toUpperCase().charAt(0);
        System.out.println("How old are they?");
        int d = sc.nextInt();
        System.out.println("Are they slow, average, or fast? 1/2/3");
        int e = sc.nextInt();
        System.out.println("How much do they weigh?");
        int f = sc.nextInt(); 
        Animal h;
        
        System.out.println("Is it a land(0), water(1), or bird(2) animal?");
        int g = sc.nextInt();
        if(g==0){
            h = new LandAnim(a,b,c,d,e,f);
        } else if (g==1) {
            h = new WaterAnim(a,b,c,d,e,f);
        } else {
            h = new BirdAnim(a,b,c,d,e,f);
        }
        return h;
    }
    
    
    
}
