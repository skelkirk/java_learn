//определить внутренний класс в цикле for
class Outer1 {
    int outer_x=100;
    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner1 {
                void display (){
                    System.out.println("Вывод outer_x равно " + outer_x);
                }
            }
            Inner1 inner=new Inner1();
            inner.display();
            }
        }
    }
public class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer1 outer=new Outer1();
        outer.test();
    }
}
