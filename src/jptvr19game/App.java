/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19game;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        System.out.println("Hello");
        System.out.println("Программа загадала число, угадай его");
        Random random = new Random();
        int attempt = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальный диапозон загадымаевого числа");
        int max = scanner.nextInt();
        System.out.println("Введите минимальный диапозон загадымаевого числа");
        int min = scanner.nextInt();
        System.out.println("Программа загадала число от "+ min +" до "+max);
        System.out.println("Введите число");
        do {
            int myNumber = random.nextInt(max-min+1)+min;
            
            int GamerNumber = scanner.nextInt();
            if(myNumber == GamerNumber) {
                System.out.println("Ты выиграл");
                break;
            } else {
                if (attempt >=2 ){
                    System.out.println("Ты проиграл!Число было "+ myNumber);
                    break;
                } else {
                    System.out.println("Попробуй ещё раз");
                }
                attempt++;
            }
        }while(true);
    }
}
