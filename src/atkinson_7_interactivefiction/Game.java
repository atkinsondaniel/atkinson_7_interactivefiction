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
    int check(String usrChoice, String resp1, String resp2) {
        int response;
        if (usrChoice.equals(resp1)) {
            response = 1;
        }
        else if (usrChoice.equals(resp2)) {
            response = 2;
        }
        else {
            response = 3;
        }
        return response;
    }
    void text(String[] stuff) {
        System.out.println(stuff[0]);
        String response = scanner.next().toLowerCase();
        int ans = check(response,stuff[1],stuff[2]);
        setPath(ans);
    }
    void setPath(int res) {
        switch(thing.path) {
            case 1: 
                if (res == 1){
                    thing.path = 2;
                }
                else if(res == 2) {
                    thing.path = 3;
                }
                else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 2: 
                if (res == 1){
                    thing.path = 4;
                }
                else if(res == 2) {
                    thing.path = 5;
                }
                else {
                    System.out.println("Learn how to spell");
                }
                break;
            case 3: 
                thing.path = 1;   
        }
    }
}
