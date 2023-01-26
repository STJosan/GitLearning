package Java_Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
public class Test {
    public static void main(String args[]){

        try {
            seachmyfile();

        }catch(IOException e)
        {
            System.out.println(e);
        }

    }

    public static void seachmyfile() throws IOException{

        // File newFile=new File(pathname:"/Users/satwinder/IdeaProjects/Java_Project/src/Java_Basic/ABCD.txt");
        File newFile=new File("abcd.txt");
        FileInputStream stream =new FileInputStream(newFile);

    }
}
