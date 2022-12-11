
package prop1_hectorsabillon;

import java.util.Random;

public class Conversiones {
    
    static Random random = new Random();
    
    public String bin = "";
    public int dec = 0;
    public int cont = 0;
    
    public String dec_a_bin(int input){
        
        if (input % 2 == 0){
            this.bin += "0";
        } else if (input % 2 == 1){
            this.bin += "1";
        }
        input /= 2;
        
        if (input <= 0){
            return this.bin;
        } else {
            dec_a_bin(input);
        }
        return this.bin;
    }
    /*
    Este metodo llama a la variable de instancia bin al momento de hacer cada operacion que determine si se agrega un 0 o un 1 a la cadena.
    El metodo se seguira llamando a si mismo siempre y cuando el valor de input, que se actualiza en cada instancia del metodo, sea mayor que 0.
    */
   
    public int bin_a_dec(String input){
        if (Character.getNumericValue(input.charAt(cont)) == 1){
            dec += Math.pow(2, cont);
        }
        this.cont++;
        
        if (this.cont < input.length()){
            bin_a_dec(input);
        } else{
            return this.dec;
        }
        return this.dec;
    }
    /*
    En este metodo se utiliza un contador en lugar de un ciclo for para ir leyendo de caracter en caracter la cadena del numero binario.
    Despues, se agarra el valor numerico del caracter en la posicion del contador y si el contador esta por debajo de la longitud de la cadena,
    se seguira llamando el metodo para hacer el calculo para el acumulador dec y se retorna al finalizar.
    */
   
   public int[][] llenarMatriz(int[][] matriz, int fila, int columna){
       for (int i = 0; i < fila; i++){
           for (int j = 0; j < columna; j++){
               matriz[i][j] = random.nextInt(9) + 1;
           }
       }
       return matriz;
   } 
    
   public String imprimirMatriz(int[][] matriz, int fila, int columna, String cadena){
       cadena = "";
       for (int i = 0; i < fila; i++){
           for (int j = 0; j < columna; j++){
               cadena += "[" + matriz[i][j] + "]";
           }
           cadena += "\n";
       }
       return cadena;
   }
    
   public int rowProduct(int[][]matriz1, int[][] matriz2, int k, int i, int j){
       int producto = 0;      
       if (k != matriz2.length-1){
           producto += rowProduct(matriz1, matriz2, k+1, i, j);
       }
           producto += matriz1[i][k] * matriz2[k][j];
       return producto;
   }
   /*
   En este metodo se valida si las dimensiones de las matrices son correspondientes de acuerdo a las instrucciones (m x n && n x w)
   y de acuerdo a esas condiciones se realiza una de dos operaciones: se llama nuevamente el metodo a si mismo sumandole 1 a i y se le suma a producto
   se llama el metodo a si mismo con los parametros tal y como aparecen en las instrucciones
   */
   
   public int[][] multiplicacion(int[][]matriz1, int[][]matriz2, int[][]producto, int i, int j){
       producto[i][j] = rowProduct(matriz1, matriz2, 0, i, j);
           if (j != 0){
               multiplicacion(matriz1, matriz2, producto, i, j-1);
           } else if (i != 0){
               multiplicacion(matriz1, matriz2, producto, i-1, producto[0].length-1);
           }
       return producto;
   }
   /*
   En este metodo, se llena primero el primer valor de la matriz (por lo cual se llena que i de acuerdo con la sumatoria sea 0, mientras que el parametro del metodo i actua como j
   y el parametro j actua como k para la formula dada). Luego se llama el metodo para ir llenando el resto de la matriz producto, siempre y cuando i y j != 0, lo cual indica la posicion
   inicial, la cual ya esta llena. Para cuando se llegue nuevamente al inicio de la matriz, se retorna la matriz producto.
   */
}
