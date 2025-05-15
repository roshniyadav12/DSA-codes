package Binary_Search;

public class RBS {
    public static void main(String[] args) {
        int[] arr={6,7,1,1,1,1,2,3,4};
        int target=3;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int pivot=dublicatefindPivot(arr);
        if(pivot==-1){
            binarySearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>= arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }
        else{
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }
    static int binarySearch(int[] arr, int target,int start, int end){
        while(start<=end){
            int mid=start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
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
