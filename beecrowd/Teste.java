public class Teste{

    public static void main(String[] args) {
        
    }

    boolean buscaBinaria(int[] arr, int key, int i, int j){
        if( j < i){
            return false;
        }

        int meio = (int) (j - i + 1)/2;
        if(key == arr[meio]){
            return true;
        }else if(key < arr[meio]){
            return buscaBinaria(arr, key, i, meio - 1);
        }else {
            return buscaBinaria(arr, key, meio + 1, j);
        }
    }
}