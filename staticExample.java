 /**
  * rectangle
  */
  class rectangle {
  static public int sum(int a , int b){
    return(a+b);
}

   public double multiply(int c ,int d){
    return(c*d);
   } 
 }
public class staticExample {
    public static void main(String[] args){
        rectangle r = new rectangle();
        System.out.println("multiply:" + r.multiply(4,6));
        System.out.print("sum:" + rectangle.sum(5,5)); 
     }
    }
  
