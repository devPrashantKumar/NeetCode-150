package Graph.N001_L200_NumberOfIslands;

import java.util.Arrays;

class SolutionSimpleIterativeSolution1 {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int connectedComponents = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    connectedComponents++;
                    dfsTraversal(grid, i, j, visited);
                }
            }
        }
        return connectedComponents;
    }

    public void dfsTraversal(char[][] grid, int row, int column, boolean[][] visited) {
        visited[row][column] = true;
        if (row - 1 >= 0 && grid[row - 1][column] == '1' && !visited[row - 1][column]) {
            dfsTraversal(grid, row - 1, column, visited);
        }
        if (column - 1 >= 0 && grid[row][column - 1] == '1' && !visited[row][column - 1]) {
            dfsTraversal(grid, row, column - 1, visited);
        }
        if (row + 1 < grid.length && grid[row + 1][column] == '1' && !visited[row + 1][column]) {
            dfsTraversal(grid, row + 1, column, visited);
        }
        if (column + 1 < grid[0].length && grid[row][column + 1] == '1' && !visited[row][column + 1]) {
            dfsTraversal(grid, row, column + 1, visited);
        }
    }
}

public class SimpleIterativeSolution1 {
    public static void main(String[] args) {
        SolutionSimpleIterativeSolution1 solution = new SolutionSimpleIterativeSolution1();
        char[][] grid1 = {
                { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' }
        };
        char[][] grid2 = {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
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
