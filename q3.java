import java.util.*;

public class q3 {
    public static void rec(int i,int []a,List<List<Integer>> ls,List<Integer> list){
        if(!ls.contains(list) && !list.isEmpty())
        ls.add(new ArrayList<>(list));
        for(int j=i;j<a.length;j++){
            list.add(a[j]);
            rec(j+1,a,ls,list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        List<List<Integer>> ls=new ArrayList<>();
        rec(0,arr,ls,new ArrayList<>());
        List<Integer> sum=new ArrayList<>();
        for(int i=0;i<ls.size();i++){
            int Sum=0;
            for(int j=0;j<ls.get(i).size();j++){
                Sum+=ls.get(i).get(j);
            }
            sum.add(Sum);
        }
        for(int i=0;i<sum.size();i++){
            for(int j=i+1;j<sum.size();j++){
                if(Objects.equals(sum.get(i), sum.get(j))){
                    if(ls.get(i).size()+ls.get(j).size()== arr.length){
                        int count=0;
                        for(int k=0;k<ls.get(i).size();k++){
                            if(ls.get(j).contains(ls.get(i).get(k))){
                                count++;
                            }
                        }
                        if(count==0) {
                            System.out.println(ls.get(i) + " " + ls.get(j));
                            return;
                        }
                    }
                }
            }
        }
    }
}
