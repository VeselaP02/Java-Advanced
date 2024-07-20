package Streams_FilesAndDirectories_Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {


        String inPath = "C:\\Users\\xxxxx\\IdeaProjects\\Java Advanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "C:\\Users\\xxxxx\\IdeaProjects\\Java Advanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";

        FileInputStream input = new FileInputStream(inPath);
        FileOutputStream out = new FileOutputStream(outPath);

        int OneByte = input.read();
        while (OneByte >= 0){
            if (OneByte == 32 || OneByte == 10){
                out.write(OneByte);
            } else {
                String digit = String.valueOf(OneByte);
                for (int i = 0; i < digit.length() ; i++) {
                    out.write(digit.charAt(i));
                }
            }


            OneByte = input.read();
        }
        out.close();
    }
}
