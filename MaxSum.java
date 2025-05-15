package Array;

public class MaxSum {
    public static int maximumSum(int[] arr){
        int currentSum=0;
        int maxsum=0;
        for(int i=0; i<arr.length; i++){
            currentSum=Math.max(arr[i], currentSum+arr[i]);
            maxsum=Math.max(maxsum,currentSum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr={-1,2,4,-1,6,8,10,-4,-6};
        System.out.println(maximumSum(arr));
    }
}
