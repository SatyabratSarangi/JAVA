class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run(){
        System.out.println(getName()+" is running with priority "+getPriority());
    }
}
public class Q8{
    public static void main(String[] args){
        MyThread t1=new MyThread("Thread-1");
        MyThread t2=new MyThread("Thread-2");
        t1.setPriority(5);
        t2.setPriority(7);
        System.out.println(t1.getName()+" priority: "+t1.getPriority());
        System.out.println(t2.getName()+" priority: "+t2.getPriority());
        t1.start();
        t2.start();
    }
}
