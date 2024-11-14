package JAVA;
import java.io.*;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter fin = new FileWriter("test.txt");
            System.out.println("Enter the lines of text,enter stop to end");
            do{
                s = sc.nextLine();
                if(!s.equals("stop")){
                    fin.write(s);
                    fin.write("\n");
                }
            }while(!s.equals("stop"));
            fin.close();
            try{
                FileReader fr = new FileReader("test.txt");
                BufferedReader bf = new BufferedReader(fr);
                System.out.println("Content in the file is : ");
                while((s = bf.readLine()) != null){
                    System.out.println(s);
                }
                bf.close();
                fr.close(); 
            }catch(FileNotFoundException e) {
                System.out.println("File not found");
            }
        }catch(IOException e){
            System.out.println("An error ocooured "+e.getMessage());
        }finally{
            sc.close(); 
        }
    }
}
