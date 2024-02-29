class hw8:
    def longestPalindrome(self, s):
        chars1 = [0] * 128

        for c in s:
            chars1[ord(c)] += 1

        res = 0

        for c in chars1:
            res += c // 2 * 2
            if res % 2 == 0 and c % 2 == 1:
                res += 1
        return res


