package arrays_and_strings;

import java.util.Arrays;

public class StringOperations {
	
	
	/**
	 * Reverse a string without using inbuilt functions
	 * @param String to be reversed
	 * @return reversed string
	 */
	public String reverse(String s){
		StringBuilder rev=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--){
			rev.append(s.charAt(i));
		}
		System.out.println(rev.toString());
		
		return rev.toString();
	}
	/**
	 * Recursively reverse string 
	 * @param String to be reversed
	 * @return reversed string
	 */
	public String reverseRecursive(String s){
		//base condition
		if(s.length()==0){
			return "";
		}
		return s.charAt(s.length()-1)+reverseRecursive(s.substring(0, s.length()-1));
	}
	
	/**
	 * Checks if string is palindrome or not
	 * @param String to check
	 * @return true if palindrome
	 */
	public boolean isPalindrome(String s){
		int length=s.length();
		for(int i=0;i<(length/2);i++){
			if(s.charAt(i)!=s.charAt(length-i-1)){
				return false;
			}
		}
		return true;
	}
	/**
	 * Check if all characters in the string are unique.
	 * @param Input String
	 */
	public boolean isUnique(String s){
		
		boolean chars[]=new boolean[256];
		for(int i=0;i<s.length();i++){
			int ascii=s.charAt(i);
			if(chars[ascii]){
				return false;
			}
			chars[ascii]=true;
		}
		return true;
	}
	/**
	 * Check if two strings are anagrams of each other.
	 * @param First String.
	 * @param Second String.
	 * @return true if they are anagrams.
	 * Anagram of a string is a another string containing same characters.
	 */
	public boolean anagrams(String s1, String s2){
		
		
		return false;
	}
	

}
