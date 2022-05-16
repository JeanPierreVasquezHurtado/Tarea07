package Suma;

import java.util.Arrays;

public class MainSuma {

    public static void main(String[] args) {
        int [][] mA = {{2,1,4}, {6,5,3}};
        int [][] mB= {{6,5,3},{2,1,4}};
        int [][] resultado;
        SumaDeMatrices sumaDeMatrices = new SumaDeMatrices(mA,mB);
        try {
            resultado = sumaDeMatrices.sumaMatriz();
            System.out.println("La suma de las matrices es: ");
            for (int[] v :resultado){
                System.out.println(Arrays.toString(v));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.exit(0);

    }
}
