import javax.swing.*;

public class UsingWhile {
    public static void main(String[] args) {
        String str1,str2,text;
        str1="Оператор while: ";
        str2="Оператор do-while: ";
        int i=1,j=1,s1=0,s2=0;
        int count=Integer.parseInt(JOptionPane.showInputDialog("Введите число"));
        text="Сумма натуральных чисел от 1 до "+count+'\n'+":";
        //подсчитываем сумму
        while(i<=count){
            s1+=i;
            i++;
        }
        do {
            s2+=j;
            j++; }
            while (j<=count);
    JOptionPane.showMessageDialog(null,text+str1+s1+'\n'+str2+s2);

    }
}
