import javax.swing.*;

class MyClass {
    int num;
    String text;
    char a;

    String showText(){
        String str="Значения полей объекта:\n";
        str+="num="+num+"\n";
        str+="text="+text+"\n";
        str+="a="+a+"\n";
        return str;
    }
}

public class ClassDemo2 {
    public static void main(String[] args) {

        MyClass obj = new MyClass();
        obj.num = 12;
        obj.text = "Опля";
        obj.a='A';
        JOptionPane.showMessageDialog(null,obj.showText());

    }
}
