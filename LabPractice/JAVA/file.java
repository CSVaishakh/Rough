package JAVA;
import javax.swing.*;
import java.util.Scanner;
import java.awt.Font;
import java.io.*;

public class file {
    JFrame F;
    JTextField T;
    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    file() {
        F = new JFrame("Text");
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setSize(450, 450);
        F.setLayout(null);
        T = new JTextField();
        T.setBounds(300,100, 300,100);
        T.setFont(myFont);
        T.setEditable(false);
        F.add(T);
        F.setVisible(true);  // Added this line to make the frame visible
    }
    
    void filehandle() {
        FileInputStream f1 = null;
        FileWriter fw = null;
        Scanner sc = new Scanner(System.in);
        String s;
        
        try {
            fw = new FileWriter("source.txt");
            System.out.println("Enter lines of text (type 'stop' to end):");
            do {
                s = sc.nextLine();
                if (!s.equals("stop")) {
                    fw.write(s);
                    fw.write("\n");
                }
            } while (!s.equals("stop"));
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        try {
            f1 = new FileInputStream("source.txt");
            StringBuilder content = new StringBuilder();
            int c;
            
            while ((c = f1.read()) != -1) {  // Changed fis.read() to f1.read()
                content.append((char) c);
            }
            
            T.setText(content.toString());
            f1.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        } catch (IOException e) {
            System.out.println("error reading or writing file : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                file f = new file();
                f.filehandle();
            }
        });
    }
}