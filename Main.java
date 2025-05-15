package Linear_Search;

public class Main {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int target=3;
        boolean ans=LinearSearch3(arr, target);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0; index<arr.length; index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
    static int LinearSearch2(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int element: arr){
            if(element==target){
                return element;
            }
        }
        return -1;
    }
    static boolean LinearSearch3(int[] arr, int target){
        if(arr.length==0){
            return false;
        }
        for(int element: arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
