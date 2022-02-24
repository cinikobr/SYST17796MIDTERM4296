/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author r2kar
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    Seasons season;
    private boolean abc = true;

    public enum Seasons {
        FALL,
        WINTER,
        SPRING,
        SUMMER
    }

    //a constructor
    public JavaApplication11(Seasons season) {
        this.season = season;
    }

    public void seasonDescription() {
        switch (season) {
            case FALL:
                System.out.println("my fav. season!");
                break;
            case WINTER:
                System.out.println("it is too cold!");
                break;
            case SPRING:
                System.out.println("my allerg!");
                break;
            case SUMMER:
                System.out.println("it is hot!");
                break;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        // try to get the input (myStr) from the user
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter season: ");
        String myStr = scanner.nextLine();

        //Keeps asking for a season until a valid one is given
        while (!isSeason(myStr)) {
            System.out.println("Not a valid Season: ");
            System.out.print("Please enter season: ");
            myStr = scanner.nextLine();
        }

        JavaApplication11 test1 = new JavaApplication11(Seasons.valueOf(myStr));
        test1.seasonDescription();
        //test1.isSeason();
        int ord = Seasons.valueOf(myStr).ordinal();
        System.out.println(Seasons.valueOf(myStr).ordinal());
        //a for loop that iterated thru the Seasons Enum using values() method
        for (Seasons mySeason : Seasons.values()) {

            System.out.println(mySeason);
        }

    }

    private static boolean isSeason(String text) {
        for (Seasons season : Seasons.values()) {
            if (season.name().equals(text)) {
                return true;
            }
        }
        return false;
    }
}
