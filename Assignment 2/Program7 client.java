import java.io.*;
import java.net.*;

class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        System.out.print("Enter message: ");
        String msg = input.readLine();

        out.println(msg);

        System.out.println("Server: " + in.readLine());

        s.close();
    }
}