package Practise;

public class InsertionSort {
    public static void insertion(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("sorted");
        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr={6,7,3,44,1,5,67,9};
        insertion(arr);
    }
}
