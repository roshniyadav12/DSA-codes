package com.roshni;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // ArrayList<Integer> list= new ArrayList<Integer>(10);
        // list.add(547);
        // list.add(6);
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(16);
        // list.add(17);
        // list.add(46577);
        // list.add(577777747);
        // list.add(4076);
        // list.add(5407);
        // list.add(49);
        // System.out.println(list.contains(17));
        // System.out.println(list.set(0,22));
        // list.remove(3);
        // System.out.println(list);

        // for(int i=0; i<5; i++){
        //     list.add(sc.nextInt());
        // }
        // for(int i=0; i<5; i++){
        //     System.out.println(list.get(i));
        // }
ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
