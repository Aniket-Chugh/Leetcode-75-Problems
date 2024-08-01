class Solution {
    public String mergeAlternately(String word1, String word2) {
     String newStr = "";
            int MinLenght = Math.min(word1.length(), word2.length());
            for(int i=0;i<MinLenght;i++){
                String newString = word1.substring(i,i+1) + word2.substring(i,i+1); 
                newStr += newString;   
            }
    
            if (word1.length() > word2.length()) {
                newStr += word1.substring(MinLenght);
            } else {
                newStr  += word2.substring(MinLenght);
            }
            
     return newStr;
    }
}
