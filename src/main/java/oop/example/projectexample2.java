/*
 *UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 RAYME PERSAD
 */

package oop.example;
import java.util.Scanner;

public class projectexample2 {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        String usersName;      // Name entered in manually


        System.out.print("What is your name?");
        usersName = stdin.nextLine();


        System.out.println("Hello, " + usersName + ", nice to meet you!"); //output to greet user with name entered


    }
}