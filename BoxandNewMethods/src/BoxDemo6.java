import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*В данном примере программы для инициализации размеров
параллелепипида в классе BOXX применяется конструктор*/
class BOXX {
    double height,width,depth;
    //это конструктор класса BOXX
    BOXX() {
        System.out.println("Конструирование объекта BOXX");
        width = 10;
        height = 10;
        depth = 10;
    }
        //рассчитать и возвратить объём
        double volume() {
            return width * height * depth;
        }
    }
 class BoxDemo6 {
     public static void main(String[] args) {
         //объявить, выделить память и инициализировать объекты типа BOXX
         BOXX myBox1=new BOXX();
         BOXX myBox2=new BOXX();
         double vol;
         vol=myBox1.volume();
         System.out.println("Объём равен "+vol);
         vol=myBox2.volume();
         System.out.println("Объём равен "+vol);
     }
 }


