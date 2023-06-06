class A{
public void d1(int x){
System.out.println("Class a");
}
}

class B extends A{
public void d2(int x , int y){
    System.out.println("Class b");
}

}

public class Poly {
    public static void main(String[] args) {
        B obj = new B();
        obj.d1(5);
        obj.d2(17, 14);
    }
}
