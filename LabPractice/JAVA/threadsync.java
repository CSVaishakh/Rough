package JAVA;

class callME {
    synchronized void call(String msg){
        System.out.print("["+ msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
    
}

class caller implements Runnable{
    String msg;
    Thread t;
    callME target;

    caller(callME targ,String s){
        this.target = targ;
        this.msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        target.call(msg);
    }
}

class syncthread{
    public static void main(String[] args) {
        callME c = new callME();
        caller o1 = new caller(c, "Hello");
        caller o2 = new caller(c, "World");
        try{
            o1.t.join();
            o2.t.join();
        }catch(InterruptedException e){
            System.out.println("Interrputed");
        }   
    }
}
