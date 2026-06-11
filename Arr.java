import java.util.*;

public class Arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> a= new ArrayList<>();
        for(int i=0;i<10;i++){
            String n=sc.nextLine();
            a.add(n);
        }
        System.out.println(a);

    }
}
