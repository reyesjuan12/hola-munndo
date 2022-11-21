import com.sun.jdi.PrimitiveValue;

import java.util.Scanner;

public class Main {
    private  final static  double pi = 3.14;
    private  static int numero1;
    public static void main(String[] args) {
     Scanner  input = new Scanner (System . in );
        System.out.println("digite su primer numero");
        numero1 = input.nextInt();
        System.out.println("resultados:"  +(numero1 * pi));
    }
}