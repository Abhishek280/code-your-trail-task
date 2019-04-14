package com.pickyourtrail.developer.test.springmovietitles.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pickyourtrail.developer.test.springmovietitles.model.HackerResponse;
import com.pickyourtrail.developer.test.springmovietitles.model.TitleResponse;



@Service("MovieService")
public class MovieServiceImpl implements MovieService{

	@Value("${Movie.baseURI}")
	private String movieBaseURI;

	@Override
	public TitleResponse getTitles(String title) throws IOException {		
		TitleResponse titleResponse = new TitleResponse();
		String url = movieBaseURI + title;	
		// Calling rest template for response by passing resquest.
		RestTemplate restTemplate = new RestTemplate();	
		ResponseEntity<HackerResponse> response=  restTemplate.getForEntity(url, HackerResponse.class);
		
	    if(response.getBody()!=null) {
	    	ArrayList<String> allTitles = new ArrayList<String>();
	    	for(int i=1; i<=response.getBody().getTotal_pages();i++) {
	    	String pageUrl = movieBaseURI + title + "&page=" + i;		
	    		ResponseEntity<HackerResponse> pageResponse=  restTemplate.getForEntity(pageUrl, HackerResponse.class);
	    		ArrayList<String> string = new ArrayList<String>();
	    		int dataSize = pageResponse.getBody().getData().size();
	    		for(int j=0;j<dataSize;j++) {
	    			string.add(pageResponse.getBody().getData().get(j).Title);    			
	    		}
	    		allTitles.addAll(string);	    		
	    	}  
	    	 ArrayList<String> sortedArrayList = sortAscending(allTitles);
	    	 titleResponse.setTitle(sortedArrayList);
	    	 System.out.println("Movies List in asc order:" + sortedArrayList);
	    	return titleResponse;
	    }else {
	    	return null;
	    }	
	}
	
	public ArrayList<String> sortAscending(ArrayList<String> arrayList) {         
	    Collections.sort(arrayList);         
	    return arrayList;     
	  }   
}
