class HappyNumber {
    public void solve(int n, StringBuilder curr, String[] result, int k, int[] count) {
        if (curr.length() == n) {
            count[0]++;
            if(count[0]==k){
                result[0] = curr.toString();
            }
            return;
        }   
        for (char ch = 'a'; ch <= 'c'; ch++) {
            if (curr.length() > 0 && curr.charAt(curr.length() - 1) == ch)
                continue;           
            
            curr.append(ch);

            
            solve(n, curr, result,k,count);
            if (!result[0].isEmpty()) return;
            curr.deleteCharAt(curr.length() - 1);
        }
    }
    public String getHappyString(int n, int k) {
        StringBuilder curr = new StringBuilder();
        String[] result = {""};
        int[] count = {0};
        solve(n, curr, result,k,count);
        return result[0];
    }
}