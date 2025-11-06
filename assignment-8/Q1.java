class ThreadExample{
    public static void main(String[] args){
        Thread t=new Thread();
        System.out.println("Class name: "+t.getClass().getName());
        System.out.println("Thread name: "+t.getName());
        System.out.println("Thread priority: "+t.getPriority());
        System.out.println("Thread group name: "+t.getThreadGroup().getName());
    }
}
