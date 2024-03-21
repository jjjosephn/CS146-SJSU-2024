class hw11:
    def floodFill(self, image, sr, sc, color):
        currentColor = image[sr][sc]
        maxHeight = len(image)
        maxWidth = len(image[0])

        def dfs(sr, sc):
            if sr < 0 or sr >= maxHeight or sc < 0 or sc >= maxWidth or image[sr][sc] != currentColor or currentColor == color:
                return
            image[sr][sc] = color
            dfs(sr - 1, sc)
            dfs(sr, sc + 1)
            dfs(sr + 1, sc)
            dfs(sr, sc - 1)
        dfs(sr,sc)
        
        return image
        



