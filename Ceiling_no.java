//find the number that is >= target element
//find ceiling number of target element
public class Ceiling_no {
    public static void main(String args[]){
        int[] arr= {1,5,6,7,9,11,15,50,79};
        int target=19;

        int ans=binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        if(target>arr[arr.length-1]){
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
        return arr[start];
        // return start;
    }
}
