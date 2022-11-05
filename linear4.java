public class linear4 {
    public static void main(String[] args) {
        int[][] accounts={
            {1,5,3},
            {7,7,9},
            {5,7,9}
        };
        int max=maximumWealth(accounts);
        System.out.println(max);
    }
    static int maximumWealth(int[][] accounts){
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
