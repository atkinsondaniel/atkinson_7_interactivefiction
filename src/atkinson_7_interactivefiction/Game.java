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
public class Game {
    Scanner scanner = new Scanner(System.in);
    Atkinson_7_interactivefiction thing = new Atkinson_7_interactivefiction();
    int check(String usrChoice, String[] stuff) {
        int response;
        if (usrChoice.contains(stuff[1])) {
            response = 1;
        }
        else if (usrChoice.contains(stuff[2])) {
            response = 2;
        }
        else if (usrChoice.contains(stuff[3])) {
            response = 3;
        }
        else {
            response = 4;
        }
        return response;
    }
    void text(String[] stuff) {
        System.out.println(stuff[0]);
        String response = scanner.next().toLowerCase();
        int ans = check(response,stuff);
        setPath(ans);
    }
    void setPath(int res) {
        switch(thing.path) {
            case 1: //start
                if (res == 1){
                    thing.path = 2; //more
                }
                else if(res == 2) {
                    thing.path = 3; //less
                }
                else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 2: //more
                if (res == 1){
                    thing.path = 4; //house
                }
                else if(res == 2) {
                    thing.path = 5; //barn
                }
                else if(res == 3) {
                    thing.path = 1; //keep
                }
                else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 3: //less
                thing.path = 1; //start
            case 4: //house
                if (res == 1){
                    thing.path = 2; //leave
                }
                else if(res == 2) {
                    thing.path = 6; //closet
                }
                else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 5: //barn
                if (res == 1){
                    thing.path = 7; //duck
                }
                else if(res == 2) {
                    thing.path = 8; //dive
                }
                else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 6: //closet
                thing.path = 1; //start
            case 7: //duck
                if (res == 1){
                    thing.path = 1; //keep
                }
                else if(res == 2) {
                    thing.path = 9; //forest
                }
                else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 8: //dive
                thing.path = 1; //start
            case 9: //forest
                if (res == 1){
                    thing.path = 10; //deeper
                }
                else if(res == 2) {
                    thing.path = 11; //swim
                }
                else {
                    System.out.println("Learn how to spell");
                }
                break;
        }
    }
}
