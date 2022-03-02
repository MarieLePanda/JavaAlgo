/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeinterviewjava;

/**
 *
 * @author lgirardin
 */
public class LengthOfWord {
    
    //Space = O(1)
    //Time = O(n)
    public static int lengthOfWord(String sentence){
        int count=0;
        int stringSize = sentence.length();
        
        for(int i =0; i < sentence.length(); i++){
            char c = sentence.charAt(i);

            if(sentence.charAt(i) != ' '){
                count++;
            }else{
                for(; i < sentence.length() && sentence.charAt(i) == ' '; i++){
                    c = sentence.charAt(i);
                }
                
                if(i == sentence.length())
                        return count;
                else
                    count = 1;
            }
        }
        return count;
    }
    
}
