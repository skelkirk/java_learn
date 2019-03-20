/*В данном примере программы для инициализации размеров
параллелепипида в классе BoX применяется параметизированный конструктор*/

class BoX {
    double width,height,depth;
    //это конструктор класса BoX
    BoX(double w,double h,double d) {
        width=w;
        height=h;
        depth=d;
    }
    //рассчитать и возвратить объём
    double volume(){
        return width*height*depth;
    }
}
 class BoxDemo7 {
     public static void main(String[] args) {
         //объявить, выделить память и инициализировать объекты типа BoX
         BoX myBox1=new BoX(10,15,11);
         BoX myBox2=new BoX(2,3,4);
         double vol;
         //получить объём первого параллелепипида
         vol=myBox1.volume();
         System.out.println("Объём равен "+vol);
         //получить объём второго параллелепипида
         vol=myBox2.volume();
         System.out.println("Объём равен "+vol);
     }
}
