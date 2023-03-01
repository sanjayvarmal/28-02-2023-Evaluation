import java.util.Scanner;

public class q4 {
    static String rs="";
    public static String str(String []a,String sam){
        for(int i=0;i<a.length;i++){
            if(sam.equals("") || (!sam.contains(" "+a[i]+" ") && (sam.charAt(sam.length()-2)+"").toLowerCase().equals((a[i].charAt(0)+"").toLowerCase())))
                str(a,sam+" "+a[i]+" ");
        }
        if(rs.length()<sam.length())
            rs=sam;
        return "";
    }
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Total inputs");
        String s[]=new String[scan.nextInt()];
        for(int i=0;i<s.length;i++){
            s[i]=scan.next();
        }
        str(s,"");
        String result="";
        for(int i=0;i<rs.length();i++){
            if(rs.charAt(i)!=' ')
                result+=rs.charAt(i);
        }
        System.out.println(result);
    }
}
