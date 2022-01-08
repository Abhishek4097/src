import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=n;
        int sum=0;
        int r = 0;
        while (n>0)
        {
            a=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(sum==a)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
