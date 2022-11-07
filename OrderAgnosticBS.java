public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr= {1,5,6,7,9,11,15,79}; //ascending
        int[] arr={95,78,32,15,2,1};    //descending
        int target=78;

        int ans=orderAgnosticBS(arr, target);
        System.out.println(ans);   
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        //find whether array is in ascending or descending
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            } 
        }
        return -1;
    }
}
