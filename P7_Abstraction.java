abstract class Sample{
    int a = 10;
    void display(){
        System.out.println(a);
    }
    abstract void show();   
}

class child extends Sample{
    void show(){
        System.out.println("this is the child class");
    }
}

public class P7_Abstraction {
    public static void main(String[] args) {
        child c = new child();
        c.display();
        c.show();
    }
}
