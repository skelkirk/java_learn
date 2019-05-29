import javax.swing.*;

class MyClass4 {
    int num;
    String text;
    char a;

    MyClass4(int z,String b,char q){
        set(z, b, q);
        showText3();
    }
    void showText3(){
        String str="Значения полей объекта:\n";
        str+="num="+num+"\n";
        str+="text="+text+"\n";
        str+="a="+a+"\n";
        JOptionPane.showMessageDialog(null,str);
    }
    void set(int z, String b, char q){
        num=z;
        text=b;
        a=q;
    }
}

public class ClassDemo4 {
    public static void main(String[] args) {

        MyClass4 obj = new MyClass4(4,"Оппа",'А');
    }}
