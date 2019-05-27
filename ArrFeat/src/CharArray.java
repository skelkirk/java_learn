import javax.swing.*;

public class CharArray {
    public static void main(String[] args) {
        String text="\"Рваный символьный массив\"";
        //количество строк
        int size;
        //количество элементов в отдельнйо строке
        int elms;
        //первый символ строк
        char s='a';
        size=2+(int)(Math.random()*3);
        char [][] arr=new char[size][];
        //присвоить количество элементов каждой строке
        for (int k=0; k<arr.length; k++ ){
            elms=1+(int)(Math.random()*8);
            arr[k]=new char[elms];
        }
        for (int i = 0; i <size ; i++) {
            text+="\n| ";
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=s;
                s++;
                text+=arr[i][j]+" | ";
            }
        }
        JOptionPane.showMessageDialog(null,text);
    }

}
