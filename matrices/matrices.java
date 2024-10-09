public class matrices {

    public static void main(String[] args) {
        //matriz cuadrada
        int [][] matriz1 = new int [3][3];
        int numero = 0;

        //introducir valores a la raiz cuadrada 
        //matriz1[0][0] = 2;
        //introducir valores a la matriz cuadrada
        System.out.println();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j <3; j++){
                matriz1[i][j] = numero;
                numero++;
                System.out.println(matriz1[i][j] + "      ");
            }
            System.out.println();
        }

        //matriz no cuadrada
        int[][] matriz2 = new int [3][5];
        numero = 0;
        System.out.println();
        for (int i = 0; i < matriz2.length ;i++){
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = numero;
                numero++;
                System.out.println(matriz2[i][j] + "      ");
                
            }
            System.out.println();

            
        }
        
        
    }
}
