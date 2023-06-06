package Amar.amar;

public class encapsulation {
    public static void main(String[] args) {
        
Laptop l1 = new Laptop();
l1.SetPrice(31);

System.out.println(l1.getPrice());

    }
//     public void height() {
//             System.out.println("yooooo");
//     }
//     private void breath() {
//         System.out.println("yooooo");
// }
// protected void length() {
//     System.out.println("yooooo");
// }
}
class Laptop{
    int ram;
 private int price;

 public void SetPrice(int price){
    boolean Admin= true;
    if(!Admin){
        System.out.println("You cannont set the price");
    }else{
        this.price=price;
    }
  
 }
 public int getPrice(){
    return price;
}

}


