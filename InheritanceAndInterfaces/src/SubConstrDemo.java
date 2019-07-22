class A{
    int number;
    char symbol;
    A(){
        number=0;
        symbol='A';
        System.out.println("Конструктор без аргументов");
        show();
    }
    A(int n){
        number=n;
        symbol='B';
        System.out.println("Конструктор с одним аргументом");
        show();
    }
    A(int n, char s){
        number=n;
        symbol=s;
        System.out.println("Конструктор с двумя аргументами");
        show();
    }
    void show(){
        System.out.println("Поля "+number+" и "+symbol+".");
    }
}
class B extends A{
    String txt;
    B() {
        super();
        txt="Без аргументов";
        showText();
    }
    B(String t){
        super (t.length());
        txt="С одним аргументом";
        showText();
    }
    B(int n, char s, String t){
        super(n,s);
        txt="С тремя аргументами";
        showText();
    }
    void showText(){
        System.out.println("Текстовое поле \""+txt+"\".");
    }
}
public class SubConstrDemo {
    public static void main(String[] args) {
        new B();
        new B("Один аргумент");
        new B(100, 'F',"Три аргумента");
    }
}
