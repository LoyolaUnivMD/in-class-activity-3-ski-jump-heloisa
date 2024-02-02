//HelloWorld.java
// Programmers: Heloisa Albuquerque
// Course: CS 212
// Due Date: 2/1/24
// Problem Statement: Ski Jump
// Data In: Hill type and speed
// Data Out: Points
// Credits: In class

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Initialize variables
        int height = 0;
        double points = 0;
        int par = 0;

        // Tell the user what the program does and ask them to choose a hill type
        System.out.println("This program will determine a ski jumpers points earned based on their speed on the ramp");
        System.out.println("Choose a hill, Enter (N) for normal or (L) for large: ");

        // Store hill type in a string
        String hill_type = input.nextLine();

        // If normal, variables are set for the normal hill
        if (hill_type.equals("N")) {
            height = 46;
            points = 2;
            par = 90;

        }
        // If large, variables are set for the large hill
        if (hill_type.equals("L")) {
            height = 70;
            points = 1.8;
            par = 120;

        }
        // Calculate time in air
        double time_in_air = Math.sqrt((2 * height)/9.8);

        // Ask for speed and store in double
        System.out.println("Enter your speed at the end of the ramp: ");
        Double jumper_speed = input.nextDouble();

        // Calculate distance traveled and round
        Double distance_traveled = (jumper_speed * time_in_air);
        distance_traveled = ((double) Math.round(distance_traveled * 10)) / 10;

        // Calculate points earned and round
        Double points_earned = (60 + (distance_traveled - par) * points);
        points_earned = ((double) Math.round(points_earned * 10)) / 10;

        // Output distance and points
        System.out.println("You traveled a distance of " + distance_traveled);
        System.out.println("You earned " + points_earned + " points");

        // Message it user did well
        if (points_earned >= 61) {
            System.out.println("Great job for doing better than par!");
        }
        // Message if user didn't do well
        if (points_earned < 10) {
            System.out.println("Sorry you didn’t go very far");
        }
    }
}
