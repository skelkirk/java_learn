import javax.swing.*;

public class UsingIf {
    public static void main(String[] args) {
        double x,y;
        //заголовок окна
        String title="Деление числе";
        //выводимый текст окна
        String text="Результат деления: \n";
        int type;
        //считывание числителя
        x=Double.parseDouble(JOptionPane.showInputDialog("Введите числитель:"));
        //считывание знаменателя
        y=Double.parseDouble(JOptionPane.showInputDialog("Введите знаменатель:"));
        if(y!=0){
            type=JOptionPane.PLAIN_MESSAGE;
            text=text+x+"/"+y+"="+x/y;
        } else {
                type=JOptionPane.ERROR_MESSAGE;
                text=text+"Деление на ноль!";
    }
    JOptionPane.showMessageDialog(null,text,title,type);
    }

}
