

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // The key is the ASCII-sorted version of the word.
        // The value is a List that stores all words that share that key.
        HashMap<String, List<String>> group = new HashMap<>();

        for (String str : strs) {// directly grabbing the value at each index within the array

            char[] chars = str.toCharArray();// this turns the word into a char array.

            Arrays.sort(chars);// Sorting the word into ASCII order

            String key = new String(chars);// Create a string of the ASCII ordered word.

            if (group.containsKey(key)) {// checking to see if it already has that word as a key

                group.get(key).add(str);// get the List belonging to the key and add the new anagram to that List

            } else {

                group.put(key, new ArrayList<>());// create a new List for this key

                group.get(key).add(str);// add the current word to the new List
            }
        }

        // The values of the HashMap are already Lists containing the grouped anagrams,
        // so we can directly add each List to the final result.
        List<List<String>> result = new ArrayList<>();

        for (List<String> value : group.values()) {// .values() gives us each List stored in the HashMap

            result.add(value);// add each List of anagrams to the overall result
        }

        return result;
    }
}
