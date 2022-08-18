import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Hello, hope you're doing well",
                "hi",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "are you okay?",
                "serious question",
                2,
                null,
                null,
                "ANSWER");
        
        
        String[] acceptableValues = {"4", "89", "1"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "number???",
                "huh?",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);

        System.out.println( Integer.parseInt(input1) + Integer.parseInt(input2) );
    }
}
