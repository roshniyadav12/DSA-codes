package Linear_Search;

public class SearchInRange {
        public static void main(String args[]){
            int[] arr={1,2,3,4,5};
            int target=5;
            int ans=LinearSearch(arr, target, 1,3);
            System.out.println(ans);
        }
        static int LinearSearch(int[] arr, int target, int start, int end){
            if(arr.length==0){
                return -1;
            }
            for(int index=start; index<=end; index++){
                int element=arr[index];
                if(element==target){
                    return index;
                }
            }
            return -1;
        }  
    
}
