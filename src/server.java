import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class server extends  Thread{
    ServerSocket s=null;
    Socket socket=null;
    public server(int port) {
        try {
            s=new ServerSocket(port);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        super.run();
        try {
            System.out.println(getdate()+"wait for the client connect");
            socket=s.accept();
            new sendMessThread().start();
            System.out.println(getdate() + "  客户端 （" + socket.getInetAddress().getHostAddress() + "） 连接成功...");
            InputStream in=socket.getInputStream();
            int len=0;
            byte[] buf=new byte[1024];
            while((len=in.read(buf))!=-1) {
                System.out.println(getdate() + "  客户端: （"
                        + socket.getInetAddress().getHostAddress() + "）说："
                        + new String(buf, 0, len, "UTF-8"));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getdate() {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String result=format.format(date);
        return result;
    }
    class sendMessThread extends Thread {
        @Override
        public void run() {
            super.run();
            Scanner scanner=null;
            OutputStream out=null;
            try {
                if(socket!=null) {
                    scanner=new Scanner(System.in);
                    out=socket.getOutputStream();
                    String in="";
                    do {
                        in=scanner.next();
                        out.write(("" + in).getBytes("UTF-8"));
                        out.flush();// 清空缓存区的内容
                    } while(!in.equals("q"));
                    scanner.close();
                    try{
                        out.close();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    public static void main(String[] args) {
        server server1=new server(1234);
        server1.start();
        System.out.println("start");
    }
}
