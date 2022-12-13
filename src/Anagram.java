
/*
Examples
str1 = "LOVE"
str2 = "OLEV" or str2 = "EVOL" or str2 = "VOLE"
*/

import java.util.HashMap;
import java.util.Map;

public class Anagram{

        public static void main(String[] args) {
            System.out.println("Is Anagram: " + anagram("LOVEL","OLEVL"));
        }


        public static boolean anagram(String str1, String str2){
            if(str1.length() != str2.length()) return false;
            System.out.println("Map1:");
            Map<Character,Integer> map1 = fillMap(str1);
            System.out.println("Map2:");
            Map<Character,Integer> map2 = fillMap(str2);

            return map1.equals(map2);
        }

        public static Map<Character,Integer> fillMap(String str){
            Map<Character,Integer> map = new HashMap<>();
            for (int i=0; i < str.length(); i++){

                if(map.containsKey(str.charAt(i))){
                    Integer currentValue = map.get(str.charAt(i));
                    map.replace(str.charAt(i), currentValue + 1);
                }else{
                    map.put(str.charAt(i),1);
                }

            }
            System.out.println(map);
            return map;
        }


    }



