//в этой программе применяется метод с параметрами
class Boxxx {
    double height,width,depth;
    //рассчитать и возвратить объём
    double volume (){
        return width*height*depth;
    }
    void setDim(double w, double h, double d) {
        width=w;
        height=h;
        depth=d;
    }
}
 class BoxDemo5 {
     public static void main(String[] args) {
         Boxxx myBox1=new Boxxx();
         Boxxx myBox2=new Boxxx();
         //инициализировать каждый экземпляр класса Boxxx
         myBox1.setDim(10,12,5);
         myBox2.setDim(4,5,2);
         //получить объём первого параллелепипида
         System.out.println("Объём равен "+myBox1.volume());
         System.out.println("Объём равен "+myBox2.volume());
     }
}
