import javax.swing.*;

public class CharArraySorting {
    public static void main(String[] args) {
        String text="Исходный массив: \n";
        int size=Integer.parseInt(JOptionPane.showInputDialog("Введите размер массива"));
        char s='a';
        char []symbs=new char[size];
        //заполняем массив
        for(int k=0; k<size; k++){
            symbs[k]=(char)(s+(byte)(Math.random()*26));
            text+=symbs[k]+" ";
        }
        text+="\nПосле сортировки:\n";
        //сортировка символов
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if(symbs[j]>symbs[j+1]){
                    s=symbs[j];
                    symbs[j]=symbs[j+1];
                    symbs[j+1]=s;
                }
            }
        }
        //запись в текстовом виде полученного массива

        for (int i = 0; i < size; i++) {
            text+=symbs[i]+" ";
        }
        JOptionPane.showMessageDialog(null, text);
    }
}
