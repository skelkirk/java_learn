import javax.swing.*;

class AssignObject{
    String text;
    AssignObject(){
        text="Новый объект!";
    }
    AssignObject(String str){
        text=str;
    }
    //метод отображения текста:
    void show(){
        JOptionPane.showMessageDialog(null,text);
    }
}

public class AssignObj {
    public static void main(String[] args) {
        AssignObject objA=new AssignObject();
        AssignObject objB=new AssignObject("Второй объект");
        objA.show();
        objB.show();
        //присваивание объектов
        objA=objB;
        objA.show();
        //изменение поля второго объекта
        objB.text="Изменение поля второго объекта!";
        //текстовое поле первого объекта
        objA.show();
    }

}
