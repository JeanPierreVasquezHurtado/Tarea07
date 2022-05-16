package Multiplicacion;

import javax.swing.*;

public class MultiplicacionDeMatrices {

    private int matriz1[][];

    private int filaM1;

    private int columnaM1;

    private int valoresM1;


    private int matriz2[][];

    private int filaM2;

    private int columnaM2;

    private int valoresM2;


    private int matrizResultante[][];

    private int filaMR;

    private int columnaMR;


    public MultiplicacionDeMatrices() {

        Boolean validar = true;

        do {

            if (validar == false){
                JOptionPane.showMessageDialog(null, "Ingresaste mal el valor en columnas de matriz 1 y fila de matriz 2, Intentalo otra vez :) ");
                validar = true;
            }
            filaM1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar fila de la Matriz 1"));

            columnaM1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese columna de la Matriz 1"));

            this.matriz1 = new int[filaM1][columnaM1];

            filaM2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar fila de la Matriz 2"));
            columnaM2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar columna de la Matriz 2"));

            this.matriz2 = new int[filaM2][columnaM2];

            filaMR = columnaM1;
            columnaMR = filaM2;
            this.matrizResultante = new int[filaMR][columnaMR];

            if (columnaM1 != filaM2){
                validar = false;
            }

        }while (columnaM1 != filaM2);
        JOptionPane.showMessageDialog(null, "Muy bien, ingresaste el mismo valor en columnas de matriz 1 y fila de matriz 2, continuemos :) ");
}

    public void agregarMatriz()
    {
        for (int fila=0; fila < this.matriz1.length; fila++)
        {
            for (int columna=0; columna < this.matriz1[fila].length; columna++)
            {
                this.valoresM1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores de la Matriz 1"));

                this.matriz1[fila][columna] = this.valoresM1;
            }
        }
        for (int fila=0; fila < this.matriz2.length; fila++)
        {
            for (int columna=0; columna < this.matriz2[fila].length; columna++)
            {
                this.valoresM2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores de la Matriz 2"));

                this.matriz2[fila][columna] = this.valoresM2;
            }
        }
    }

    public void mostrarMatriz()
    {
        System.out.println("Matriz 1");
        for(int fila=0; fila < this.matriz1.length; fila++)
        {

            for(int columna=0; columna < this.matriz1[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz1[fila][columna]);
            }

            System.out.println();
        }
        System.out.println();


        System.out.println("Matriz 2");
        for(int fila=0; fila < this.matriz2.length; fila++)
        {
            for(int columna=0; columna < this.matriz2[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz2[fila][columna]);
            }

            System.out.println();
        }
        System.out.println();
    }

    public void multiplicacionM()
    {
        System.out.println("Resultado de la multiplicacion de la Matriz 1 y 2");
        for (int i = 0; i<filaMR;i++){
            for (int j = 0; j < columnaMR; j++){
                for (int k = 0; k < columnaM1; k++){
                    matrizResultante[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        for(int fila=0; fila < this.matrizResultante.length; fila++)
        {

            for(int columna=0; columna < this.matrizResultante[fila].length; columna++)
            {
                System.out.printf("%d ", this.matrizResultante[fila][columna]);
            }

            System.out.println();
        }

    }
}
