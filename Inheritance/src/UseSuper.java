//использовать ключевое слово super с целью предотвратить сокрытие имён
class A1 {
    int i;
}
//создать подкласс путём расширения класса А
class B1 extends A1 {
    int i; //этот член i скрыватет член из класса А
    B1 (int a, int b) {
        super.i=a; //член i из класса А
        i=b; //член i из класса B
    }
    void show () {
        System.out.println("Член i в суперклассе: "+super.i);
        System.out.println("Член i в подклассе: "+i);
    }
}
public class UseSuper {
    public static void main(String[] args) {
        B1 subOb=new B1(1,2);
        subOb.show();
    }
}
