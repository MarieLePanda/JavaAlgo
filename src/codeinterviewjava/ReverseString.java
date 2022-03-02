/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeinterviewjava;

import java.util.Stack;

/**
 *
 * @author lgirardin
 */
public class ReverseString {
    
    //Space = O(n)
    //Time = O(n)
    public static String reverseString(String word){
        Stack<Character> resultStack = new Stack<>();
        StringBuilder result = new StringBuilder();
        //Push all caracteres in a stack
        for(int i = 0; i < word.length(); i++){
            resultStack.push(word.charAt(i));
        }
        //Pop all caractere from the stack
        for(int i = 0; i < word.length(); i++){
            result.append(resultStack.pop());
        } 
        return result.toString();
    }
    
    //Space = O(n)
    //Time = O(n)
    public static String reverseStringWithSwap(String word){
        int start = 0;
        int end = word.length()-1;
        char[] wordChar = word.toCharArray();
        while(start < end){
            char temp = wordChar[start];
            wordChar[start] = wordChar[end];
            wordChar[end] = temp;
            start++;
            end--;
        }
        return new String(wordChar);
    }
}
