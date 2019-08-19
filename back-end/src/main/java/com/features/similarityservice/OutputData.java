package com.features.similarityservice;

import java.util.ArrayList;
import java.util.List;

public class OutputData extends Data {

	private String keyword;
	private int frequency;
	List<String> similarWords;
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public List<String> getSimilarWords() {
		return similarWords;
	}
	public void setSimilarWords(List<String> similarWords) {
		this.similarWords = similarWords;
	}
	
	public void executeDataAnalysis(String entryText) {
		
		similarWords = new ArrayList<String>();
	    String[] tokens = entryText.split("\\W");
	    
	    for (String token : tokens) {
	    
	      token.trim();
	      if(!token.isEmpty()) {
		      if (token.equals(keyword)) {
		    	  frequency++;
		      }
		      
		      else {
			      if (calculateLevDistance(keyword, token) == 1) {
			    	  similarWords.add(token);
			      }
		      }
	      }
	      
	    }
		
	}
		
	private int calculateLevDistance(String string1, String string2) {
   
        int[][] distance = new int[string1.length() + 1][string2.length() + 1];        
                                                                                 
        for (int i = 0; i <= string1.length(); i++)                                 
            distance[i][0] = i;                                                  
        for (int j = 1; j <= string2.length(); j++)                                 
            distance[0][j] = j;                                                  
                                                                                 
        for (int i = 1; i <= string1.length(); i++)                                 
            for (int j = 1; j <= string2.length(); j++)                             
                distance[i][j] = minimum(                                        
                        distance[i - 1][j] + 1,                                  
                        distance[i][j - 1] + 1,                                  
                        distance[i - 1][j - 1] + ((string1.charAt(i - 1) == string2.charAt(j - 1)) ? 0 : 1));
                                                                                 
        return distance[string1.length()][string2.length()];
        
	}
	
    private static int minimum(int a, int b, int c) {                            
        return Math.min(Math.min(a, b), c);                                      
    }  
			
}
