import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class test01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter URL : ");
        String webString = input.nextLine();

        try{
            URL url = new URL("http://" + webString);
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            
            File myFile = new File("./URL_File/URLConnection01.html");
            if(myFile.exists()){
                myFile.delete();
            }
            myFile.createNewFile();

            FileWriter fileWriter = new FileWriter(myFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            int i=0;
            while((i=inputStream.read()) != -1){
                bufferedWriter.write((char)i);
            }

            bufferedWriter.close();
            System.out.println("Web Page reading completed...");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}