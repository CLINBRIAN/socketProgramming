
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamau
 */
public class SocServer {
    public static void main(String[] args) throws Exception {
        System.out.println("Server is connecting");
        ServerSocket ss = new ServerSocket(9999);
        
        System.out.println("server waiting for client request");
        Socket s = ss.accept();
        
        System.out.println("client connected");
        BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
        
        String str = bf.readLine();
        System.out.println("Client data "+str);
        
    }
    
}
