/* 
    We're going to make a little game to help our user
    leave their home in the morning. Before writing 
    more involved programs it can help to take a moment
    to think about what you want your program to accomplish,
    what variables you will need, what conditions need
    to be met and requirements of your program. 

    What requirements do you have before you leave the
    house each morning? What actions do you take and
    what items do you place on your person before going
    out-of-doors?
*/

import java.util.Scanner;

public class ConditionalGame {
    public static void main (String[] args) {
        boolean shower = false;
        boolean clothes = false;
        boolean teethBrushed = false;
        boolean breakfast = false;
        boolean keys = false;
        boolean wallet = false;
        boolean phone = false;
        boolean shoes = false;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Good morning. It's time to get ready to leave for the day.");

        System.out.print("Alright, let's get this day started! Have you taken a shower? (enter true or false) ");
        shower = keyboard.nextBoolean();

        // This is a shortcut that states if the boolean is false then do something
        if (!shower) {
            System.out.println("What are you waiting on? It's time to rinse!");
        } else {
            System.out.println("Awesome. Time to get dressed!");
        }

        System.out.print("Are you dressed? (enter true or false) ");
        clothes = keyboard.nextBoolean();

        if (!clothes) {
            System.out.println("You need to get dressed!");
        } else {
            clothes = true;
            System.out.println("Great! let's be sure to extinguish that morning breath!");
        }

        System.out.print("You have brushed your teeth, right? (enter true or false) ");
        teethBrushed = keyboard.nextBoolean();

        if (!teethBrushed) {
            System.out.println("Brush em while you got em!");
        } else {
            System.out.println("Check out those sparkling pearls. Remember the mouth wash!");
        }

        System.out.print("Start the day with nutritous energy. Have you had breakfast? (enter true or false) ");
        breakfast = keyboard.nextBoolean();

        if (!breakfast) {
            System.out.println("Oh no! You've got a lot of learning ahead of you. It's harder to focus without nutrition in the morning.");
        } else {
            System.out.println("That's great! You're almost ready to seize this day!");
        }

        /*
        The program tells the user that they're almost ready to head out the door even if they
        answer false to every question above. After you've played with the existing code
        write an if-else-if ladder that checks if "shower, clothes, teethBrushed and breakfast"
        are true and false and provides an appropriate response for each condition.
        Remember to start with the most complicated conditions and end with the simplest in
        your ladder.
        */

        System.out.println("We're almost ready to head out the door.");
        System.out.println("Let's check your personal inventory. (answer true or false) ");
        System.out.print("Do you have your wallet or purse? ");
        wallet = keyboard.nextBoolean();
        System.out.print("Do you have your keys? ");
        keys = keyboard.nextBoolean();
        System.out.print("Do you have your phone? I know you don't want to leave withou your phone. ");
        phone = keyboard.nextBoolean();

        // We're going to build an if-else-if ladder for the wallet, keys, and phone
        if (!keys && !phone && !wallet) {
            System.out.print("You're clearly not ready to head out yet. ");
        } else if (!wallet && !keys) {
            System.out.print("Whoa! Not so fast, be sure to get your wallet and keys. ");
        } else if (!wallet && !phone) {
            System.out.print("Are you going about town incognito today? ");
        } else if (!keys && !phone) {
            System.out.print("No keys and no phone? You don't plan on doing much today, do you? ");
        } else if (!wallet) {
            System.out.print("You probably want to grab your wallet. ");
        } else if (!keys) {
            System.out.print("You're not likely to get very far without your keys...unless you're taking the bus or fare. ");
        } else if (!phone) {
            System.out.print("Has your phone got you feeling exhausted or did you just forget to remember? ");
        } else if (wallet && keys && phone) {
            System.out.println("Awesome! Let's get our shoes on and make this day! ");
        }
        
        System.out.println("It's about time to put on your shoes. I hope you know how to tie you're shoes. :P Just joking, let's get those on now. ");
        System.out.print("Are your shoes on your feet? ");
        shoes = keyboard.nextBoolean();

        // This is a shortcut that says if the boolean is true then do something
        if (shoes) {
            System.out.println("Let's Carpe the Diem out of this day! ");
        } else {
            System.out.println("Maybe it's a nice day, maybe you're a hippy. I don't know, but unless you're going to be on the beach all day, I doubt you're really head to head out. ");
        }

        if (shower && clothes && teethBrushed && breakfast && keys && wallet && phone && shoes) {
            System.out.println("Congratulations! You are 100% ready for the day. You made this program very happy. ");
        } else {
            System.out.println("What can we say? You're not ready for the day yet, and it's just about time to go. What have you been doing all morning? Playing silly computer games? ");
        }
        
    }
}

/*

What now? 

Find the comment block midway through this code and add a new
if-else-if ladder to check the initial variables of shower, dressed,
breakfast, and teethBrushed that will respond to the user appropriately 
based on their answers.

*/