public class number8 {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int sum=0;
       // for(int i=0;i<A.length;i++)
        for(int x:A){
            sum=sum+x;

        }
//        {
//            sum+=A[i];
//        }
       System.out.println("sum is " + sum);
    }
}
