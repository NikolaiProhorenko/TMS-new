import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8189);
        DataInputStream is = new DataInputStream(socket.getInputStream());
        DataOutputStream os = new DataOutputStream(socket.getOutputStream());
        System.out.println("\nДобро пожаловать!");

        while (true) {
            String msg = sc.nextLine();
            os.writeUTF(msg);
            os.flush();
            String response = is.readUTF();
            System.out.println("\nСервер : " + response);
            if (msg.equals("Выйти")) {
                System.out.println("\nВы вышли из программы!");
                break;
            }
        }
    }
}
