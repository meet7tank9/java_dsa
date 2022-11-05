public class linear2 {
    public static void main(String[] args) {
        int[] arr={10,50,5,70,90,30,3,40,60};
        
        int min=minValue(arr);
        System.out.println("Min value is : "+min);

        int max=maxValue(arr);
        System.out.println("Max value is : "+max);
    }
    static int minValue(int[] arr){
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    static int maxValue(int[] arr){
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
