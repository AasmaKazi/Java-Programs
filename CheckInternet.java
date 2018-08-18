import java.net.URL;
import java.net.URLConnection;

public class CheckInternet {

    public static void main(String[] args) {

        try {

            URL url=new URL("https://www.google.com");
            URLConnection connection=url.openConnection();
            connection.connect();
            System.out.println("intenet connected");
        }
catch (Exception e){
            e.printStackTrace();
    System.out.println("not connected");
}


    }
}
