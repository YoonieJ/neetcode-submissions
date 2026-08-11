class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_map = {}
        t_map = {}
        for char in s:
            if char not in s_map:
                s_map[char] = 1
            if char in s_map:
                count = s_map.get(char)
                count += 1
                s_map[char] = count
        for char in t:
            if char not in t_map:
                t_map[char] = 1
            if char in t_map:
                count = t_map.get(char)
                count += 1
                t_map[char] = count
        if (len(s_map) != len(t_map)):
            return False
        for char in s_map:
            if s_map.get(char) != t_map.get(char):
                return False
            else:
                continue
        return True
        