
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer> tabelaComplementos = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complemento = target - arr[i];
            if(tabelaComplementos.containsKey(complemento)){
                int indiceComplemento = tabelaComplementos.get(complemento);
                return new int[] {i,indiceComplemento};
            } else
                tabelaComplementos.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        twoSum(new int[]{1,2,3,4}, 5);
    }
}
