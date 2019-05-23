import javax.swing.*;

public class MoreIf {
    public static void main(String[] args) {
        String text,str;
        //введите число в окно
        text=JOptionPane.showInputDialog("Введите число: ");
        //проверка "был ли ввод"
        if(text==null){
            System.exit(0);
        }
        int num=Integer.parseInt(text);
        if(num<0) {
            str = "Вы ввели число отрицательное";
        } else if(num==0) {
            str = "Вы ввели нулевое значение";
        } else if (num>10) {
            str = "Вы ввели большое значение";
        }else {str="Вы ввели число от 1 до 10";
        }
        JOptionPane.showMessageDialog(null,str);
    }
}
