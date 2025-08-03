import animals.Cat;
import gadget.smart_watch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("catto","earth");
        cat1.displayInfo();
        cat1.speak();
        cat1.sound();
        System.out.println("-------------------------");

        smart_watch my_watch= new smart_watch("FitTech");
        my_watch.powerOn();
        my_watch.showHeartRate();
        my_watch.receiveNotification("Meeting at 5 Pm");
        my_watch.powerOff();
    }
}