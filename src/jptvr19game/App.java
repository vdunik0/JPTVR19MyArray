/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19game;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        System.out.println("Hello");
        System.out.println("Программа загадала число, угадай его");
        int myNumber = 2;
        Scanner scanner = new Scanner(System.in);
        int GamerNumber = scanner.nextInt();
        if(myNumber == GamerNumber) {
            System.out.println("Ты выиграл");
        } else {
            System.out.println("Ты проиграл!Число было "+ myNumber);
        }
    }
}
