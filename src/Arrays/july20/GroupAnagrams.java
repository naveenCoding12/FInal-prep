package Arrays.july20;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String> > map=new HashMap<>();

        for (String words:strs){
            char [] chars=words.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);

            map.computeIfAbsent(key,k -> new ArrayList<>()).add(words);
        }
        System.out.println(new ArrayList<>(map.values()));
    }
}
