public class PeakIndexMoutainArray {
    public static void main(String[] args) {
        int[] arr={1,4,6,79,89,6,5,1};

        System.out.println(binarySearch(arr));

    }
    static int binarySearch(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=(start+end)/2;

            if(arr[mid]>arr[mid+1]){
                //means you are in descending part of the array
                //means you have to check left side elements of the array
                end=mid;
            }
            else{
                //otherwise you have to check right side elements of the array
                start=mid+1;
            }
        }
        return start;//or you can also return end, both will be same at the end;
    }
}
