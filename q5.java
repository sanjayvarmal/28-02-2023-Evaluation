import java.util.Scanner;

public class q5 {
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
            int minus=n-1,sum=i;
            for(int j=1;j<i;j++){
                sum+=minus;
                System.out.print(sum+" ");
                minus--;
            }
            System.out.println();
        }
    }
}
