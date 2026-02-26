// wap to implement multi threading

class thread1 extends Thread{
    int a;
    thread1(int a){
        this.a = a;
    }
    public void run(){
        for (int i = a; i<(a+5); i++){
            System.out.println(i);
        }  
    }
}

public class P12_MultiThreading{
    public static void main(String[] args){
        thread1 a = new thread1(1);
        thread1 b = new thread1(6);
        a.start();
        //a.join();
        b.start();
        //b.join();
    }
}