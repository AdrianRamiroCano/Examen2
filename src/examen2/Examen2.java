package examen2;

public class Examen2 {

    public static void main(String[] args) {

        int[] matriz = {2, 1, 1, 2, 3, 5, 8, 13, 21};
        
        System.out.println(fibonacci(matriz));
    }

    public static boolean fibonacci(int[] matriz) {

        for (int i = 2; i < matriz.length; i++) {

            if (matriz[i] != matriz[i - 1] + matriz[i - 2]) {

                return false;

            }
        }
        return true;
    }
}
