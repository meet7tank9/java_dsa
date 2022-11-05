public class linear {
    public static void main(String args[]){
        int[] arr={10,50,70,60,40,90};
        int target=70;

        int ans=searching(arr,target);
        System.out.println(ans);
    }
    static int searching(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
