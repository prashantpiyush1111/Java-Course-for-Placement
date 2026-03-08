
public class SeachinSortedMatrix {
    public static boolean stairSearch(int matrix[][],int key){
        int row=0;int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
        if(matrix[row][col]==key){
            System.out.println("Found at index (" + row + ","+ col + ")");
            return true;
        }
        else if(key<matrix[row][col]){
            col--;
        }
        else{
            row++;
        } 
    }
    System.out.println("NOT FOUND");
    return false;
}
public static void main(String[] args) {
    int matrix[][]={{1,2,3,10},
                    {4,5,6,11},
                    {7,8,9,22},
                    {23,34,45,56}
                    };
    stairSearch(matrix, 8);
}
}