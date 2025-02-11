class Solution:
    def romanToInt(self, s: str) -> int:
        sum = 0
        prev_value = 0
        
        for i in range(len(s) - 1, -1, -1):  # Iterate from right to left
            curr_value = self.get_value(s[i])

            # If previous value is greater than current, subtract instead of adding
            if curr_value < prev_value:
                sum -= curr_value
            else:
                sum += curr_value

            prev_value = curr_value
        
        return sum

    def get_value(self, ch: str) -> int:
        values = {
            'I': 1, 'V': 5, 'X': 10, 'L': 50,
            'C': 100, 'D': 500, 'M': 1000
        }
        return values.get(ch, 0)  # Default to 0 for invalid input (shouldn't happen)
