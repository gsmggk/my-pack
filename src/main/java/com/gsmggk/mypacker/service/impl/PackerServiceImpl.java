package com.gsmggk.mypacker.service.impl;

import com.gsmggk.mypacker.model.Item;
import com.gsmggk.mypacker.service.PackerService;
import com.gsmggk.mypacker.utilzip.service.UtilZipService;

public class PackerServiceImpl implements PackerService {

	private UtilZipService service;
	
	@Override
	public void zip(Item item) {
		service.zipFile(item);
	}

	
	
	@Override
	public void open() {
		
		
	}

	@Override
	public void update() {
		
		
	}

	@Override
	public void close() {
		
		
	}

	
	
}
