import java.util.*;
public class ObjectExample {
    int a,b;
    public void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        a = sc.nextInt();
        System.out.println("enter height of trinle:");
        b = sc.nextInt();
    }
    public void setdata(){
        int c;
        c=a*b;
        System.out.println("Area:"+c);
    }
    public static void main(String[]args){
        ObjectExample OE = new ObjectExample();
        OE.getdata();
        OE.setdata();
        System.out.println("To call an object we have to call within main class");
    }
    
}
