
import javax.swing.JOptionPane;

public class guessnumber {
    public static void main(String[] args) {
        int mynum, yournum;
        mynum = (int) (Math.random() * 20);
           JOptionPane.showMessageDialog(null,"welcome to guess the game");
           JOptionPane.showMessageDialog(null,"guess the number(0-20)"); 
            do {
            yournum=Integer.parseInt(JOptionPane.showInputDialog("enter your number"));
            if (yournum == mynum) {
                JOptionPane.showMessageDialog(null,"congrats you guessed correct");
                JOptionPane.showMessageDialog(null,"my number was: "+mynum);
                break;
            } else if (yournum > mynum) {
                JOptionPane.showMessageDialog(null,"guess smaller");
            } else {
               JOptionPane.showMessageDialog(null,"guess larger");
            }
        } while (yournum >= 0);

    }
}