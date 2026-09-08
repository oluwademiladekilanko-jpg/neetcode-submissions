class Solution {
    public boolean isAnagram(String s, String t) {
        char [] word1 = s.toCharArray();
        char [] word2 = t.toCharArray();
        if (s.length() != t.length()){
            return false;//already is fake    
        }
        int count [] = new int[26];// we set it to 0 to 25 because a to z is 26 letters. 
        for(int j = 0;word1.length>j;j++){
           count[word1[j] - 'a']++;//this works because A is the lowest value in ASCII alphabet
           count[word2[j] - 'a']--;
        }
        for(int k = 0;count.length>k;k++){
            if(count[k] != 0){
                return false;
            }    
        }
        
        return true;
    }
}
