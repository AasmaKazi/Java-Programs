import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileToFile {

    public static void main(String[] args) {
        FileInputStream inputStream=null;
        FileOutputStream outputStream=null;

        try{

            File inFile=new File("/home/melayer/Aasma/folder/file1");
            File outFile=new File("/home/melayer/Aasma/folder/file2");

            inputStream= new FileInputStream(inFile);
            outputStream=new FileOutputStream(outFile);

            byte[] buffer= new byte[1024];
            int length;

            while ((length=inputStream.read(buffer))>0){

                outputStream.write(buffer,0,length);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("File copied...");

        }
        catch (IOException io){

            io.printStackTrace();
        }


    }
}
