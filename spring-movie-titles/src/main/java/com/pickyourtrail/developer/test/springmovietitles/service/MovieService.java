package com.pickyourtrail.developer.test.springmovietitles.service;

import java.io.IOException;

import com.pickyourtrail.developer.test.springmovietitles.model.TitleResponse;

public interface MovieService {
	
	public TitleResponse getTitles(String title) throws IOException;

}
