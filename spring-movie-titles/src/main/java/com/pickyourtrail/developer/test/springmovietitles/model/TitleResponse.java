package com.pickyourtrail.developer.test.springmovietitles.model;

import java.util.List;

public class TitleResponse {

	private List<String> title;

	/**
	 * @return the title
	 */
	public List<String> getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(List<String> title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TitleResponse [title=" + title + "]";
	}
	
	
}
