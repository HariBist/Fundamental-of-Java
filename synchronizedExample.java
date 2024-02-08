public class synchronizedExample {
    public static void main(String[] args) {
        PrintTable obj =new PrintTable();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        //start Thread
        t1.start();
        t2.start();

    }
    
}
class PrintTable{
    public synchronized void printTable(int n)
    {
        System.out.println("The Table of " +n);
        for(int i=0;i<11;i++)
        {
            System.out.println(i*n);
        }
        try{
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class MyThread1 extends Thread
{
    PrintTable pt;
    MyThread1(PrintTable pt){
        this.pt =pt;
    }
    public void run(){
        pt.printTable(3);

    }
}
class MyThread2 extends Thread
{
    PrintTable pt;
    MyThread2(PrintTable pt){
        this.pt =pt;
    }
    public void run(){
        pt.printTable(5);

    }
}