package com.pickyourtrail.developer.test.springmovietitles.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pickyourtrail.developer.test.springmovietitles.model.TitleResponse;
import com.pickyourtrail.developer.test.springmovietitles.service.MovieService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@ApiOperation(value = "Get Movie Titles", notes = "Get all titles with the request name", response = TitleResponse.class)
	@RequestMapping(value = "/title/{name}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TitleResponse> getMovieTitles(@PathVariable("name") String name) throws IOException {
		TitleResponse response = movieService.getTitles(name);
		return new ResponseEntity<TitleResponse>(response, HttpStatus.OK);
	}

}
