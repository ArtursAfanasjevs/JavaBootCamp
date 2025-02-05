package sef.FinalActivity.secondActivity;

import java.util.Scanner;

class Fibonacci
{
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }

    public static void main (String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers you want to see: ");
        int i = reader.nextInt();
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(i-2);//n-2 because 2 numbers are already printed
    }
}