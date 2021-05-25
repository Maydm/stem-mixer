/*
    It's ok to use this file as a helpful resource 
    However, do your best to think of and write out
    your own solutions before referring to the
    code below. Have fun!
*/

import java.util.Scanner;

public class AstronomicalWeight {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double userWeight, earth, moon, mercury, venus, mars, jupiter;

        System.out.print( "How much do you weigh? " );
        userWeight = keyboard.nextDouble();

        earth = weight;
        moon = weight * .166;
        mercury = weight * .378;
        venus = weight * .907;
        mars = weight * .377;
        jupiter = weight * 2.36;

        System.out.println("Your weight on Earth is " + earth);
        System.out.println("Your weight on the Moon is " + moon);
        System.out.println("Your weight on Mercury is " + mercury);
        System.out.println("Your weight on Venus is " + venus);
        System.out.println("Your weight on Mars is " + mars);
        System.out.println("Your weight on Jupiter is " + jupiter);
    }
}