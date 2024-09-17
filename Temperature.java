package com.roshni;
import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter temp in C : ");
        float tempC= sc.nextFloat();
        float tempF= (1.8f)*(tempC) + 32;
        System.out.println(tempF);
    }
}
