public class number14 {
    public static void main(String[] args) {
        int A[] = {8, 6, 10, 9, 2, 15, 7, 13, 14, 11};
        int B[] = new int[10];
        for (int i = 0; i < A.length; i++) {
            B=A;
            System.out.print(B[i]+",");
        }
    }
}