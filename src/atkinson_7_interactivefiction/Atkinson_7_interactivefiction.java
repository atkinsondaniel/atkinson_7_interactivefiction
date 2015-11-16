/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atkinson_7_interactivefiction;

import java.util.Scanner;

/**
 *
 * @author me, who else would it be?
 */
public class Atkinson_7_interactivefiction {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);//an instance of the scanner class, wow!
    static Scenario scenario = new Scenario(); //an instance of the scenario class, wow!
    static Game game = new Game(); //an instance of the game class. wow!
    public static boolean live = true; //is the user alive, wow!
    public static int path = 1; //where the user is going, wow!
    public static void main(String[] args) {
        String stars= "*****************************************************************************"; //i like astronomy
        while(live) { //continues running until they die
            switch(path) {
                case 1: System.out.println(stars); //prints the stars
                        game.text(scenario.s1); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 2: System.out.println(stars); //prints the stars
                        game.text(scenario.s2); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 3: System.out.println(stars); //prints the stars
                        game.text(scenario.s3); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 4: System.out.println(stars); //prints the stars
                        game.text(scenario.s4); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 5: System.out.println(stars); //prints the stars
                        game.text(scenario.s5); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 6: System.out.println(stars); //prints the stars
                        game.text(scenario.s6); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 7: System.out.println(stars); //prints the stars
                        game.text(scenario.s7); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 8: System.out.println(stars); //prints the stars
                        game.text(scenario.s8); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 9: System.out.println(stars); //prints the stars 
                        game.text(scenario.s9); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 10:System.out.println(stars); //prints the stars
                        game.text(scenario.s10); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 11:System.out.println(stars); //prints the stars
                        game.text(scenario.s11); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 12:System.out.println(stars); //prints the stars
                        game.text(scenario.s12); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 13:System.out.println(stars); //prints the stars
                        game.text(scenario.s13); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 14:System.out.println(stars); //prints the stars 
                        game.text(scenario.s14); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 15:System.out.println(stars); //prints the stars
                        game.text(scenario.s15); //does literally everything else
                        break; //me off a piece of that kit-kat bar
                case 16:System.out.println(stars); //prints the stars
                        game.text(scenario.s16); //does literally everything else
                        break; //me off a piece of that kit-kat bar
            }
        }
    }
   
}
