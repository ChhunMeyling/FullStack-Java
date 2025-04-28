package Method;

public class varargs {
    static void getvalue(int ...number){
        for(int e:number){
            System.out.println(e);
        }
    }
    static void getNewvalue(String name , int ...number){
        System.out.println(name);
        for(int e:number){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println("first call :");
        getvalue(1,2);
        System.out.println("second call :");
        getNewvalue("a",1,2,3,4,5,6,6,7);
    }
}
