import java.sql.SQLOutput;

class MakeObjCopy {
    String name;
    int number;
    MakeObjCopy(String str,int num){
        name=str;
        number=num;
    }
    //конструктор создания копии
    MakeObjCopy(MakeObjCopy obj){
         name=obj.name;
         number=obj.number;
    }
    //метод для создания копии объекта
    MakeObjCopy copy(){
        //создание объекта-копии
        MakeObjCopy tmp=new MakeObjCopy(name,number);
        //возвращение результата
        return tmp;
}
    //метод для вывода информации об объекте
    void show(){
        String text="Поля объекта:\n";
        text+="name: "+name+"\nnumber: "+number;
        System.out.println(text);
    }
}
public class MakeObjCopyDemo {
    public static void main(String[] args) {
        MakeObjCopy objA=new MakeObjCopy("Первый объект",100);
        MakeObjCopy objB=new MakeObjCopy(objA);
        //отображение информации об объектах
        objA.show();
        objB.show();
        //изменение второго объекта:
        objB.name="Второй объект";
        objB.number=200;
        objA.show();
        objB.show();
        //"копирование объектов":
        objA=objB.copy();
        objA.show();
        //изменение второго объекта
        objB.name="Второй объект изменён";
        objB.number=300;
        objA.show();
        objB.show();


    }

}
