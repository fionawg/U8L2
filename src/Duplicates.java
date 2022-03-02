import java.util.Arrays;
public class Duplicates {
    public boolean hasDuplicate(int[][] array){
        int compare;
        int[][] newArr = new int[array[0].length][array.length];
        for (int column = 0; column < array[0].length; column++){
            for (int row = 0; row < array.length; row++){
                newArr[column][row] = array[row][column];
            }
        }
        for (int[] i : newArr){
            for (int j = 0; j < newArr[0].length; j++){
                compare = i[j];
                for (int k = 0; k < newArr[0].length; k++){
                    if (compare == i[k] && j != k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
