//package declaration - this class is part of the 'animals' package
package animals;

//'Cat' class is a subclass of 'Animals'
public class Cat extends Animals {

    //Constructor of the Cat class
    //This constructor takes 'name' and 'location' as parameter
    public Cat(String name, String location) {

        //'super' keyword calls constructor of the parent class
        super(name, location);
    }
    //Cat specific method
    public void sound(){
        System.out.println(name+" "+"can meowwww!!");
    }
}
