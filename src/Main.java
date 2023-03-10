import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void  main(String[] args) throws IOException {
        String request;
        System.out.println("krok 1");
        ServerSocket server = new ServerSocket(10000);

        Socket socket = server.accept();
            System.out.println("krok2");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            request = in.readLine();
            System.out.println(request);
    }
}