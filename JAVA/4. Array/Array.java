public class Array {
    public static void main(String[] args){

        //1. Simple array
        int[] Score = {88,85,90};
        System.out.println(Score[0]);

        //2. For Loop
        // Print values in Array
        for(int i : Score){
            System.out.println(i);
        };

        //3. 2-d Array
        int[][] matrix  = {{8,5},{8,9}};
        System.out.println(matrix[0][0] + "," +  matrix[0][1]);
    }
}