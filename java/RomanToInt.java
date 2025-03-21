class RomanToInt {
    public int romanToInt(String s) {
       int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = getValue(s.charAt(i));

            // If previous value is greater than current, subtract instead of adding (e.g., IV -> 4)
            if (currValue < prevValue) {
                sum -= currValue;
            } else {
                sum += currValue;
            }
            prevValue = currValue;
        }
        return sum;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // This case should not happen with valid input
        }

    }
}
