/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author tangm
 */
public class Zoo {


    
    private Scanner sc = new Scanner(System.in);
    //array to keep all animals
    private ArrayList<Animal> animals = new ArrayList<>(0);
    
        /**
     * @return the animals
     */
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    /**
     * @param animals the animals to set
     */
    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    
    // Add's an animal to animals array by asking users for their details
    public void addAnimal(){
        
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
              
        System.out.println("Is it a land(0), water(1), or bird(2) animal?");
        int type = sc.nextInt();
        if(type==0){
            getAnimals().add(new LandAnim(a,b,c,d,e,f));
        } else if (type==1) {
            getAnimals().add(new WaterAnim(a,b,c,d,e,f));
        } else {
            getAnimals().add(new BirdAnim(a,b,c,d,e,f));
        }
    }
    
    public void feedAll(){
        for(Animal a: animals){
            a.eat();
        }
        
        System.out.println("All animals have eaten");
    }
    
    public void sleepAll(){
        for(Animal a: animals){
            a.sleep();
        }
        System.out.println("All animals have slept");
    }
    
    public void toStringAll(){
        for(Animal a: animals){
            System.out.println(a.toString());
        }
    }
    
    public void moveAll(){
        for(Animal a: animals){
            a.move();
        }
    }
     //returns animal from id
     public Animal getAnimal(int i){
       return animals.get(i);  
     }
}
