class ThreadExample extends Thread{
    public static void main(String[] args){
        Thread t=new Thread();
        t.setName("MyThread");
        t.start();
        System.out.println("Thread name: "+t.getName());
        System.out.println("Thread id: "+t.getId());
        System.out.println("Thread alive: "+t.isAlive());
    }
    public void run(){
        System.out.println("Thread is running");
    }
}
