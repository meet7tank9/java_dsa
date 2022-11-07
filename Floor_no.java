//find the number that is <= target element
//find floor number of target element
public class Floor_no {
    public static void main(String args[]){
        int[] arr= {3,5,6,7,9,11,15,79};
        int target=8;

        int ans=binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        if(target<arr[start]){
            return -1;
        }

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[end];
        // return end;
    }
}
