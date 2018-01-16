package com.Nimantha;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

	     //create the method to get input
        // create method to display input
        // create method to get average to the input

        int[] my_array = get_input(5);

        // display inputs

        for (int i = 0; i < my_array.length; i++)
        {
            System.out.println(" You Numbers are : "+my_array[i]);
        }
        // display average
        System.out.println("Average is :"+avarage(my_array));

    }
    public static int[] get_input(int number)
    {
        System.out.println("Enter the number");

        int[] value = new int[number];
        for (int i = 0; i <value.length; i++)
        {
            value[i] = input.nextInt();

        }
        return value;
    }

    public static double avarage(int[] my_array)
    {
        int temp = 0,average = 0;
        for (int i = 0; i < my_array.length; i++)
        {
            temp +=my_array[i];
        }
        average = temp/my_array.length;
        return average;
    }
}
