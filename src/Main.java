/*import java.net.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InetAddress ip = null;
        InetAddress[] ipArr = null;

        try{
            ip = InetAddress.getByName("www.naver.com");
            System.out.println("getHostName() :"+ip.getHostAddress());
            System.out.println("getHostAddress() :"+ip.getHostAddress());
            System.out.println("toString() :"+ip.toString());

            byte[] ipAddr = ip.getAddress();
            System.out.println("getAddress() :"+Arrays.toString(ipAddr));

            String result = "";
            for(int i=0; i<ipAddr.length;i++){
                result += (ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i])+".";
            }
            System.out.println("getAddress()+256 :"+result);
            System.out.println();

        }catch (UnknownHostException e){
            e.printStackTrace();
        }

        try {
            ip = InetAddress.getLocalHost();
            System.out.println("getHostName() :"+ip.getHostName());
            System.out.println("getHostAddress() :"+ip.getHostAddress());
            System.out.println();
        }catch (UnknownHostException e){
            e.printStackTrace();
        }

        try {
            ipArr = InetAddress.getAllByName("www.naver.com");

            for(int i=0; i<ipArr.length; i++){
                System.out.println("ipArr["+i+"] :"+ipArr[i]);
            }
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }//main
}*/

import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        URL url = null;
        BufferedReader input = null;
        String address = "https://www.naver.com/";
        String line = "";

        try {
            url = new URL(address);
            input=new BufferedReader(new InputStreamReader(url.openStream()));

            while ((line=input.readLine()) != null){
                System.out.println(line);
            }
            input.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
