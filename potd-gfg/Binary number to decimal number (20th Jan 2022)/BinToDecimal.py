class Solution:
	def binary_to_decimal(self, str):
        p, ans = 0, 0
        for c in str[::-1]:
            ans += int(c) * pow(2, p)
            p += 1
        return ans