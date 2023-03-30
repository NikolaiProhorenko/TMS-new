public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadExample T1 = new ThreadExample();
        ThreadExample T2 = new ThreadExample();
        ThreadExample T3 = new ThreadExample();

        T3.start();
        try {
            T3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        T2.start();
        try {
            T3.join();
            T2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        T1.start();
        try {
            T3.join();
            T2.join();
            T1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All thread ended ");
    }
}