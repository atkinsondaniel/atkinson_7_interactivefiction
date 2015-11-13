/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atkinson_7_interactivefiction;

import java.util.Scanner;

/**
 *
 * @author danielatkinson
 */
public class Atkinson_7_interactivefiction {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    static Scenario scenario = new Scenario();
    static Game game = new Game();
    public static boolean live = true;
    public static int path = 1;
    public static void main(String[] args) {
        String stars= "*****************************************************************************";
        while(live) {
            switch(path) {
                case 1: System.out.println(stars);
                        game.text(scenario.s1);
                        break;
                case 2: System.out.println(stars);
                        game.text(scenario.s2);
                        break;
                case 3: System.out.println(stars);
                        game.text(scenario.s3);
                        break;
                case 4: System.out.println(stars);
                        game.text(scenario.s4);
                        break;
                case 5: System.out.println(stars);
                        game.text(scenario.s5);
                        break;
                case 6: System.out.println(stars);
                        game.text(scenario.s6);
                        break;
                case 7: System.out.println(stars);
                        game.text(scenario.s7);
                        break;
                case 8: System.out.println(stars);
                        game.text(scenario.s8);
                        break;
                case 9: System.out.println(stars);
                        game.text(scenario.s9);
                        break;
                case 10: System.out.println(stars);
                        game.text(scenario.s10);
                        break;
                case 11: System.out.println(stars);
                        game.text(scenario.s11);
                        break;
                case 12: System.out.println(stars);
                        game.text(scenario.s12);
                        break;
                case 13: System.out.println(stars);
                        game.text(scenario.s13);
                        break;
                case 14: System.out.println(stars);
                        game.text(scenario.s14);
                        break;
                case 15: System.out.println(stars);
                        game.text(scenario.s15);
                        break;
                case 16: System.out.println(stars);
                        game.text(scenario.s16);
                        break;
            }
        }
    }
   
}
