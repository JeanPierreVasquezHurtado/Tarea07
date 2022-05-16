package Suma;

public class SumaDeMatrices {
    private int[][] mA;
    private int[][] mB;

    public SumaDeMatrices() {
    }

    public SumaDeMatrices(int[][] mA, int[][] mB) {
        this.mA = mA;
        this.mB = mB;
    }

    //ENCAPSULAMIENTO

    public void setmA(int[][] mA) {
        this.mA = mA;
    }

    public void setmB(int[][] mB) {
        this.mB = mB;
    }

    public int[][] getmA() {
        return mA;
    }

    public int[][] getmB() {
        return mB;
    }

// OPERACION

    public int[][] sumaMatriz() throws Exception {
        int[][] mResultado = new int[mA.length][mA[0].length];
        if(mA.length == mB.length && mA[0].length == mB[0].length){
            for (int row = 0; row < mA.length; row++) {
                for(int col=0; col<mA[row].length; col++){
                    mResultado[row][col] = mA[row][col]+ mB[row][col];
                }
            }
        }
        else{
            throw new Exception("El tamanio de las matrices no son iguales");
        }
            return mResultado;

    }
}