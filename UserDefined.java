import javax.swing.JOptionPane;

public class UserDefined {
    
    public static String enterPass;
    public static String display = "";
    public static String isRunning = "yes";
    
    public static void main(String[] args)
    {
        UserDefined ud = new UserDefined();
        do 
        {
            enterPass = JOptionPane.showInputDialog("1. A password must have at least eight characters"
                + "\n2. A password consists of only letters and digits."
                + "\n3. A password must contain at least two digits."
                + "\nInput a password (You are agreeing to the Terms and Conditions stated above.)");

            ud.isValid();

        } while (isRunning.equalsIgnoreCase("yes"));

    }

    public void isValid()
    {
        boolean isValid = true;

        // Check if password consists of only letters and digits
        for (int i = 0; i < enterPass.length(); i++) 
        {
            char c = enterPass.charAt(i);
            if (!Character.isLetterOrDigit(c)) 
            {
                isValid = false;
                JOptionPane.showMessageDialog(null, enterPass + " is not a valid password!");
               
            }
        }

        // Check if password contains at least two digits
        int digitCount = 0;
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
            isValid = false;
            JOptionPane.showMessageDialog(null, enterPass + " is not a valid password!");
        }

        // Check if password is at least 8 characters long
        if (enterPass.length() < 8)
        {
            isValid = false;
            JOptionPane.showMessageDialog(null, enterPass + " is not a valid password!");
        }

        if (isValid)
        {
            JOptionPane.showMessageDialog(null, enterPass + " is a valid password!");
        }
      

        isRunning = JOptionPane.showInputDialog("Do you want to run again?");
        if (isRunning.equalsIgnoreCase("yes"))
        {
            isRunning = "yes";
        } else
        {
            isRunning = "no";
            System.exit(0);
        }
    }   
}