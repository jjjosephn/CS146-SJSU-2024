public class hw11{
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currentColor = image[sr][sc];
        int maxHeight = image.length;
        int maxWidth = image[0].length;

        dfs(image, sr, sc, maxHeight, maxWidth, currentColor, color);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int maxHeight, int maxWidth, int currentColor, int color){
        if (sr < 0 || sr >= maxHeight || sc < 0 || sc >= maxWidth || currentColor != image[sr][sc] || currentColor == color){
            return;
        }
        
        image[sr][sc] = color;
        dfs(image, sr - 1, sc, maxHeight, maxWidth, currentColor, color);
        dfs(image, sr, sc + 1, maxHeight, maxWidth, currentColor, color);
        dfs(image, sr + 1, sc, maxHeight, maxWidth, currentColor, color);
        dfs(image, sr, sc - 1, maxHeight, maxWidth, currentColor, color);
    }
}
