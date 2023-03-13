
import javax.swing.JOptionPane;
public class UserDefined
{    
    public static String enterPass;
    public static String isRunning = "yes";
    
    public static void main(String[] args)
    {
        UserDefined ud = new UserDefined();
        do{
                enterPass = JOptionPane.showInputDialog("1.A password must have atleast eight characters"
                + "\n2.A password consists of only letters and digits."
                + "\n3.A password must contain at least two digits."
                + "\nInput a password(You are agreeing to the Terms and Condition stated above.)");
                
       ud.isValid();
        }
        while(isRunning.equals("yes"));
        
    }
 
 
    
    public void isValid()
    {
            // Check password length
    if (enterPass.length() < 8) {
        JOptionPane.showMessageDialog(null,enterPass+" is not a valid password!");
        isRunning = JOptionPane.showInputDialog("Do you want to run again?");
        
                if(isRunning.equalsIgnoreCase("no"))
                {
                    System.exit(0);
                }
                else{
                    isRunning = "yes";
                }
        
    }

    // Check if password consists of only letters and digits
    for (int i = 0; i < enterPass.length(); i++) {
        char c = enterPass.charAt(i);
        if (!Character.isLetterOrDigit(c)) {
                  JOptionPane.showMessageDialog(null,enterPass+" is not a valid password!");
                  isRunning = JOptionPane.showInputDialog("Do you want to run again?");
        
                if(isRunning.equalsIgnoreCase("no"))
                {
                    System.exit(0);
                }
                else{
                    isRunning = "yes";
                }
        
        }
    }

    // Check if password contains at least two digits
    int digitCount = 0;
    for (int i = 0; i < enterPass.length(); i++) {
        char c = enterPass.charAt(i);
        if (Character.isDigit(c)) {
            digitCount++;
        }
    }
    if (digitCount < 2) {
                JOptionPane.showMessageDialog(null,enterPass+" is not a valid password!");
                isRunning = JOptionPane.showInputDialog("Do you want to run again?");
        
                if(isRunning.equalsIgnoreCase("no"))
                {
                    System.exit(0);
                }
                else{
                    isRunning = "yes";
                }
        
    }

    // Password passed all the requirements needed
             JOptionPane.showMessageDialog(null,enterPass+" is a valid password!");
             isRunning = JOptionPane.showInputDialog("Do you want to run again?");
        
                if(isRunning.equalsIgnoreCase("no"))
                {
                    System.exit(0);
                }
                
                else{
                    isRunning = "yes";
                }
        
    }

        
}
 