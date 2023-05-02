import java.util.ArrayList;

public class Ej1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println(dividir(a,b));
    }

    public static int dividir(int a, int b) {
        try{
            return a / b;
        }catch (Exception ArithmeticException){
            System.out.println(ArithmeticException.getMessage());
            return 0;
        }
    }

    /*
    b_ Cuando el valor pasado en b es 0, el método tira una excepción ArithmeticException.
    d_ La excepción más adecuada sería la ArithmeticException.
     */
}
