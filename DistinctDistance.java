package Array;

public class DistinctDistance {
    public static void main(String[] args) {
        int[] arr={12,3,4,6};
        System.out.println(distinctWithDistance(arr, 3)?"Yes": "No");
    }
    static boolean distinctWithDistance(int[] arr, int k){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int c=1; c<=k && (c+i)<n; c++){
                int j=c+i;
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
