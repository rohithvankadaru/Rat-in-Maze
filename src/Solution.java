import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> findSum(int[][] grid, int n) {

        ArrayList<String> ans = new ArrayList<>();

        return dfs(grid,0, 0, ans, "", n);
    }

    private static ArrayList<String> dfs(int[][] grid, int i, int j, ArrayList<String> ans, String s, int n){
        if(i < 0 || j < 0 || i >= n || j >= n || grid[i][j] == 0) return null;
        if(i == n-1 && j == n-1){
            ans.add(s);
            return ans;
        }

        grid[i][j] = 0;
        dfs(grid, i, j+1, ans, s+'R', n);
        dfs(grid, i+1, j, ans, s+'D', n);
        dfs(grid, i, j-1, ans, s+'L', n);
        dfs(grid, i-1, j, ans, s+'U', n);

        grid[i][j] = 1;
        return ans;

    }
}