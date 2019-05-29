import javax.swing.*;

class MyClass3 {
    int num;
    String text;
    char a;

    void showText3(){
        String str="Значения полей объекта:\n";
        str+="num="+num+"\n";
        str+="text="+text+"\n";
        str+="a="+a+"\n";
        JOptionPane.showMessageDialog(null,str);
    }
    void set(int n,String oh,char b){
        num=n;
        text=oh;
        a=b;
    }
}

public class ClassDemo3 {
    public static void main(String[] args) {

        MyClass3 obj1 = new MyClass3();
        MyClass3 obj2 = new MyClass3();
        obj1.set(12,"Первый объект",'A');
        obj2.set(13,"Второй объект",'B');
        obj1.showText3();
        obj2.showText3();


    }
}