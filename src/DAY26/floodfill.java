package DAY26;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int start = image[sr][sc];
        if (start == color) return image;
        dfs(image, sr, sc, start, color);
        return image;
    }
    private void dfs(int[][] image, int r, int c, int start, int color) {
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length || image[r][c] != start) return;
        image[r][c] = color;
        dfs(image, r+1, c, start, color);
        dfs(image, r-1, c, start, color);
        dfs(image, r, c+1, start, color);
        dfs(image, r, c-1, start, color);
    }
}

