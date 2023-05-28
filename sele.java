import java.util.*;
public class sele {

    public static void main(String[] args) {
        ArrayList<Integer>ar = new ArrayList<>();
        System.out.println("enter ele ");
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        while(n>0){
            ar.add(s.nextInt()) ;
            n-=1;
        }
        for(int i=0;i<ar.size();++i){
             int small = i;
             for(int j=small+1;j<ar.size();++j){
                if(ar.get(j)<ar.get(small)) small = j;
            }
            Collections.swap(ar, ar.get(i),ar.get(small));
        }
        System.out.println(ar);
    }
    
}
