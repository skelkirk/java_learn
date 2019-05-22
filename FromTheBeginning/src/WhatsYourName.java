import javax.swing.*;


public class WhatsYourName {
    public static void main(String[] args) {
        String name;
        name=JOptionPane.showInputDialog("Привет! Как тебя зовут?");
        JOptionPane.showMessageDialog(null,"Приятно познакомиться,\n"
                +name+"!");
    }
}
