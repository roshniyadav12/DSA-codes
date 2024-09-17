package com.roshni;
import java.util.*;;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=arm(n);
        System.out.println("the true value of sum is "+ans);
        
    }
    static int arm(int n){
        int a=n;
        int sum=0;
        while(a!=0){
            int rem=a%10;
            int res=rem*rem*rem;
            sum+=res;
            a=a/10;
        }
        if(n==sum){
        System.out.println("armstrong");
        }
        else{
        System.out.println("not armstrong");
        }
        return sum;
    }
}
