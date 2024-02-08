public class ExceptionHandling2 {
    static void canVote(int x){
        try{
            if(x<18){
                throw new ArithmeticException("You are not adult");
            }
            else{
                System.out.println("you can vote");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[]args)
    {
        canVote(20);
        canVote(10);
    }
    
}
