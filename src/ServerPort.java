import java.net.ServerSocket;

public class ServerPort {
    public static void main(String args[]) {
        int port  =6301;
        try(ServerSocket socket = new ServerSocket(port)){
            System.out.println("Server is running oo this port " + port);
             while(true ) {
                 socket.accept();
                 System.out.println("we are accepting the socket here ");

             }

        }
        catch(Exception ee) {
            System.out.println("can not bind port is already tied with someother one ");
        }

    }
}
