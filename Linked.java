import java.util.*;
public class Linked{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<String> a=new LinkedList<>();
        for(int i=0;i<10;i++){
            String n=sc.nextLine();
            a.add(n);
        }
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
        System.out.println(a.contains("rio"));
        System.out.println(a.isEmpty());
    }
}