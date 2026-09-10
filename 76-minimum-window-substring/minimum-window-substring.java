class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int formed = 0;
        int minLen = Integer.MAX_VALUE;
        int sLength = s.length();
        int tLength = t.length();
        int start = 0;

        HashMap<Character, Integer> need = new HashMap<>();

        for (int i = 0; i < tLength ; i++){
            char character = t.charAt(i);
            need.put(character, need.getOrDefault(character,0)+1);
        }

        HashMap<Character, Integer> currentWindow = new HashMap<>();

        for(int right = 0; right < sLength; right++){

            char ch = s.charAt(right);
            currentWindow.put(ch,currentWindow.getOrDefault(ch,0)+1);

            if(need.containsKey(ch) && need.get(ch).intValue() == currentWindow.get(ch).intValue()){
                formed ++;
            }

            while(formed == need.size()){
                int windowLength = right - left + 1;
                if(windowLength < minLen){
                    minLen = windowLength;
                    start = left;
                }
                char cha = s.charAt(left);
                currentWindow.put(cha,currentWindow.get(cha)-1);
                left++;

                if(need.containsKey(cha) && need.get(cha) > currentWindow.get(cha)){
                    formed--;
                }
            }


        }

        if (minLen == Integer.MAX_VALUE) {
               return "";
        }
        return s.substring(start,start+minLen);
    }
}