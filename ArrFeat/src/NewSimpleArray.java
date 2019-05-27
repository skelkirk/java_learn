import javax.swing.*;

public class NewSimpleArray {
    public static void main(String[] args) {
        int x,y;
        String text="Двумерный массив случайных чисел:";
        //укажите длину первого массива
        x=Integer.parseInt(JOptionPane.showInputDialog("Строк в массиве:"));
        //длина второго массива
        y=Integer.parseInt(JOptionPane.showInputDialog("Столбцов в массиве:"));
        int[][]arr=new int[x][y];
        for (int i = 0; i <x ; i++) {
            text+="\n";
            for (int j = 0; j <y ; j++) {
                arr[i][j]=(int)(10*Math.random());
                text+=arr[i][j]+" ";
            }
        }
    JOptionPane.showMessageDialog(null,text);
    }
}
