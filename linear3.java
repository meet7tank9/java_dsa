public class linear3 {
    public static void main(String[] args) {
        int[] arr={1,52,7896,23,81, 88, 1};

        int ans=findNumbers(arr);
        System.out.println("Total even digits is : "+ans);

        int length1=findLength(33437979);
        System.out.println("Length of number is : "+length1);
    }

    static int findNumbers(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            String num = Integer.toString(arr[i]);
            if(num.length() %2 == 0){
                count++;
            }
        }
        return count;
    }

    static int findLength(int num){
            String num2 = Integer.toString(num);
            return (int)num2.length();
    }
}
