class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        List<List<Character>> chars = new ArrayList<List<Character>>();
        int[] checked = new int[strs.length];

        // turn each string into sorted list of chars
        for (int i=0; i<strs.length; i++){
            chars.add(getSortedCharList(strs[i]));
        }

        for (int i = 0; i<chars.size(); i++){
            List<String> anagrams = new ArrayList<String>();
            if (checked[i] == 1){
                continue;
            }
            checked[i] = 1;
            anagrams.add(strs[i]);
            for (int j=i+1; j<chars.size(); j++){
                if (checked[j] != 1){
                    if (chars.get(i).equals(chars.get(j))){
                        anagrams.add(strs[j]);
                        checked[j] = 1;
                    }
                }
            }
            result.add(anagrams);
        }
        return result;
    }

    private List<Character> getSortedCharList(String str){
        List<Character> charList = new ArrayList<Character>();
        for (char c: str.toCharArray()){
            charList.add(c);
        }
        Collections.sort(charList);
        return charList;
    }
}
