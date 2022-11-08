//This program is created by Aswani Darsh 21CE006
/*Aim:-Write a method public static int readInFile(String line, File file) that returns the 
position number of a line in the file filename or −1 if there is no such line or file. 
Assume that this file contains names of people with a name per line. Names (and 
hence lines) are listed in ascending alphabetical order in the file. We can not find the 
same line twice*/
//Github link:-
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class file1 {
    File readInFile = new File("file.txt");

    int readFileme(String line, File file) {
        if (readInFile.exists()) {
            return line.length();
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        String str = "Hello everyone I am Aswani Darsh Hemrajbhai " +
                " And I am a Computer Engineer Studying at CSPIT ";

        // take a file to FileWriter
        FileWriter writeInFile = new FileWriter("XYZ.txt");
       
        for (int i = 0; i < str.length(); i++)
            writeInFile.write(str.charAt(i));

        System.out.println("Writting mode open Successfully");
        // close the file while no longer use
        writeInFile.close();

        
        int ch;
        // check if File exists or not
        FileReader readInFile = new FileReader("XYZ.txt");
       // System.out.println("File created SucessFully");
        
       
        // read from FileReader till the end of file
        while ((ch = readInFile.read()) != -1)
            System.out.print((char) ch);
            System.out.println("\nThis program is created by Aswani Darsh 21CE006");
        // close the file while no longer use
        readInFile.close();
    }
}
