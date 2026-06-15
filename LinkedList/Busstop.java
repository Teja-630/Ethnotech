import java.util.*;
public class Busstop {

    String stopname;
    Busstop next;
    Busstop(String stopname)
    {
        this.stopname=stopname;
        this.next=null;
    }
    public static void main(String[] args) {
        System.out.println();
    }
    
}
public class Busstop
{
    Busstop stop;
    public void addition(String stopname)
    {
        stop=new Busstop(stopname);
        
    }
}