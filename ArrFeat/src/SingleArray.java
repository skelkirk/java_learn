import javax.swing.*;

public class SingleArray {
    public static void main(String[] args) {
        String text="Массив нечётных чисел:\n";
        int size=Integer.parseInt(JOptionPane.showInputDialog("Введите размер массива:"));
        int[]arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=2*i+1;
            text+=arr[i]+" ";
        }
        JOptionPane.showMessageDialog(null,text);
    }
}
