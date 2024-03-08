class lab5:
   def isValidBST(self, root):
        def validBst(node, min, max):
            if node == None:
                return True
            
            if not (node.val > min and node.val < max):
                return False

            return (validBst(node.left, min, node.val) and validBst(node.right, node.val, max))

        return validBst(root, float("-inf"), float("inf"))
