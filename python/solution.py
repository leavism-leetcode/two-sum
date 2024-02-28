from collections import defaultdict
from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # <number, index>
        seen = defaultdict(int)

        for index, number in enumerate(nums):
            if target - number in seen.keys():
                return [index, seen[target - number]]
            
            seen[number] = index
        
        return []