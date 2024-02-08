/**
 * Innerinheritance
 */
 class sum {
   void fun(){
        System.out.println("Base class to  perform addition:");
      

    }
    
}
class display extends sum {
   void fun2(){
    int add;
    int a=10;
    int b=39;
    add= a + b;
    System.out.println("add:"+add);
   }
    
}
 class inheritance {
    public static void main(String[] args)
    {
display d = new display();
d.fun();
d.fun();
    }
}
