
package arrays1;

import java.util.Scanner;


public class ForEach{
    int numeros[];

    public ForEach() {
        this.numeros = new int[5];
        Scanner lectura = new Scanner(System.in);
        int index=0;
        
        for (int num : numeros){
        numeros[index]= lectura.nextInt();
        index++;
        }
    }
            
}
