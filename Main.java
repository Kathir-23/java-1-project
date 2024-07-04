public class Main {

    static void add (int a, int b){
        int c= a+b;
        System.out.println(c);}
     static void add (int a, int b,int c){
        int d= a+b+c;
        System.out.println(d);}
    static void add (int a,int c){
        int d= a+c;
        System.out.println(d);}

    public static void main(String[] args)
    {
        add(10, 5);
        add(5,6,7);
    }
}
