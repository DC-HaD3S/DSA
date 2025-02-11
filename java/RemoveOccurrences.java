class RemoveOccurences {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);  // Step 1: Convert `s` to `StringBuilder`
        int index = sb.indexOf(part);             // Step 2: Find the first occurrence of `part`
        
        while (index != -1) {                     // Step 3: Repeat until `part` is no longer found
            sb.delete(index, index + part.length());  // Step 4: Remove `part`
            index = sb.indexOf(part);             // Step 5: Find the next occurrence of `part`
        }
        
        return sb.toString();                     // Step 6: Convert StringBuilder back to String and return
    }
}