import com.company.vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q2 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Total no of inputs");
        int n=scan.nextInt();
        List<vehicles> a=new ArrayList<vehicles>();
        for(int i=0;i<n;i++){
            vehicles veh=new vehicles();
            System.out.println("name");
            veh.setvehicle(scan.next());
            System.out.println("milege");
            veh.setmilege(scan.nextFloat());
            System.out.println("run");
            veh.setrun(scan.nextFloat());
            veh.setlit(veh.getrun()/veh.getmile());
            a.add(veh);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a.get(i).getlit()>a.get(j).getlit()){
                    vehicles sam=a.get(i);
                    a.add(i,a.get(j));
                    a.remove(i+1);
                    a.add(j,sam);
                    a.remove(j+1);
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a.get(i).getveh()+" "+a.get(i).getrun()+" "+a.get(i).getmile()+" "+a.get(i).getlit());
        }
    }
}
