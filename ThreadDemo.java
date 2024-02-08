public class ThreadDemo {
    public static void main(String[] args) {
        Thread f = new First();
        Thread s = new Second();
        f.start();
        s.start();
    }
    
}
class First extends Thread{
    public void run(){
        try{
            for(int i=0; i<10;i++){
                System.out.println(i);
                Thread.sleep(500);
            }
        }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
class Second extends Thread{
    public void run(){
        try{
            for(int i=11; i<20;i++){
                System.out.print(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}