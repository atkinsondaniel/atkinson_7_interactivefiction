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
        while(live) {
            switch(path) {
                case 1: game.text(scenario.a);
                        break;
                case 2: game.text(scenario.b);
                        break;
                case 3: game.text(scenario.c);
                        break;
                //case 4: game.text(scenario.d);
            }
        }
    }
   
}
