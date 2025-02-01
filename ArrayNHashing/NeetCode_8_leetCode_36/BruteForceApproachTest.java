package ArrayNHashing.NeetCode_8_leetCode_36;

import java.util.*;
/*
 * Time complexity O(n^2)
 * Space Complexity O(n)
 */
class SolutionBruteForceApproachTest {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hset = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.')
                    continue;
                if (hset.contains(board[i][j])) {
                    return false;
                }
                hset.add(board[i][j]);
            }
            hset.clear();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == '.')
                    continue;
                if (hset.contains(board[j][i])) {
                    return false;
                }
                hset.add(board[j][i]);
            }
            hset.clear();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                // System.out.print("["+(((i/3)*3)+(j/3))+" "+(((i%3)*3)+(j%3))+"] = ");
                if (board[((i / 3) * 3) + (j / 3)][((i % 3) * 3) + (j % 3)] == '.')
                    continue;
                if (hset.contains(board[((i / 3) * 3) + (j / 3)][((i % 3) * 3) + (j % 3)])) {
                    return false;
                }
                hset.add(board[((i / 3) * 3) + (j / 3)][((i % 3) * 3) + (j % 3)]);
            }
            // System.out.println();
            hset.clear();
        }
        return true;
    }
}

public class BruteForceApproachTest {
    public static void main(String[] args) {
        SolutionBruteForceApproachTest solution = new SolutionBruteForceApproachTest();
        char[][] input1 = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        System.err.println("Input : " + Arrays.deepToString(input1));
        System.out.println("Output : " + solution.isValidSudoku(input1));
        System.out.println("-----------------------------------------------------");
        char[][] input2 = { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        System.err.println("Input : " + Arrays.deepToString(input2));
        System.out.println("Output : " + solution.isValidSudoku(input2));
        System.out.println("-----------------------------------------------------");

    }
}
