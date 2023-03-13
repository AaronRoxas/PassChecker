
import javax.swing.JOptionPane;
public class UserDefined
{    
    public static String enterPass;
    public static String isRunning = "yes";
    
    public static void main(String[] args)
    {
        UserDefined ud = new UserDefined();
  
                enterPass = JOptionPane.showInputDialog("1.A password must have atleast eight characters"
                + "\n2.A password consists of only letters and digits."
                + "\n3.A password must contain at least two digits."
                + "\nInput a password(You are agreeing to the Terms and Condition stated above.)");
                
       ud.isValid();

        
    }
 
 
    
    public void isValid()
    {
            // Check password length
    if (enterPass.length() < 8)
    {
        JOptionPane.showMessageDialog(null,enterPass+" is not a valid password!");   
    }

    // Check if password consists of only letters and digits
    for (int i = 0; i < enterPass.length(); i++) {
        char c = enterPass.charAt(i);
        if (!Character.isLetterOrDigit(c)) {
                  JOptionPane.showMessageDialog(null,enterPass+" is not a valid password!");

        
        }
    }

    // Check if password contains at least two digits
    int digitCount = 0;
    //Loop to check every character if it is a Digit 
    for (int i = 0; i < enterPass.length(); i++)
    {
        char c = enterPass.charAt(i);
        if (Character.isDigit(c))
        {
            digitCount++;
        }
    }
    if (digitCount < 2)
    {
                JOptionPane.showMessageDialog(null,enterPass+" is not a valid password!");
        
    }

    // Password passed all the requirements needed
    JOptionPane.showMessageDialog(null,enterPass+" is a valid password!");
 
    }   
}
 