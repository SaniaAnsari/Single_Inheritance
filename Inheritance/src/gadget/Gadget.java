package gadget;
//Parent class
public class Gadget {
    String brand;
    //constructor
    public Gadget(String brand){
        this.brand=brand;
    }
    public void powerOn(){
        System.out.println(brand+" "+"gadget is now powered on");
    }
    public void powerOff(){
        System.out.println(brand+" "+"gadget is now shutting down");
    }
}
