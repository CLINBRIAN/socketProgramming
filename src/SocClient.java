
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kamau
 */
public class SocClient {

    public static void main(String[] args) throws Exception {
        
        String ip = "localhost";
        int port = 9999;
        Socket socket = new Socket(ip, port);
        
        String str="socket client";

        OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
        PrintWriter out = new PrintWriter(os);
    
        os.write(str);
        os.flush();
        socket.shutdownOutput();
        
        
    }

}
