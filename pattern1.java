package com.roshni.patterns;

public class pattern1 {
    public static void main(String[] args) {
        
        pat9(4);
    }
    static void pat1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    static void pat5(int n){
        for(int i=1; i<=2*n-1; i++){
            int totalcol= i>n ? 2*n- i : i;
            for(int j=1; j<=totalcol; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat6(int n){
        for(int i=1; i<=2*n-1; i++){
            int totalcolinrow= i>n ? 2*n- i : i;
            int noSpaces= n- totalcolinrow;
            for(int s=1; s<=noSpaces; s++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=totalcolinrow; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat7(int n){
        for(int i=1; i<=n; i++){
            
            for(int s=1; s<=n-i; s++){
                System.out.print("  ");
            }
            for(int j=i ; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j=2 ; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pat8(int n){
        for(int i=1; i<=2*n-1; i++){
            int c= i>n ? 2*n- i : i;
            for(int s=1; s<=n-c; s++){
                System.out.print("  ");
            }
            for(int j=c ; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j=2 ; j<=c; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pat9(int n){
        int originaln= n;
        n= 2*n;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                int atEveryIndex= originaln-Math.min(Math.min(i,j), Math.min(n-i,n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
