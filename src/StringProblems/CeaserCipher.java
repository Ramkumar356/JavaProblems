package StringProblems;
import java.util.*;
import java.util.HashMap;

public class CeaserCipher {
    public static void main(String[] args){
        String output = shiftingletters("xyz",2);
        System.out.println(output);
    }
    public static String shiftingletters(String input,int key){
        HashMap<Character, Integer> map = new HashMap();
        map.put('a',0);
        map.put('b',1);
        map.put('c',2);
        map.put('d',3);
        map.put('e',4);
        map.put('f',5);
        map.put('g',6);
        map.put('h',7);
        map.put('i',8);
        map.put('j',9);
        map.put('k',10);
        map.put('l',11);
        map.put('m',12);
        map.put('n',13);
        map.put('o',14);
        map.put('p',15);
        map.put('q',16);
        map.put('r',17);
        map.put('s',18);
        map.put('t',19);
        map.put('u',20);
        map.put('v',21);
        map.put('w',22);
        map.put('x',23);
        map.put('y',24);
        map.put('z',25);
        String[] alphabets = new String[]{"abcdefghijklmnopqrstuvwxyz"};
        String shiftedString = "";

        for (int i = 0; i < input.length(); i++){
            int currentLetterIndex = map.get(input.charAt(i));
            currentLetterIndex += key;
            currentLetterIndex = currentLetterIndex % alphabets[0].length();
            shiftedString += alphabets[0].charAt(currentLetterIndex);
        }
        return shiftedString;
    }
}

// input = "xyz"
// key = 2
// output =  "zab"
// arraylist index =
// String alphabets = new String[];
// hashmap
// for loop i = 0; i < input.length
// for j = 0; j < alphabets.length
// input[i] == alphabets[j]
// return j
// x -23
// y - 24
// z - 25
// int currenINdex = (int) index.remove();
// if (currentIndex == aplhabets.length)
//
//  int shiftingINdex = currentINdex+k
//
//  shiftingIndex = shiftingindex % alaphabets.length
//  alphabets[shiftingINdex]
