package com.devops;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int sum = 0;
      sum = num1 + num2;

      System.out.println("Sum of these numbers: "+sum);

    }
}
