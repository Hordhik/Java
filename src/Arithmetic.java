public class Arithmetic {
    public static void main(String[] args) {
        //Agumented Assignment Operators
        int x=10;
        int y=5;

        x+=y;
        System.out.println(x);
        x-=y;
        System.out.println(x);
        x*=y;
        System.out.println(x);
        x/=y;
        System.out.println(x);
        x%=y;
        System.out.println(x);

        //Increment and Decrement Operators
        System.out.println(x++);
        System.out.println(x--);

        //Order of Operation [P-E-M-D-A-S]
        System.out.println(3 + 4 * (7 - 5) / 2.0);
    }
}
