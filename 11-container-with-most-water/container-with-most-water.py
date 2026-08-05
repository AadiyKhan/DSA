class Solution:
    def maxArea(self, height: List[int]) -> int:
        left=0
        right=len(height)-1
        maxL=0
        while left<right:
            curr=min(height[right],height[left])*(right-left)
            maxL=max(maxL,curr)
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
        return maxL