package Graph.N001_L200_NumberOfIslands;

import java.util.Arrays;

class SolutionSimpleIterativeSolution1 {
    public int numIslands(char[][] grid) {
        return 0;
    }
}

public class SimpleIterativeSolution1 {
    public static void main(String[] args) {
        SolutionSimpleIterativeSolution1 solution = new SolutionSimpleIterativeSolution1();
        char[][] grid1 = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
          };
        char[][] grid2 = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
          };
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.deepToString(grid1));
        System.out.println("Output : " + solution.numIslands(grid1));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.deepToString(grid2));
        System.out.println("Output : " + solution.numIslands(grid2));
        System.out.println("---------------------------------------------------");
    }

}
