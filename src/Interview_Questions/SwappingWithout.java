package Interview_Questions;

import java.util.Scanner;

public class SwappingWithout {
    public static void main(String []s)
    {
        int a,b;
        //Scanner class to read value
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter value of a: ");
        a=sc.nextInt();
        System.out.print("Enter value of a: ");
        b=sc.nextInt();

        System.out.println("Before swapping - a: "+ a +", b: " + b);
        ////without using thrid variable
        a=a+b;
        b=a-b;
        a=a-b;
        //////////////////////
        System.out.println("After swapping  - a: "+ a +", b: " + b);
    }
}

