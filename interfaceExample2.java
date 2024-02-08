//one class extends and one interface implements
public class interfaceExample2 {
    public static void main(String[]args){
        C obj =  new C();
        obj.display();
    }
}
class A{
    int a =10;
    int add(int y){
       int b=y;
       return(a+b);
    }
}
interface B{
    int x=20;
    void display();
}
class C extends A implements B{
    int mul=a*x;
    int sum = add(20);
    public void display(){
        System.out.println("Multiplication:" +mul);
        System.out.println("Addition:" +sum);
    }
}

