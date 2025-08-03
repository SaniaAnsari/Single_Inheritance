package gadget;
//Derived class
public class smart_watch extends Gadget {
    int heart_rate =72;
    public smart_watch(String brand ){
        super(brand);
    }
    public void showHeartRate(){
        System.out.println("heart rate is: "+heart_rate+" BPM");
    }
    public void receiveNotification(String message){
        System.out.println("New Notification: "+message);
    }
}
