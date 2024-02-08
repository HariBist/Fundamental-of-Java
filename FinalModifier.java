//final modifier is non access modifer that is used to restrict the class, method and varible to be accessed or modified.
 public class FinalModifier {
 
    public static void main(String[] args){
        final int a = 10;
        //  a =20;
        System.out.println("a is modified"+a);
        display obj = new display();
        obj.display();
        obj.display(20);

    }
 }
  final class display{
   final void display(){
        System.out.println("hello world!!");
    }
     int display(int y){
        int b=30+y;
        System.out.println(+b);
        return b;
    }
  }
