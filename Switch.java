package com.roshni;
import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // String fruit= sc.next();
        // switch(fruit){
        //     case "Mango" ->System.out.println("King of fruits"); 
        //     case "Apple" -> System.out.println("A sweet red fruit"); 
        //     case "Orange" -> System.out.println("Round fruit"); 
        //     case "Grapes"-> System.out.println("small fruit"); 
        //     default-> System.out.println("Please enter a valid fruit");
        // }

        int day= sc.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}