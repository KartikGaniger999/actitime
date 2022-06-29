package com.actitime.pom;import org.apache.poi.hslf.record.TextCharsAtom;

public class FirstLetterOfWords {

	public static void main(String[] args) {
String name="my name is Kartik";
String[] words = name.split(" ");

for(String word:words)
{
	String letter="";
		char firstLetter=word.charAt(0);
		letter=firstLetter+" ";
	System.out.print(letter);
}
	}

}
