import java.util.*;   //* is used to call all the classes of the util package 

public class Anagrams {     //Class To show demo of Anagrams

    public static void main(String args[]){
    groupAnagramWords();     //Declaration of Static method of static function 
    }
    public static void groupAnagramWords ()    //Defining method declared above
{
    	String[] words = {"listen", "pot","part","opt","trap","silent","top","this","hello","hits","what", "shit"};   //Array of strings defined

    	HashMap<Integer, List> hm = new HashMap <Integer, List> ();   //List to sort all the words

    	for(String val:words){    //for all the stings in array words 
    		int hash = getHash(val);	

//Created object of list class
    		List wordList = new ArrayList ();

    		if (hm.containsKey(hash))    //hm is the object of class HashMap
    			{
    				wordList = hm.get(hash);   //getting list of all the elements in hm object
    				wordList.add(val);   //adding to the wordlist
    				hm.put(hash,wordList );
    			}
    		else
    			{
    				wordList.add(val);
    				hm.put(hash, wordList);
    			}
    	}

    	System.out.println(hm.toString());     //printing all the values of the present in the hashMap class
}

    	static int getHash(String val){
    		char[] c = val.toCharArray();   //array c of class char
    		int hash = 0;    //initialized value of int
    			for(char ch:c){     //work like foreach loop
    				String sc = String.valueOf(ch);      //getting value of object sc of class String 
    				hash=hash+sc.hashCode();		//getting hash code of the object
    			}
    			return hash;
    	}
}

