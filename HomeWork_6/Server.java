package Java_2.Lesson_6.HomeWork_6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        new Server();
    }

    public Server() {

        ServerSocket server = null;
        Socket socket = null;

        try {
            server = new ServerSocket(6002);
            System.out.println("Сервер работает...");
            socket = server.accept();
            System.out.println("Клиент подключился");
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);

            new Thread(() -> {
                while (true) {
                    System.out.println("Введите вообщение..");
                    String msg = sc.nextLine();
                    System.out.println("Сообщение отправлено");
                    out.println(msg);
                }
            }).start();
            while (true) {
                String msg = in.nextLine();
                if (msg.equals("/end")) break;
                System.out.println("Client: " + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                server.close();
                System.out.println("Завершение работы");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
