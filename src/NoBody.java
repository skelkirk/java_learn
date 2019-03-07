public class NoBody {
    public static void main(String[] args) {
        int i=150, j=200;
        while (++i<--j);
        System.out.println(i+" "+j);
    }
}
