import java.io.IOException;
import java.net.ServerSocket;

public class Test {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10000);
        server.accept().close();
    }
}
