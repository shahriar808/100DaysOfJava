package Java100;

import java.util.Arrays;

public class RotateImage {
    public int[][] rotateImage(int[][] matrix) {

        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < (len / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len - j - 1];
                matrix[i][len - j - 1] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateImage r1 =new RotateImage();
        System.out.println(Arrays.deepToString(r1.rotateImage(matrix)));
    }

}
