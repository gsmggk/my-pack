package com.gsmggk.mypacker.model;

public class Item {

	private String path;

	private Integer unpackedSize;

	private Status status;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getUnpackedSize() {
		return unpackedSize;
	}

	public void setUnpackedSize(Integer unpackedSize) {
		this.unpackedSize = unpackedSize;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	

}
