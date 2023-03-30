public class ThreadExample extends Thread {

    @Override
    public void run() {

        System.out.println("Start thread " + getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName()+ " ended.");
    }
}
