public class ExceptionHandling {
    public static void main(String[] args) {
        try{
        int a=10;
        int div = a/0;
        System.out.println(div);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }
        finally{
            System.out.println("an erro occured");
        }
    }
}
