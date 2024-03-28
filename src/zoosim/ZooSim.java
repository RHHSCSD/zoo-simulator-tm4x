/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;
import java.util.Scanner;
/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //intialize variables
        Zoo zoo = new Zoo();
        Scanner sc = new Scanner(System.in);
        int option;
        boolean running = true;
        
        //give user a variety of options to choose from
        while (running){
            System.out.println("Select an option \n"
                    + "1. Add an animal \n"
                    + "2. Feed all animals \n"
                    + "3. Make all animals sleep \n"
                    + "4. All animals move \n"
                    + "5. Inspect all animals (wip)\n"
                    + "6. Print Statistics \n"
                    + "7. End Simulation");
            option = sc.nextInt();
            
            //do corresponding action
            if(option == 1){
                zoo.addAnimal();
            } else if (option == 2){
                zoo.feedAll();
            } else if (option == 3){
                zoo.sleepAll();
            } else if (option == 4){
                zoo.moveAll();
            } else if (option == 5){
                //Display all the names of the animals 
                for(int i = 0; i < Animal.getAnimals(); i++){
                System.out.println(i + ". " + zoo.getAnimal(i).getName());
                }
                option = sc.nextInt();
                //displays all the actions one can do to the chosen animal and does it
            } else if (option == 6){
                zoo.toStringAll();
            } else {
                running = false;
            }
        }
    }
    
}
