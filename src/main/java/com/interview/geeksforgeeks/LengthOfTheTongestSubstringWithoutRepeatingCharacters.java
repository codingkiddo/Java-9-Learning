package com.interview.geeksforgeeks;


//
//Given a string str, find the length of the longest substring without repeating characters. 
//
//Example:
//
//For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.
//
//For “BBBB” the longest substring is “B”, with length 1.
//
//For “GEEKSFORGEEKS”, there are two longest substrings shown in the below diagrams, with length 7
//

public class LengthOfTheTongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		
//		String str = "geeksforgeeks";
		String str = "bbbb";
	    System.out.println("The input string is " + str);
	 
	    int len = longestUniqueSubsttr(str);
	     
	    System.out.println("The length of the longest " +
	                       "non-repeating character " +
	                       "substring is " + len);
		
	}

	// Returns length of the longest substring
	// with all distinct characters.
	private static int longestUniqueSubsttr(String str) {

		int n = str.length();
		int result = 0;
		for ( int i=0; i<n; i++ ) {
			for ( int j=i; j<n; j++) {
				if (areDistinct(str, i, j)) {
					result = Math.max(result, j-i + 1);
				}
			}
		}
		
		return result;
	}

	// This function returns true if all characters in
	// str[i..j] are distinct, otherwise returns false
	private static boolean areDistinct(String str, int i, int j) {

		// Note : Default values in visited are false
		boolean visited[] = new boolean[26];
		
		for ( int k=i; k<=j; k++) {
			if(visited[str.charAt(k) - 'a'] == true) return false;
			
			visited[str.charAt(k) - 'a'] = true;
		}
		return true;
	}

}
