package arrays;

public class SearchInMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
         int row=0;
         int col=matrix[0].length-1;

         while (row <matrix.length && col>=0)
         {
             if (matrix[row][col]==target)
             {
                 return true;
             }else if(matrix[row][col]> target)
             {
                 col--;
             }else
             {
                 row++;
             }
         }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
                          };
        System.out.println(searchMatrix(matrix,35));
    }
}
