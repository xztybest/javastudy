import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.activation.UnknownObjectException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class client {
    Socket socket=null;
    public client(String host,int port){
        try{
            socket=new Socket(host,port);
        }catch(UnknownHostException e)
        {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
    
        
