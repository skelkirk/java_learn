/*О копировании полей суперкласса в подкласс и возможность обращения к ним как будто непосредственно
хотя они уже есть в скопированном виде в подклассе*/

class SuperClass {
    int number;
    String name;
    void setNumber (int n){
        number=n;
    }
}
class SubClass extends SuperClass {
    char symbol;
    void setAll (int n, String txt, char s) {
        setNumber(n);
        name=txt;
        symbol=s;
    }
    void show(){
        System.out.println("Числовое поле: "+number);
        System.out.println("Текстовое поле: "+name);
        System.out.println("Символьное поле: "+symbol);
    }
}
public class SubClassDemo {
    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.setAll(12,"Первый",'A');
        obj.show();
        obj.setNumber(20);
        obj.name="Второй";
        obj.show();
    }
}
