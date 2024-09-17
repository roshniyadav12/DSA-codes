package com.roshni;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int EmpId= sc.nextInt();
        String department= sc.next();
        switch(EmpId){
            case 1:
            System.out.println("Roshni Yadav");
            break;
            case 2:
            System.out.println("Muskan Verma");
            break;
            case 3:
            System.out.println("Radhika");
            switch(department){
                case "IT":
                System.out.println("IT department");
                break;
                case "Management":
                System.out.println("Management department");
                break;
                default:
                System.out.println("Please enter a valid Department");
            }
            break;
            default:
            System.out.println("Please enter a valid empid");
        }

    }
}
