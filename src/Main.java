public class Main {
    public static void main(String[] args) {
        task7();
    }
    public static void  task6() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result = (a * (b + (c - d * e)));
        int invers = -1;
        int protResult = result * invers;
        System.out.println("результат равен " + result);
        System.out.println("инверсия равна " + protResult);

    }
    public static void  task7() {
        int a = 5;
        int b = 7;
        a = (a*b)/a;
        b = (a + a + a + a + a) / b;
        System.out.println("a = " + a + "; b = " + b);
    }
    public static void  task8(){
        int a = 486;
        int b = (a % 100) / 10;
        System.out.println ("b = " + b);
    }
}