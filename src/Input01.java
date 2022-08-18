import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String x = JOptionPane.showInputDialog("Type Something");
        
        
        //Parse the input as an int.
        //Print its value +1
        int y = Integer.parseInt(x);
        System.out.println(y + 1);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int u = Integer.parseInt(JOptionPane.showInputDialog("Type a number")) ;
        
    }
}
