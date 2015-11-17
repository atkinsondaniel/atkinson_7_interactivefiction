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
    public static boolean live = true; //is the user alive, wow!
    public static int path = 1; //where the user is going, wow!
    public static long sTime = System.currentTimeMillis();

    public static void main(String[] args) {
        String stars = "*****************************************************************************"; //i like astronomy
        while (live) { //continues running until they die
            switch (path) {
                case 1:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s1); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 2:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s2); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 3:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s3); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 4:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s4); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 5:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s5); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 6:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s6); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 7:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s7); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 8:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s8); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 9:
                    System.out.println(stars); //prints the stars 
                    Game.text(Scenario.s9); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 10:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s10); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 11:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s11); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 12:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s12); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 13:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s13); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 14:
                    System.out.println(stars); //prints the stars 
                    Game.text(Scenario.s14); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 15:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s15); //does literally everything else
                    break; //me off a piece of that kit-kat bar
                case 16:
                    System.out.println(stars); //prints the stars
                    Game.text(Scenario.s16); //does literally everything else
                    break; //me off a piece of that kit-kat bar
            }
        }
    }

}
