/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanjava;



/**
 *
 * @author Aryo W
 */
import java.util.Scanner;
public class LatihanJava {

    public static void main(String[] args) {
Scanner r = new Scanner(System.in);
System.out.println("1.Keyboard with price $49.99");
System.out.println("2.Mouse with price $19.99");
System.out.println("3.Monitor with price $99.99");
System.out.print("Choose Item by Number : ");
int d = r.nextInt();
switch(d){
    case 1:
        Scanner op = new Scanner(System.in);
        System.out.println("INPUT QUANTITY (1...20)");
        int s = op.nextInt();
        if (s>20){
            System.out.println("Out of Stock !");
            System.out.println("Please try again");
        }else
        System.out.println("Total : $" + s*49.99);
        break;
    case 2:
        Scanner za = new Scanner(System.in);
        System.out.println("INPUT QUANTITY (1...20)");
        int sa = za.nextInt();
        if (sa>20){
            System.out.println("Out of Stock !");
            System.out.println("Please try again");
        }else
        System.out.println("Total : $" + sa*19.99);
        break;
    case 3:
        Scanner ed = new Scanner(System.in);
        System.out.println("INPUT QUANTITY (1...20)");
        int sb = ed.nextInt();
        if (sb>20){
            System.out.println("Out of Stock !");
            System.out.println("Please try again");
        }else
        System.out.println("Total : $" + sb*99.99);
        
}
}
}
