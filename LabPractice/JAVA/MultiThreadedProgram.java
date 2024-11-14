package JAVA;
import java.util.Random;

class fibanocii extends Thread{
    private int num;
    public fibanocii(int num){
        super("fibanocii");
        this.num = num;
        start();
    }
    public int fib(int num) {
        if (num<2){
            return num;
        }
        return fib(num-1)+fib(num-2);
    }
    public void run() {
        System.out.print("The fibanocii series up to "+num+" terms is : ");
        for (int i=0;i<num;i++) {
            System.out.print(fib(i)+" ");
        }
        System.out.println();
    }
}

class factorial extends Thread{
    private int num;
    public factorial(int num){
        super("factorial");
        this.num = num;
        start();
    }
    public static int fact(int num) {
        if(num<=1){
            return 1;
        }
        return num*fact(num-1);
    }
    public void run(){
        int ans=fact(num);
        System.out.println("The factorial of the "+num+" is : "+ans); 
    }
    
}

class RandomThread extends Thread {
    RandomThread() {
        super("Randomthread");
        start();
    } 
    public void run() {
        Random r = new Random();
        try {
            for (int i = 0; i < 10; i++) {
                int num = r.nextInt(10);
                Thread.sleep(1000);
                if (num % 2 == 0) {
                    new fibanocii(num);
                } else {
                    new factorial(num);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class MultiThreadedProgram {
    public static void main(String[] args) {
        new RandomThread();
    }
}