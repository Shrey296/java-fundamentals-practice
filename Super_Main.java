class Super{
    int num;
    void show(){
        System.out.println("value of number is: " + num);
    }
}

class Sub extends Super{
    void updated_value(){
        super.num = 20;
    }
}

public class Super_Main{
    public static void main(String[] args){
        Sub obj = new Sub();
        obj.num = 10;
        obj.show();
        obj.updated_value();
        obj.show();
    }
}
