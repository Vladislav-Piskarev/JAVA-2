package Java_2.Lesson_4.HomeWork_4.src.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ConsoleServer {

    private Vector<ClientHandler> users;

    public ConsoleServer() {

        users = new Vector<>();

        ServerSocket server = null;     // наша сторона
        Socket socket = null;           // удаленная (remote) сторона

        try {
            server = new ServerSocket(6001);
            System.out.println("Server started");

            while (true) {

                socket = server.accept();
                System.out.printf("Client [%s] connected\n", socket.getInetAddress());

                users.add(new ClientHandler(this, socket));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void broadcastMessage(String str) {
        for (ClientHandler c : users) {
            c.sendMsg(str);
        }
    }
}
