package classandobject;

public class Test {
    protected void sum(int a,int b){
        System.out.println("Result: "+(a+b));
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.sum(1,2);
    }
}
