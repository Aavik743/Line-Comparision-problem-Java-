package LCP;

import java.util.Scanner;

public class LCP
{
    public static void main(String[] args)
    {
        System.out.println ("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int l = (int) (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println(Math.sqrt(l));
    }
}