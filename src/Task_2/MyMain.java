package Task_2;

public class MyMain {
    public static void main (String [] args){
        Director Director = new Director();
        Worker Worker = new Worker();
        Accountant Accountant = new Accountant();

        Director.getInfo();
        Worker.getInfo();
        Accountant.getInfo();
    }
}
