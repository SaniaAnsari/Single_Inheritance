package animals;

public class Animals {
    String name;
    String Location;
    //Constructor
    public Animals(String name,String location){
        this.name=name;
        this.Location=location;
    }
    //Method to display Info
    public void displayInfo(){
        System.out.println(name+" "+"is originally from "+Location);
    }
    //Method to speak
    public void speak(){
        System.out.println(name+" "+"can make a sound");
    }
}
