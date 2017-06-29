package com.gsmggk.mypacker.model;

import java.util.Collection;

public class Batch {
    String path;
	Boolean enctypt;
	Collection<Item> items;
	Status status;
	

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Boolean getEnctypt() {
		return enctypt;
	}

	public void setEnctypt(Boolean enctypt) {
		this.enctypt = enctypt;
	}

	public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}

}
