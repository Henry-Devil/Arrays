package arrays1;

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {

        int num[] = new int[5];
        //variabel arrays
        Scanner lectura = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite número");
            num[i] = lectura.nextInt();
            //capturando arrays
        }

        for (int num1 : num) {
            System.out.println("Los numeros " + num1);
            //escribiendo arrays
        }

    }

}
