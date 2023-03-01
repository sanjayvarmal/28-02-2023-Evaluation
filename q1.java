import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q1 {
    public static boolean check(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        List<Integer> rev=new ArrayList<>();
        for(int i=n+1;true;i++){
            if(check(i)){
               break;
            }
            if(i%2==0)
            System.out.print(i+" ");
            else{
                rev.add(i);
            }
        }
        for(int i=rev.size()-1;i>=0;i--){
            System.out.println(rev.get(i)+" ");
        }
    }
}
