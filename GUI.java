import javax.swing.*;//importing SWING library for GUI support.
import java.util.Scanner;//i want to try using scanner with this so soon, turns out this shit doesn't work, only for cmd use :bigSad:
public class GUI extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;//dnno what the fuck this means

    public GUI() {//method
        super("Nice App");//window name
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//so i can close the window using X or alt+f4
        setSize(300,300);//window size
        setLayout(null);//sets the window to show at the middle of the screen
        setVisible(true);//so you can acc see shit
        JLabel name = new JLabel();//THis is like text
        name.setText("Username");//well pretty obvious but i created a small label called username
        name.setBounds(40,20,100,30);//x position, y position,height,width
        add(name);//adding this to the screen
        JButton enter = new JButton("enter");//now a button (this doesn't work yet tho, haven't learned how to handle data and action events yet)
        enter.setBounds(100,70,100,30);//setting bounds again, same parameters as line 17
        add(enter);//adding the button
        JTextField enterNamTextField = new JTextField();//For technical terms, this is called an object
        enterNamTextField.setBounds(100,40,70,100);//Bounds again (boring)
        add(enterNamTextField);//adding (also boring)
        
    }

public static void main (String[] args){
    new GUI();//call the sub method in the main method (main executes any code in a file, in OOP this isnt needed for every file and rather the one that just runs the code)
}
}