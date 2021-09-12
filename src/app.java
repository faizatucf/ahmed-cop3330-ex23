/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class troubleshooting {

    boolean checkinput(String input)
    {
        if(input.toLowerCase().equals("y") || input.toLowerCase().equals("n"))
        return true;
        else
        return false;
    }

    boolean getinput(Scanner sc, String output)
    {
        System.out.println(output);
        String input = sc.nextLine();
        while(checkinput(input) == false)
        {
            System.out.println("Invalid input please enter Y/N");
            input = sc.nextLine();
        } 
        if(input.toLowerCase().equals("y"))
        return true;
        else
        return false;
    }
    public static void main(String[] args)
    {
        troubleshooting obj = new troubleshooting();
        Scanner sc = new Scanner(System.in);
        String ans;
        if(obj.getinput(sc,"Is the car silent when you turn the key?"))
        {
            if(obj.getinput(sc,"Are the battery terminals corroded?"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cables and try again");
            }
        }
        else
        {
            if(obj.getinput(sc,"Does the car make a slicking noise?"))
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                if(obj.getinput(sc,"Does the car crank up but fail to start?"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else{
                    if(obj.getinput(sc,"Does the engine start and then die?"))
                    {
                        if(obj.getinput(sc,"Does you car have fuel injection?"))
                        {System.out.println("Get it in for service.");}
                        else
                        System.out.println("Check to ensure the choke is opening and closing.");
                    }
                    else{
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}