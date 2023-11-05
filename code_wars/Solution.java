package code_wars;

class Solution {
//    public int lengthOfLastWord(String s) {
//    	String s2 = " ";
//        for (int i = s.length()-1; i > 1; --i) {
//        	if (s2.equals(" ")){
//	            System.out.println(s.charAt(i));    
//	            System.out.println();    
//	        }
//        }
//		return 0;  
//    }
	
	    public static int lengthOfLastWord(String s) {
	        // Split the string into words
	        String[] words = s.split(" ");
	        System.out.println(words[words.length - 1]);
	        
	        // Check if there's at least one word
	        if (words.length > 0) {
	            // Return the length of the last word
	            return words[words.length - 1].length();
	        }
	        
	        // If there are no words, return 0
	        return 0;
	    }
}