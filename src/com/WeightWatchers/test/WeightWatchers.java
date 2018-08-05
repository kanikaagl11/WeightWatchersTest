package com.WeightWatchers.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class WeightWatchers {
	static void doesFileExist(String path){
		
		try{
			File f = new File(path);	
			if (!f.isFile() && !f.canRead()) {
				throw new FileNotFoundException() ; 
			}
		
			BufferedReader b = new BufferedReader(new FileReader(f));
			String line = "";
			while ((line = b.readLine()) != null) {
				String[] wordMeaning =  line.split("–");
				System.out.println(wordMeaning[0].trim());
				String [] meanings = wordMeaning[1].split(",");
				for (String meaning: meanings){
					System.out.println(meaning.trim());
				}
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File does not exists");
		}
		catch(IOException e){		
		}	
	}
	
	static Integer samllestRandomNumber(Integer n)	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i=0;i<500; i++){
			numbers.add((int) Math.random());
		}
		Collections.sort(numbers);
	    return numbers.get(n);
	}
	
	public static void main(String[] args) {
		
		doesFileExist("/test.txt");
		
	}
}
