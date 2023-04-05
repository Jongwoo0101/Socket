import javax.xml.crypto.Data;
import java.net.*;
import java.io.*;

public class TcpIpClient {
    public static void main(String[] args){
        try {
            String serverIp = "127.0.0.1";

            System.out.println("서버에 연결중입니다. 서버IP :"+serverIp);
            //소켓 생성 후 연결요청
            Socket socket = new Socket(serverIp, 9999);

            //소켓의 입력스트림 얻기
            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            //소켓으로 부터 받은 데이터를 출력
            System.out.println("서버로부터 받은 메시지 :"+dis.readUTF());
            System.out.println("연결을 종료합니다.");

            dis.close();
            socket.close();
            System.out.println("연결이 종료되었습니다");

        }catch (ConnectException ce){
            ce.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }//main
}
