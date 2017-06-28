package com.gsmggk.mypacker.service;

import com.gsmggk.mypacker.model.Item;

public interface PackerService {
	void open();

	void update();

	void close();

	void zip(Item item);

}
