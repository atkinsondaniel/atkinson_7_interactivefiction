/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atkinson_7_interactivefiction;

import java.util.Scanner; //importing the scanner class, wow!

/**
 *
 * @author danielatkinson
 */
public class Game {

    static Scanner scanner = new Scanner(System.in); //an instance of the scanner class, wow!

    static int check(String usrChoice, String[] stuff) { //checks users response and assigns them a number
        int response; //creates the response variable
        if (usrChoice.contains(stuff[1])) { //first possible response
            response = 1;
        } else if (usrChoice.contains(stuff[2])) { //second possible response
            response = 2;
        } else if (usrChoice.contains(stuff[3])) { //third possible response
            response = 3;
        } else { //does nothing, haven't bothered to delete it yet
            response = 4; //it might do something
        } //okay it does something, let's not delete it
        return response;
    }

    static void text(String[] stuff) {
        System.out.println(stuff[0]); //prints scenario
        String response = scanner.next().toLowerCase(); //gets response
        int ans = check(response, stuff); //assigns a  value of the response
        setPath(ans); //decides where to go next
    }

    static void setPath(int res) {
        switch (Atkinson_7_interactivefiction.path) { //gigantic and bad, didn't feel like doing anything else
            case 1: //start
                if (res == 1) {
                    Atkinson_7_interactivefiction.path = 2; //more
                } else if (res == 2) {
                    Atkinson_7_interactivefiction.path = 3; //less
                } else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 2: //more
                if (res == 1) {
                    Atkinson_7_interactivefiction.path = 4; //house
                } else if (res == 2) {
                    Atkinson_7_interactivefiction.path = 5; //barn
                } else if (res == 3) {
                    Atkinson_7_interactivefiction.path = 1; //keep
                } else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 3: //less
                Atkinson_7_interactivefiction.path = 16; //start
            case 4: //house
                if (res == 1) {
                    Atkinson_7_interactivefiction.path = 2; //leave
                } else if (res == 2) {
                    Atkinson_7_interactivefiction.path = 6; //closet
                } else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 5: //barn
                if (res == 1) {
                    Atkinson_7_interactivefiction.path = 7; //duck
                } else if (res == 2) {
                    Atkinson_7_interactivefiction.path = 8; //dive
                } else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 6: //closet
                Atkinson_7_interactivefiction.path = 1; //start
            case 7: //duck
                if (res == 1) {
                    Atkinson_7_interactivefiction.path = 16; //keep
                } else if (res == 2) {
                    Atkinson_7_interactivefiction.path = 9; //forest
                } else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 8: //dive
                Atkinson_7_interactivefiction.path = 16; //start
            case 9: //forest
                if (res == 1) {
                    Atkinson_7_interactivefiction.path = 10; //deeper
                } else if (res == 2) {
                    Atkinson_7_interactivefiction.path = 11; //swim
                } else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 10: //deeper
                if (res == 1) {
                    Atkinson_7_interactivefiction.path = 12; //enter
                } else if (res == 2) {
                    Atkinson_7_interactivefiction.path = 13; //stay
                } else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 11: //swim
                Atkinson_7_interactivefiction.path = 16;
            case 12: //enter
                if (res == 1) {
                    Atkinson_7_interactivefiction.path = 14; //search
                } else if (res == 2) {
                    Atkinson_7_interactivefiction.path = 15; //give up
                } else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 13: //stay
                Atkinson_7_interactivefiction.path = 16;
                break;
            case 14: //search
                Atkinson_7_interactivefiction.live = false;
                System.out.println("It only took you " + (System.currentTimeMillis() - Atkinson_7_interactivefiction.sTime) / 1000 + " seconds"
                        + " to die. Impressive");
                break;
            case 15: //give up
                Atkinson_7_interactivefiction.live = false;
                System.out.println("I only knew you for " + (System.currentTimeMillis() - Atkinson_7_interactivefiction.sTime) / 1000 + " seconds"
                        + ". Why must the good die young.");
                break;
            case 16:
                if (res == 1) {
                    Atkinson_7_interactivefiction.path = 1;
                } else if (res == 2) {
                    System.out.println("Pitiful");
                    System.out.println("It only took you " + (System.currentTimeMillis() - Atkinson_7_interactivefiction.sTime) / 1000 + " seconds"
                            + " to give up");
                    Atkinson_7_interactivefiction.live = false;
                } else {
                    System.out.println("Learn how to spell");
                }
                break;
        }
    }
}
