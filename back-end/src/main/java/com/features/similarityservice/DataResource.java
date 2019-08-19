package com.features.similarityservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DataResource {

	@PostMapping("get-freq-simil")
	public OutputData generateOutputData(@RequestBody InputData input){
		OutputData output= new OutputData();
		try {
			
			String keyword = (input.getKeyword()).trim();
			String entryText = input.getEntryText();
			
			if (!keyword.isEmpty()) {
				output.setKeyword(keyword);
				output.executeDataAnalysis(entryText);
			}
				
		}
		catch (Exception e) {
			output.setKeyword("Impossible to handle request: " + e.getMessage());
			return output;
		}
		
		return output;
		
	}
		
}
