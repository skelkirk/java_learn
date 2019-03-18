//теперь метод volume()возвращает объём параллелепипида
class Boxx{
    double height,width,depth;
    //рассчитать и возвратить объём
    double volume(){
        return width*height*depth;
    }
}
 class BoxDemo4 {
     public static void main(String[] args) {
         Boxx myBox1=new Boxx();
         Boxx myBox2=new Boxx();
         double vol;
         //присвоим значения переменной экземпляра myBox1
         myBox1.width=15;
         myBox1.height=16;
         myBox1.depth=17;
         //присвоим значения переменной экземпляра myBox2
         myBox2.width=1;
         myBox2.height=2;
         myBox2.depth=3;
         //получить объём первого параллелепипида
         vol=myBox1.volume();
         System.out.println("Объём равен "+vol);
         //получить объём второго параллелепипида (второй способ, более эффективный)
         System.out.println("Объём равен "+myBox2.volume());
     }
}
