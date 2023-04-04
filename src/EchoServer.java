import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

// Объявляем класс, для сервера.
public class EchoServer {
    private final HashMap<String, String> questionsAndAnswers;
    public EchoServer() {
        questionsAndAnswers = new HashMap<>();
        questionsAndAnswers.put("Привет", "Привет, как тебя зовут?");
        questionsAndAnswers.put("Меня зовут Игорь", "Очень приятно Игорь, есть какие либо вопросы?");
        questionsAndAnswers.put("Что делаешь?", "Я жду вопросы от клиента.");
        try (ServerSocket server = new ServerSocket(8189)) {
            while (true) {
                Socket socket = server.accept();
                new Thread(() -> {
                    try {
                        handle(socket);
                    } catch (IOException ioException) {
                        System.out.println("\nСоединение с клиентом было прервано!");

                    }
                }).start();
            }

        } catch (IOException msg) {
            msg.printStackTrace();
        }
    }
    private void handle(Socket socket) throws IOException {
        DataInputStream is;
        DataOutputStream os;
        is = new DataInputStream(socket.getInputStream());
        os = new DataOutputStream(socket.getOutputStream());
        System.out.println("\nКлиент присоединился!");

        while (true) {
            String msg = is.readUTF();
            System.out.println("\nКлиент : " + msg);
            if (msg.equals("Выйти")) {
                System.out.println("\nКлиент вышел(");
                os.writeUTF("До скорой встречи)");
                os.flush();
                break;
            }
                if (questionsAndAnswers.containsKey(msg)) {
                os.writeUTF(questionsAndAnswers.get(msg));
                os.flush();
            } else {
                os.writeUTF(msg);
                os.flush();
            }
        }
    }
    public static void main(String[] args) {
        new EchoServer();
    }
}