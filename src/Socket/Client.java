package Socket;

import java.io.*; // java.io 하위 모든 라이브러리 자동 호출
import java.net.*;// java.net 하위 모든 라이브러리 자동 호출

public class Client {
    public static void main(String[] args) {
        Socket socket = null; // Server와 통신하기 위한 Client의 Socket
        BufferedReader in = null; // Server로부터 데이터를 읽어들이기 위한 입력스트림
        BufferedReader in2 = null; // 키보드로부터 읽어들이기 위한 입력스트림
        PrintWriter out = null; // 서버로 내보내기 위한 출력 스트림
        InetAddress ia = null;

        try {
            ia = InetAddress.getLocalHost(); // 서버로 접속하기 위해 서버 주소 입력
            socket = new Socket(ia, 4444);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // BufferedReader 선언
            in2 = new BufferedReader(new InputStreamReader(System.in)); // BufferredReader2 선언
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))); // 이하 동문

            System.out.println(socket.toString());
        }catch(IOException e) {

        }

        try {
            System.out.print("서버로 보낼 매세지 : ");
            String data = in2.readLine(); // 키보드로부터 입력
            out.println(data);
            out.flush();

            String str2 = in.readLine(); // 서버로부터 되돌아오는 데이터를 읽어들임
            System.out.println("서버로부터 되돌아온 메세지 : " + str2);
            socket.close();
        }catch(IOException e) {

        }
    }
}
