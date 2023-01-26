package Java_Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Throws_Exception2 {

    public static void main(String args[]) {

        try {
            searchForFile();

        } catch (IOException e) {
            System.out.println(e);
        }


    }

    public static void searchForFile()  throws IOException{

        File newFile = new File("/Users/satwinder/IdeaProjects/Java_Project/src/Java_Basic/ABCD.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

}




