package com.oldtimer.engine;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class SearchBB implements Serializable {
	private static final long serialVersionUID = 1L;

	private String search;

	public String search() {
		return "index?faces-redirect=true&search=" + search;
	}
	
	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
}