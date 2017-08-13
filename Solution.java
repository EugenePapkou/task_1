/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**this method take one-by-one digit from each number and merge it in
 * a one number (the result of merging is returned)
 * @author qt
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Solution sol = new Solution();
        sol.solution(2698, 5358);
    }
    
    int solution(int a, int b)
    {        
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        System.out.println(s1);
        System.out.println(s2);        
        char[] myCharArrayA = s1.toCharArray();
        char[] myCharArrayB = s2.toCharArray();
        int lenA = s1.length();
        int lenB = s2.length();        
        int maxLen = Math.max(lenA, lenB);
        
        String s3 = new String();
        for(int i = 0; i < maxLen; i++)
        {
            if (i < lenA)                 
                s3 = s3 + myCharArrayA[i];                                                   
            if (i < lenB)             
                s3 = s3 + myCharArrayB[i];                            
        }
        
        int c = Integer.parseInt(s3);
        System.out.println(c);
        
        return -1;
    }
    
}
