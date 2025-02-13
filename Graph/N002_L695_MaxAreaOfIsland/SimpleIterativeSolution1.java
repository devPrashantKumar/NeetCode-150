package Graph.N002_L695_MaxAreaOfIsland;

import java.util.Arrays;

class SolutionSimpleIterativeSolution1 {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    int area = dfsTraversal(grid, i, j, visited);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    public int dfsTraversal(int[][] grid, int row, int column, boolean[][] visited) {
        visited[row][column] = true;
        int leftDFSArea = 0, rightDFSArea = 0, upDFSArea = 0, downDFSArea = 0;
        if (row - 1 >= 0 && grid[row - 1][column] == 1 && !visited[row - 1][column]) {
            upDFSArea = dfsTraversal(grid, row - 1, column, visited);
        }
        if (column - 1 >= 0 && grid[row][column - 1] == 1 && !visited[row][column - 1]) {
            leftDFSArea = dfsTraversal(grid, row, column - 1, visited);
        }
        if (row + 1 < grid.length && grid[row + 1][column] == 1 && !visited[row + 1][column]) {
            downDFSArea = dfsTraversal(grid, row + 1, column, visited);
        }
        if (column + 1 < grid[0].length && grid[row][column + 1] == 1 && !visited[row][column + 1]) {
            rightDFSArea = dfsTraversal(grid, row, column + 1, visited);
        }
        return leftDFSArea + rightDFSArea + upDFSArea + downDFSArea + 1;
    }
}

public class SimpleIterativeSolution1 {
    public static void main(String[] args) {
        SolutionSimpleIterativeSolution1 solution = new SolutionSimpleIterativeSolution1();
        int[][] grid1 = {
                { 0, 1, 1, 0, 1 },
                { 1, 0, 1, 0, 1 },
                { 0, 1, 1, 0, 1 },
                { 0, 1, 0, 0, 1 }
        };

        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.deepToString(grid1));
        System.out.println("Output : " + solution.maxAreaOfIsland(grid1));
    }

}
