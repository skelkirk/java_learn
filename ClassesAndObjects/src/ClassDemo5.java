import javax.swing.*;

class MyClass5 {
    int num;
    String text;
    char a;
    MyClass5 (){
        set();
        showText5();
    }
    MyClass5(int z){
        set(z);
        showText5();
    }
    MyClass5(char q){
        set(q);
        showText5();
    }
    MyClass5(int z,String b,char q){
        set(z, b, q);
        showText5();
    }
    void showText5(){
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
    void set(){
        num=10;
        text="Без аргументов";
        a='Y';
    }
    void set(char q){
        num=15;
        text="Tratata";
        a=q;
    }
    void set(int z){
        num=z;
        text="Oy";
        a='U';
    }
}

public class ClassDemo5 {
    public static void main(String[] args) {

        MyClass5 obj1 = new MyClass5(4,"Оппа",'А');
        MyClass5 obj2=new MyClass5();
        MyClass5 obj3=new MyClass5(5);
        MyClass5 obj4=new MyClass5('G');

    }}
