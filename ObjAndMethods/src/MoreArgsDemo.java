class MyClass1 {
    //имя объекта - текстовое поле
    String name;
    //конструктор класса
    MyClass1(String name){
        this.name=name;
    }
    //метод для отображения имени объекта
    void show(){
        System.out.println("Объект  с именем \""+name+"\"." );
    }
}
public class MoreArgsDemo {
    //статический метод для изменения ссылки на объект
    static void ChangeRef(MyClass1 obj){
        //создаётся локальный объект
        MyClass1 tmp=new MyClass1("Локальный объект");
        //ссылка на локальный объект присваивается аргументу метода
        obj=tmp;
        //проверка имени объекта, на который ссылается аргумент
        obj.show();}

    public static void main(String[] args) {
        //создание объекта
        MyClass1 obj=new MyClass1("Оснвоной объект");
        //проверка имени объекта
        obj.show();
        //попытка ихменить ссылку на объект
        ChangeRef(obj);
        obj.show();
    }
    }

