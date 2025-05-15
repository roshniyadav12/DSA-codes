package Binary_Search;

public class count {
    public static void main(String[] args) {
        int[] arr={6,7,8,9,10,11,12,1,1,1,1,2,3,4};
        System.out.println(Count(arr));
    }
    static int Count(int[] arr){
        int pivot=findPivot(arr);
        return pivot+1;
    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]> arr[mid+1]){
                return mid;
            }
           if(start< mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>= arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int dublicatefindPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]> arr[mid+1]){
                return mid;
            }
           if(start< mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]) {
                    return end;
                }
                end--;
            }
            else if(arr[start]< arr[mid] || (arr[start]==arr[mid] && arr[mid]> arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
