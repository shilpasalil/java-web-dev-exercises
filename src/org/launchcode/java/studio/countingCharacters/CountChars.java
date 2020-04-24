package org.launchcode.java.studio.countingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String enterString;
        HashMap<Character, Integer> characterCount = new HashMap<>();
        //create hashmap to store count
        System.out.println("Enter a string: ");
        enterString = input.nextLine();
        System.out.println("your string is : "+ enterString);

        //convert the entered string to character array
        char[] charactersInString = enterString.toCharArray();

        //loop thru each character in the char array

        for(char character : charactersInString){
            //if character exists in hashmap
            if (characterCount.containsKey(character)){
                //add 1 to the value of the key that already exists
                characterCount.put(character, characterCount.get(character)+1);
            }
            else{
                //add character as key with value 1
                characterCount.put(character, 1);
            }
        }
        //loop thru hashmap
        // print key : value
        for (Map.Entry<Character, Integer> charPair : characterCount.entrySet()) {
            System.out.println(charPair.getKey() + " : " + charPair.getValue());
        }
    }
}
