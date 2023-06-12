public class Human{
    
    //Instance Variables
    int height;
    double weight;


    //Class constructor
    public Human(int h, double w){
        height = h;
        weight = w;
    }

    //Default no argument constructor
    public Human(){
        height = 100;
        weight = 50;
    }

    //Class methods
    public void doSomething(){
        System.out.println("I did something.");
    }

    public void eat(){
        //Code for eating...
    }
}