/**
 * The Circle class prints calculation radius,area,perimeter at inscribed circle and circumscribed circle.
 * Hadassa Kazhav
 * 4/11/20
 */

import java.util.Scanner;
public class Circle
{
    /**
     *  Gets two coordinates x, y of two points at rectangle from user, 
     *  find ratio between two points hight rectangle - diameter Incircle, 
     *  prints radius,area,perimeter at incircle,
     *  find ratio diameter two points slant rectangle,
     *  prints radius,area,perimeter at excircle.
     *  
     */

    public static void main (String [] args)
    {

        Scanner scan = new Scanner (System.in);
        System.out.println ("This program calculates the areas " +
            "and the perimeters of the excircle and the incircle " +
            "of a given rectangle \n");

        //gets two coordinates of left-up points from user
        System.out.println("Please enter the two coordinates of the " +
            "left-upper point of the rectangle");
        int leftUpX = scan.nextInt();
        int leftUpY = scan.nextInt();
        System.out.println(leftUpX + "  " + leftUpY);
        System.out.println();

        //gets two coordinates of right-down points from user
        System.out.println("Please enter the two coordinates of the " +
            "right-down point of the rectangle");
        int rightDownX = scan.nextInt();
        int rightDownY = scan.nextInt();
        System.out.println(rightDownX + "  " + rightDownY);
        System.out.println();

        //incircle
        // find point rightup after points get from user
        int rightUpX = rightDownX;
        int rightUpY = leftUpY;
        // find ratio between two points hight rectangle - diameter Incircle
        int ratioBcX = rightUpX - rightDownX;
        int ratioBcY = rightUpY - rightDownY;
        // find diameter incircle - get radius,area,perimeter
        double diameterIn = Math.sqrt(Math.pow(ratioBcX,2)+Math.pow(ratioBcY,2));
        double radiusIn = diameterIn/2;
        double areaIn = Math.pow(radiusIn,2)*Math.PI;
        double perimeterIn = 2*Math.PI*radiusIn;
        System.out.println("Incircle: radius= "+ radiusIn  + " area= " + areaIn + " perimeter= " + perimeterIn);

        // excircle
        // find ratio between two points get from user - slant rectangle
        int ratioAcX =rightDownX - leftUpX;
        int ratioAcY =leftUpY - rightDownY;
        // find diameter diameterex - get radius,area,perimeter
        double diameterEx = Math.sqrt(Math.pow(ratioAcX,2)+Math.pow(ratioAcY,2)); 
        double radiusEx = diameterEx/2;
        double areaEx = Math.pow(radiusEx,2)*Math.PI;
        double perimeterEx = 2*Math.PI*radiusEx;
        System.out.println("Excircle: radius= "+ radiusEx  + " area= " + areaEx + " perimeter= " + perimeterEx);

    }//end of method main
} // end of class Circle

