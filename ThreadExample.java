
public class ThreadExample {
    public static void main(String[] args){
        Thread t = new Timer();
        t.start();
        // System.out.println("Boom Boom!!!");
    }
}
class Timer extends Thread{
    public void run(){
        try{
            for(int i=10;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
